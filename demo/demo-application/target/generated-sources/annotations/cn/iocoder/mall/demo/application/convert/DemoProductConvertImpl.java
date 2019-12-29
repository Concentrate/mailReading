package cn.iocoder.mall.demo.application.convert;

import cn.iocoder.mall.demo.application.vo.DemoProductVO;
import cn.iocoder.mall.demo.business.bo.DemoProductBO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-10T18:47:30+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class DemoProductConvertImpl implements DemoProductConvert {

    @Override
    public DemoProductVO convert(DemoProductBO object) {
        if ( object == null ) {
            return null;
        }

        DemoProductVO demoProductVO = new DemoProductVO();

        return demoProductVO;
    }
}
