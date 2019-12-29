package cn.iocoder.mall.admin.convert;

import cn.iocoder.common.framework.vo.PageResult;
import cn.iocoder.mall.admin.api.bo.deptment.DeptmentBO;
import cn.iocoder.mall.admin.api.dto.depetment.DeptmentAddDTO;
import cn.iocoder.mall.admin.api.dto.depetment.DeptmentUpdateDTO;
import cn.iocoder.mall.admin.dataobject.DeptmentDO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-10T18:47:17+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class DeptmentConvertImpl implements DeptmentConvert {

    @Override
    public DeptmentDO convert(DeptmentAddDTO deptmentAddDTO) {
        if ( deptmentAddDTO == null ) {
            return null;
        }

        DeptmentDO deptmentDO = new DeptmentDO();

        deptmentDO.setName( deptmentAddDTO.getName() );
        deptmentDO.setSort( deptmentAddDTO.getSort() );
        deptmentDO.setPid( deptmentAddDTO.getPid() );

        return deptmentDO;
    }

    @Override
    public DeptmentBO convert(DeptmentDO deptmentDO) {
        if ( deptmentDO == null ) {
            return null;
        }

        DeptmentBO deptmentBO = new DeptmentBO();

        deptmentBO.setId( deptmentDO.getId() );
        deptmentBO.setName( deptmentDO.getName() );
        deptmentBO.setSort( deptmentDO.getSort() );
        deptmentBO.setPid( deptmentDO.getPid() );
        deptmentBO.setCreateTime( deptmentDO.getCreateTime() );
        deptmentBO.setUpdateTime( deptmentDO.getUpdateTime() );

        return deptmentBO;
    }

    @Override
    public PageResult<DeptmentBO> convert(IPage<DeptmentDO> list) {
        if ( list == null ) {
            return null;
        }

        PageResult<DeptmentBO> pageResult = new PageResult<DeptmentBO>();

        pageResult.setList( convert( list.getRecords() ) );
        pageResult.setTotal( (int) list.getTotal() );

        return pageResult;
    }

    @Override
    public List<DeptmentBO> convert(List<DeptmentDO> list) {
        if ( list == null ) {
            return null;
        }

        List<DeptmentBO> list1 = new ArrayList<DeptmentBO>( list.size() );
        for ( DeptmentDO deptmentDO : list ) {
            list1.add( convert( deptmentDO ) );
        }

        return list1;
    }

    @Override
    public DeptmentDO convert(DeptmentUpdateDTO deptmentUpdateDTO) {
        if ( deptmentUpdateDTO == null ) {
            return null;
        }

        DeptmentDO deptmentDO = new DeptmentDO();

        deptmentDO.setId( deptmentUpdateDTO.getId() );
        deptmentDO.setName( deptmentUpdateDTO.getName() );
        deptmentDO.setSort( deptmentUpdateDTO.getSort() );
        deptmentDO.setPid( deptmentUpdateDTO.getPid() );

        return deptmentDO;
    }
}
