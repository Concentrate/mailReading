package cn.iocoder.mall.admin.insertdatabase;

import cn.iocoder.mall.admin.SystemApplicationTest;
import cn.iocoder.mall.admin.dao.RoleMapper;
import cn.iocoder.mall.admin.dataobject.RoleDO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liudeyu on 2020/1/2.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SystemApplicationTest.class)
public class RoleInsertData {

    @Autowired
    RoleMapper roleMapper;

    List<RoleDO> needToInsert = new ArrayList<>();

    @Before
    public void beforeTest() {
        needToInsert.add(new RoleDO().setName(RoleDO.RoleDoConstants.SUPER_ADMIN));
        needToInsert.add(new RoleDO().setName(RoleDO.RoleDoConstants.NORMAL_ADMIN));
    }


    @Test
    public void insertTwoRole() {
        needToInsert.stream().forEach(tRole -> {
            if (roleMapper.selectOne(new QueryWrapper<RoleDO>().eq("name", tRole.getName())) == null) {
                roleMapper.insert(tRole);
            }
        });

    }

}
