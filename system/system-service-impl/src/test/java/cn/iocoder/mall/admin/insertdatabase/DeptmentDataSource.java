package cn.iocoder.mall.admin.insertdatabase;

import cn.iocoder.mall.admin.dao.DeptmentMapper;
import cn.iocoder.mall.admin.dataobject.DeptmentDO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liudeyu on 2020/1/3.
 */
public class DeptmentDataSource extends BaseTestConfigure {

    @Autowired
    DeptmentMapper deptmentMapper;

    private List<DeptmentDO> deptmentDOS = new ArrayList<>();


    @Before
    public void beforeConfigure() {
        deptmentDOS.clear();
//        deptmentDOS.add(new DeptmentDO().setName("总裁办").setPid(DeptmentDO.ROOT_DEPAR).setSort(0));
        deptmentDOS.add(new DeptmentDO().setName("IT").setSort(1));
        deptmentDOS.add(new DeptmentDO().setName("生产部").setSort(2));
        deptmentDOS.add(new DeptmentDO().setName("销售部").setSort(3));
        deptmentDOS.add(new DeptmentDO().setName("营销部").setSort(4));
    }


    @Test
    public void insertDeparment() {
        DeptmentDO ceoDe = new DeptmentDO().setName("总裁办").setPid(DeptmentDO.ROOT_DEPAR).setSort(0);
        QueryWrapper wrapper = new QueryWrapper<>().eq("name", ceoDe.getName());
        if (deptmentMapper.selectOne(wrapper) == null) {
            deptmentMapper.insert(ceoDe);
        }

        ceoDe = deptmentMapper.selectOne(wrapper);
        DeptmentDO finalCeoDe = ceoDe;
        deptmentDOS.stream().forEach(deptmentDO -> {
            QueryWrapper tmp = new QueryWrapper<>().eq("name", deptmentDO.getName());
            if (deptmentMapper.selectOne(tmp) == null) {
                deptmentMapper.insert(deptmentDO.setPid(finalCeoDe.getId()));
            }
        });
    }


    @Test
    public void insertDeparAndRole(){

    }
}
