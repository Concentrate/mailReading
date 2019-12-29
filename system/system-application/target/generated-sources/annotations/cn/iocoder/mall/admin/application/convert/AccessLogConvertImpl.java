package cn.iocoder.mall.admin.application.convert;

import cn.iocoder.mall.admin.api.bo.systemlog.AccessLogBO;
import cn.iocoder.mall.admin.api.bo.systemlog.AccessLogPageBO;
import cn.iocoder.mall.admin.application.vo.log.AccessLogPageVo;
import cn.iocoder.mall.admin.application.vo.log.AccessLogVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-11T11:51:24+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class AccessLogConvertImpl implements AccessLogConvert {

    @Override
    public AccessLogPageVo convert(AccessLogPageBO result) {
        if ( result == null ) {
            return null;
        }

        AccessLogPageVo accessLogPageVo = new AccessLogPageVo();

        accessLogPageVo.setList( accessLogBOListToAccessLogVoList( result.getList() ) );
        accessLogPageVo.setTotal( result.getTotal() );

        return accessLogPageVo;
    }

    @Override
    public AccessLogVo convert(AccessLogBO result) {
        if ( result == null ) {
            return null;
        }

        AccessLogVo accessLogVo = new AccessLogVo();

        accessLogVo.setTraceId( result.getTraceId() );
        accessLogVo.setUserId( result.getUserId() );
        accessLogVo.setUserType( result.getUserType() );
        accessLogVo.setApplicationName( result.getApplicationName() );
        accessLogVo.setUri( result.getUri() );
        accessLogVo.setQueryString( result.getQueryString() );
        accessLogVo.setMethod( result.getMethod() );
        accessLogVo.setUserAgent( result.getUserAgent() );
        accessLogVo.setIp( result.getIp() );
        accessLogVo.setStartTime( result.getStartTime() );
        accessLogVo.setResponseTime( result.getResponseTime() );
        accessLogVo.setErrorCode( result.getErrorCode() );

        return accessLogVo;
    }

    protected List<AccessLogVo> accessLogBOListToAccessLogVoList(List<AccessLogBO> list) {
        if ( list == null ) {
            return null;
        }

        List<AccessLogVo> list1 = new ArrayList<AccessLogVo>( list.size() );
        for ( AccessLogBO accessLogBO : list ) {
            list1.add( convert( accessLogBO ) );
        }

        return list1;
    }
}
