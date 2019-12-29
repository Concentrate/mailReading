package cn.iocoder.mall.demo.business.convert;

import cn.iocoder.mall.demo.business.bo.DemoProductBO;
import cn.iocoder.mall.demo.business.dataobject.product.DemoProductDO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-11T11:51:27+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class DemoProductConvertImpl implements DemoProductConvert {

    @Override
    public DemoProductBO convert(DemoProductDO object) {
        if ( object == null ) {
            return null;
        }

        DemoProductBO demoProductBO = new DemoProductBO();

        return demoProductBO;
    }
}
