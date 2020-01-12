package cn.iocoder.mall.search.biz.dao;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class EsTest {

    /**
     * // 服务器地址
     */
    private static String host = "127.0.0.1";
    /**
     * // 端口
     */
    private static int port = 9300;
    /**
     * 创建logger
     */
    private Logger logger = LoggerFactory.getLogger(EsTest.class);


    @Test
    public void mainStart() throws IOException {
        /**
         * 创建链接
         */

        Settings settings = Settings.builder().put("cluster.name", "elasticsearch")
                .put("client.transport.sniff", true).build();
        TransportClient client2 = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));


        System.out.println("连接信息:" + client2.toString());
        IndexResponse response = client2.prepareIndex("msg", "tweet", "2").setSource(XContentFactory.jsonBuilder()
                .startObject().field("userName", "张三")
                .field("sendDate", new Date())
                .field("msg", "你好李四")
                .endObject()).get();


        System.out.println("索引名称:" + response.getIndex() + "\n类型:" + response.getType()
                + "\n文档ID:" + response.getId() + "\n当前实例状态:" + response.status());

        /**
         * 关闭连接
         */
        client2.close();
    }

    @Test
    public void listNodes() throws UnknownHostException {
        // on startup

        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));

        System.out.println("start>>>>>>>");
        System.out.println(client.listedNodes());
        client.listedNodes().stream().forEach(discoveryNode -> {
            System.out.print(discoveryNode.getName() + "\n");
        });
        System.out.println("end>>>>>>>");

        // on shutdown

        client.close();
    }

}
