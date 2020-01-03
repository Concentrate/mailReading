package cn.iocoder.mall.admin.dataobject;

import cn.iocoder.common.framework.dataobject.DeletableDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 角色实体
 */
@TableName("`role`")
@Data
@Accessors(chain = true)
public class RoleDO extends DeletableDO {

    public static class RoleDoConstants{
        public static final String NORMAL_ADMIN = "nomal";
        public static final String SUPER_ADMIN = "super";
    }

    /**
     * 角色编号
     */
    private Integer id;
    /**
     * 角色名
     */
    private String name;

}
