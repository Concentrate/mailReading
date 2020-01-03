package cn.iocoder.mall.admin.insertdatabase;

import cn.iocoder.common.framework.dataobject.BaseDO;
import cn.iocoder.mall.admin.SystemApplicationTest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;
import java.util.function.Function;

/**
 * Created by liudeyu on 2020/1/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SystemApplicationTest.class)
public class BaseTestConfigure {

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
