package cn.iocoder.mall.admin.insertdatabase;

import cn.iocoder.common.framework.mybatis.QueryWrapperX;
import cn.iocoder.common.framework.util.CollectionUtil;
import cn.iocoder.mall.admin.SystemApplicationTest;
import cn.iocoder.mall.admin.dao.*;
import cn.iocoder.mall.admin.dataobject.AdminDO;
import cn.iocoder.mall.admin.dataobject.AdminRoleDO;
import cn.iocoder.mall.admin.dataobject.RoleDO;
import cn.iocoder.mall.admin.dataobject.RoleResourceDO;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liudeyu on 2020/1/2.
 */

public class RoleInsertData extends BaseTestConfigure {

    @Autowired
    RoleMapper roleMapper;


    @Autowired
    AdminMapper adminMapper;

    @Autowired
    AdminRoleMapper adminRoleMapper;

    @Autowired
    ResourceMapper resourceMapper;


    @Autowired
    RoleResourceMapper roleResourceMapper;

    List<RoleDO> needToInsert = new ArrayList<>();
    Map<AdminDO, RoleDO> adminDORoleDOMap = new HashMap<>();

    @Before
    public void beforeTest() {
        needToInsert.add(new RoleDO().setName(RoleDO.RoleDoConstants.SUPER_ADMIN));
        needToInsert.add(new RoleDO().setName(RoleDO.RoleDoConstants.NORMAL_ADMIN));

//        insertAdminRole();


    }


    private RoleDO getSuperRole() {
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.eq("name", RoleDO.RoleDoConstants.SUPER_ADMIN);
        RoleDO superRole = roleMapper.selectOne(wrapper);
        return superRole;
    }

    private AdminDO getAdminDo() {
        String name = "admin";
        AdminDO adminDO = adminMapper.selectByUsername(name);
        return adminDO;
    }

    @Test
    public void insertAdminRole() {
        RoleDO superRole = getSuperRole();
        AdminDO adminDO = getAdminDo();
        if (adminDO != null && superRole != null) {
            adminDORoleDOMap.put(adminDO, superRole);
            Map<String, Object> testKeyValue = new HashMap<>();
            testKeyValue.put("admin_id", adminDO.getId());
            testKeyValue.put("role_id", superRole.getId());
            if (!isExistsAndMap(adminRoleMapper, testKeyValue))
                adminRoleMapper.insert(new AdminRoleDO().setAdminId(adminDO.getId()).setRoleId(superRole.getId()));
        }
    }


    @Test
    public void insertTwoRole() {
        needToInsert.stream().forEach(tRole -> {
            if (roleMapper.selectOne(new QueryWrapper<RoleDO>().eq("name", tRole.getName())) == null) {
                roleMapper.insert(tRole);
            }
        });

    }


    @Test
    public void insertResRole() {
        RoleDO superRole = getSuperRole();
        resourceMapper.selectList(new QueryWrapper<>()).stream().forEach(resourceDO -> {
            RoleResourceDO roleResourceDO = new RoleResourceDO();
            roleResourceDO.setResourceId(resourceDO.getId()).setRoleId(superRole.getId());
            Map<String, Object> testKeyValue = new HashMap<>();
            testKeyValue.put("role_id", superRole.getId());
            testKeyValue.put("resource_id", resourceDO.getId());
            if (!isExistsAndMap(roleResourceMapper, testKeyValue)) {
                roleResourceMapper.insert(roleResourceDO);
            }
        });


    }

}
