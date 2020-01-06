import cn.iocoder.mall.pay.application.PayApplication;
import cn.iocoder.mall.pay.application.utils.PayAppId;
import cn.iocoder.mall.pay.biz.dao.PayAppMapper;
import cn.iocoder.mall.pay.biz.dataobject.PayAppDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liudeyu on 2020/1/6.
 */

@SpringBootTest(classes = PayApplication.class)
@RunWith(value = SpringRunner.class)
public class InserPayBaseData {

    @Autowired
    PayAppMapper payAppMapper;


    @Test
    public void insertBaseAppId(){
        if(payAppMapper.selectById(PayAppId.APP_ID_SHOP_ORDER)==null){
            payAppMapper.insert(new PayAppDO()
            .setId(PayAppId.APP_ID_SHOP_ORDER).setName("电商")
            .setNotifyUrl("localhost").setRefundNotifyUrl("localhost"));
        }
    }
}
