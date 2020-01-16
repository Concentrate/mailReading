package cn.iocoder.mall.search.biz.dao;

import org.apache.http.HttpHost;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.main.MainResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.*;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by liudeyu on 2020/1/16.
 */


public class EsApiUsage {
    org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    private RestHighLevelClient getRestClient() {
        return new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200)));
    }


    @Test
    public void testInsert() throws IOException {
        Map<String, String> value = new HashMap<>();
        value.put("name", "phylosicfic");
        value.put("properties", "difficult and interesting");
        value.put("usage", "produce anything and build construct");
        IndexRequest indexRequest = new IndexRequest("science", "nature", "1");
        indexRequest.source(value);
        IndexResponse response = getRestClient().index(indexRequest, RequestOptions.DEFAULT);

        logger.info(response.toString());
    }


    @Test
    public void getIndex() {
        GetRequest getRequest = new GetRequest("something", "notexist", String.valueOf(1));
        try {
            getRestClient().get(getRequest, RequestOptions.DEFAULT);
        } catch (ElasticsearchException es) {
            if (es.status() == RestStatus.NOT_FOUND) {
                logger.info("not found in es");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void bulkRequestUsage() throws IOException {
        BulkRequest bulkRequest = new BulkRequest();
        bulkRequest.add(new IndexRequest("posts", "doc", "1")
                .source(XContentType.JSON, "name", "barray"));
        bulkRequest.add(new IndexRequest("posts", "doc", "2")
                .source(XContentType.JSON, "name", "barray"));
        bulkRequest.add(new IndexRequest("posts", "doc", "3")
                .source(XContentType.JSON, "name", "barray"));
        getRestClient().bulk(bulkRequest, RequestOptions.DEFAULT);

        BulkRequest request = new BulkRequest();
        request.add(new DeleteRequest("posts", "doc", "3"));
        request.add(new UpdateRequest("posts", "doc", "2")
                .doc(XContentType.JSON, "other", "test"));
        request.add(new IndexRequest("posts", "doc", "4")
                .source(XContentType.JSON, "field", "baz"));
        getRestClient().bulk(request, RequestOptions.DEFAULT);
    }


    @Test
    public void getSearchResult() throws IOException {
        SearchRequest searchRequest = new SearchRequest("posts");
        searchRequest.types("doc");
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders.termQuery("name", "barray"));
        searchRequest.source(sourceBuilder);
        SearchResponse searchResponse = getRestClient().search(searchRequest, RequestOptions.DEFAULT);
        logger.info(searchResponse.toString());

    }


    @Test
    public void matchQueryTest() throws IOException {
        SearchRequest searchRequest = new SearchRequest("posts").types("doc");
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders.matchQuery("name", "barray").fuzziness(Fuzziness.AUTO)
        ).sort(new FieldSortBuilder("_id").order(SortOrder.ASC));
        searchRequest.source(sourceBuilder);
        logger.info(getRestClient().search(searchRequest, RequestOptions.DEFAULT).toString());
    }


    @Test
    public void getEsClusInfo() throws IOException {
        MainResponse mainResponse = getRestClient().info(RequestOptions.DEFAULT);
        logger.info(mainResponse.getClusterName().toString());
    }
}
