package cn.iocoder.mall.admin.dataobject;

import cn.iocoder.common.framework.dataobject.DeletableDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Description:部门实体
 *
 * @author: zhenxianyimeng
 * @date: 2019-06-14
 * @time: 19:12
 */
@TableName("deptment")
@Data
@Accessors(chain = true)
public class DeptmentDO extends DeletableDO {



    public static final int ROOT_DEPAR = -1;
    public static final int CEO_DEPAR = 0;
    public static final int CREATE_SERVICE_DEPARMENT = 1;
    public static final int PROMOTE_DEPAR = 2;
    public static final int IT_DEPAR = 3;
    public static final int SELL_DEPAR = 4;

    /**
     * 部门编号
     */
    private Integer id;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门排序字段
     */
    private Integer sort;
    /**
     * 父级部门id
     */
    private Integer pid;

}
