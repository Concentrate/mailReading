package cn.iocoder.mall.admin.convert;

import cn.iocoder.common.framework.vo.PageResult;
import cn.iocoder.mall.admin.api.bo.systemlog.AccessLogBO;
import cn.iocoder.mall.admin.api.dto.systemlog.AccessLogAddDTO;
import cn.iocoder.mall.admin.api.dto.systemlog.ExceptionLogAddDTO;
import cn.iocoder.mall.admin.dataobject.AccessLogDO;
import cn.iocoder.mall.admin.dataobject.ExceptionLogDO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-10T18:47:17+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class AccessLogConvertImpl implements AccessLogConvert {

    @Override
    public AccessLogDO convert(AccessLogAddDTO accessLogAddDTO) {
        if ( accessLogAddDTO == null ) {
            return null;
        }

        AccessLogDO accessLogDO = new AccessLogDO();

        accessLogDO.setTraceId( accessLogAddDTO.getTraceId() );
        accessLogDO.setUserId( accessLogAddDTO.getUserId() );
        accessLogDO.setUserType( accessLogAddDTO.getUserType() );
        accessLogDO.setApplicationName( accessLogAddDTO.getApplicationName() );
        accessLogDO.setUri( accessLogAddDTO.getUri() );
        accessLogDO.setQueryString( accessLogAddDTO.getQueryString() );
        accessLogDO.setMethod( accessLogAddDTO.getMethod() );
        accessLogDO.setUserAgent( accessLogAddDTO.getUserAgent() );
        accessLogDO.setIp( accessLogAddDTO.getIp() );
        accessLogDO.setStartTime( accessLogAddDTO.getStartTime() );
        accessLogDO.setResponseTime( accessLogAddDTO.getResponseTime() );
        accessLogDO.setErrorCode( accessLogAddDTO.getErrorCode() );
        accessLogDO.setErrorMessage( accessLogAddDTO.getErrorMessage() );

        return accessLogDO;
    }

    @Override
    public ExceptionLogDO convert(ExceptionLogAddDTO exceptionLogAddDTO) {
        if ( exceptionLogAddDTO == null ) {
            return null;
        }

        ExceptionLogDO exceptionLogDO = new ExceptionLogDO();

        exceptionLogDO.setTraceId( exceptionLogAddDTO.getTraceId() );
        exceptionLogDO.setUserId( exceptionLogAddDTO.getUserId() );
        exceptionLogDO.setUserType( exceptionLogAddDTO.getUserType() );
        exceptionLogDO.setApplicationName( exceptionLogAddDTO.getApplicationName() );
        exceptionLogDO.setUri( exceptionLogAddDTO.getUri() );
        exceptionLogDO.setQueryString( exceptionLogAddDTO.getQueryString() );
        exceptionLogDO.setMethod( exceptionLogAddDTO.getMethod() );
        exceptionLogDO.setUserAgent( exceptionLogAddDTO.getUserAgent() );
        exceptionLogDO.setIp( exceptionLogAddDTO.getIp() );
        exceptionLogDO.setExceptionTime( exceptionLogAddDTO.getExceptionTime() );
        exceptionLogDO.setExceptionName( exceptionLogAddDTO.getExceptionName() );
        exceptionLogDO.setExceptionMessage( exceptionLogAddDTO.getExceptionMessage() );
        exceptionLogDO.setExceptionRootCauseMessage( exceptionLogAddDTO.getExceptionRootCauseMessage() );
        exceptionLogDO.setExceptionStackTrace( exceptionLogAddDTO.getExceptionStackTrace() );
        exceptionLogDO.setExceptionClassName( exceptionLogAddDTO.getExceptionClassName() );
        exceptionLogDO.setExceptionFileName( exceptionLogAddDTO.getExceptionFileName() );
        exceptionLogDO.setExceptionMethodName( exceptionLogAddDTO.getExceptionMethodName() );
        exceptionLogDO.setExceptionLineNumber( exceptionLogAddDTO.getExceptionLineNumber() );

        return exceptionLogDO;
    }

    @Override
    public PageResult<AccessLogBO> convert(IPage<AccessLogDO> page) {
        if ( page == null ) {
            return null;
        }

        PageResult<AccessLogBO> pageResult = new PageResult<AccessLogBO>();

        pageResult.setList( accessLogDOListToAccessLogBOList( page.getRecords() ) );
        pageResult.setTotal( (int) page.getTotal() );

        return pageResult;
    }

    protected AccessLogBO accessLogDOToAccessLogBO(AccessLogDO accessLogDO) {
        if ( accessLogDO == null ) {
            return null;
        }

        AccessLogBO accessLogBO = new AccessLogBO();

        accessLogBO.setTraceId( accessLogDO.getTraceId() );
        accessLogBO.setUserId( accessLogDO.getUserId() );
        accessLogBO.setUserType( accessLogDO.getUserType() );
        accessLogBO.setApplicationName( accessLogDO.getApplicationName() );
        accessLogBO.setUri( accessLogDO.getUri() );
        accessLogBO.setQueryString( accessLogDO.getQueryString() );
        accessLogBO.setMethod( accessLogDO.getMethod() );
        accessLogBO.setUserAgent( accessLogDO.getUserAgent() );
        accessLogBO.setIp( accessLogDO.getIp() );
        accessLogBO.setStartTime( accessLogDO.getStartTime() );
        accessLogBO.setResponseTime( accessLogDO.getResponseTime() );
        accessLogBO.setErrorCode( accessLogDO.getErrorCode() );

        return accessLogBO;
    }

    protected List<AccessLogBO> accessLogDOListToAccessLogBOList(List<AccessLogDO> list) {
        if ( list == null ) {
            return null;
        }

        List<AccessLogBO> list1 = new ArrayList<AccessLogBO>( list.size() );
        for ( AccessLogDO accessLogDO : list ) {
            list1.add( accessLogDOToAccessLogBO( accessLogDO ) );
        }

        return list1;
    }
}
