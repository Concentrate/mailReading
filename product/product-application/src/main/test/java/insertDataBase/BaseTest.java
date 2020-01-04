package insertDataBase;

import cn.iocoder.mall.product.application.ProductApplication;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * Created by liudeyu on 2020/1/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductApplication.class)
public class BaseTest {

    protected boolean isExists(BaseMapper baseMapper, String key, Object value) {
        QueryWrapper tQueryWrapper = new QueryWrapper<>().eq(key, value);
        return baseMapper.selectOne(tQueryWrapper) != null;
    }


    protected boolean isExistsAndMap(BaseMapper baseMapper, Map<String, Object> values) {
        QueryWrapper wrapper = new QueryWrapper();
        values.keySet().stream().forEach(tmpKey -> {
            wrapper.eq(tmpKey, values.get(tmpKey));
        });
        return baseMapper.selectOne(wrapper) != null;
    }

}
