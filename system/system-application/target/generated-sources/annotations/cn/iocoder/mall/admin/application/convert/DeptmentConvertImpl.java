package cn.iocoder.mall.admin.application.convert;

import cn.iocoder.common.framework.vo.PageResult;
import cn.iocoder.mall.admin.api.bo.deptment.DeptmentBO;
import cn.iocoder.mall.admin.application.vo.deptment.DeptmentVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-11T11:51:24+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class DeptmentConvertImpl implements DeptmentConvert {

    @Override
    public PageResult<DeptmentVO> convert(PageResult<DeptmentBO> pageResult) {
        if ( pageResult == null ) {
            return null;
        }

        PageResult<DeptmentVO> pageResult1 = new PageResult<DeptmentVO>();

        pageResult1.setList( convert( pageResult.getList() ) );
        pageResult1.setTotal( pageResult.getTotal() );

        return pageResult1;
    }

    @Override
    public List<DeptmentVO> convert(List<DeptmentBO> list) {
        if ( list == null ) {
            return null;
        }

        List<DeptmentVO> list1 = new ArrayList<DeptmentVO>( list.size() );
        for ( DeptmentBO deptmentBO : list ) {
            list1.add( deptmentBOToDeptmentVO( deptmentBO ) );
        }

        return list1;
    }

    protected DeptmentVO deptmentBOToDeptmentVO(DeptmentBO deptmentBO) {
        if ( deptmentBO == null ) {
            return null;
        }

        DeptmentVO deptmentVO = new DeptmentVO();

        deptmentVO.setId( deptmentBO.getId() );
        deptmentVO.setName( deptmentBO.getName() );
        deptmentVO.setSort( deptmentBO.getSort() );
        deptmentVO.setPid( deptmentBO.getPid() );
        deptmentVO.setCreateTime( deptmentBO.getCreateTime() );
        deptmentVO.setUpdateTime( deptmentBO.getUpdateTime() );

        return deptmentVO;
    }
}
