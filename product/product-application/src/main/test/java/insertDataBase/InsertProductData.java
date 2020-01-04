package insertDataBase;


import cn.iocoder.mall.product.api.constant.ProductAttrConstants;
import cn.iocoder.mall.product.api.constant.ProductCategoryConstants;
import cn.iocoder.mall.product.dao.ProductAttrMapper;
import cn.iocoder.mall.product.dao.ProductCategoryMapper;
import cn.iocoder.mall.product.dataobject.ProductCategoryDO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InsertProductData extends BaseTest {


    @Autowired
    ProductAttrMapper productAttrMapper;

    @Autowired
    ProductCategoryMapper categoryMapper;


    Map<String, List<ProductCategoryDO>> parentCatrMap = new HashMap<>();
    List<ProductCategoryDO> categoryDOList = new ArrayList<>();

    @Before
    public void beforeTest() {
        categoryDOList.add(new ProductCategoryDO().setPid(1).setName("apple").setDescription("apple")
                .setSort(1));
        categoryDOList.add(new ProductCategoryDO().setPid(1).setName("pear").setDescription("pear")
                .setSort(2));

        parentCatrMap.put("fruit", categoryDOList);

    }


    @Test
    public void insertSomeCatory() {
        parentCatrMap.keySet().forEach(tmp -> {
            if (!isExists(categoryMapper, "name", tmp)) {
                ProductCategoryDO do1 = new ProductCategoryDO().setName(tmp).setDescription(tmp)
                        .setPid(ProductCategoryConstants.PID_ROOT);
                categoryMapper.insert(do1);
            }
            ProductCategoryDO parentNode = categoryMapper.selectOne(new QueryWrapper<ProductCategoryDO>().eq("name", tmp));
            if(parentNode==null){
                return;
            }
            parentCatrMap.get(tmp).stream().forEach(node -> {
                if (!isExists(categoryMapper, "name", node.getName())) {
                    categoryMapper.insert(node.setPid(parentNode.getId()));
                }
            });
        });
    }


}
