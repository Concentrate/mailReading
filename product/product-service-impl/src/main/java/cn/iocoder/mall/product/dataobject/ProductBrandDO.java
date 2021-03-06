package cn.iocoder.mall.product.dataobject;

import cn.iocoder.common.framework.dataobject.DeletableDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Product 品牌
 */
@Data
@Accessors(chain = true)
@TableName("product_brand")
public class ProductBrandDO extends DeletableDO {

    /**
     * 规格编号
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片地址
     */
    private String picUrl;

    /**
     * 状态
     *
     * 1-开启
     * 2-禁用
     */
    private Integer status=1;

}
