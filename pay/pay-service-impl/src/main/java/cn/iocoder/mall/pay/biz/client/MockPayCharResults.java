package cn.iocoder.mall.pay.biz.client;

import com.alibaba.fastjson.JSON;
import com.pingplusplus.model.Charge;

public class MockPayCharResults {

    public static final String fakePayResultJson="{\n" +
            "  \"id\": \"ch_L8qn10mLmr1GS8e5OODmHaL4\",\n" +
            "  \"object\": \"charge\",\n" +
            "  \"created\": 1410834527,\n" +
            "  \"livemode\": true,\n" +
            "  \"paid\": false,\n" +
            "  \"refunded\": false,\n" +
            "  \"reversed\": false,\n" +
            "  \"app\": \"app_aTyfXDjrvzDSbLuz\",\n" +
            "  \"channel\": \"upacp\",\n" +
            "  \"order_no\": \"123456789\",\n" +
            "  \"client_ip\": \"127.0.0.1\",\n" +
            "  \"amount\": 100,\n" +
            "  \"amount_settle\": 100,\n" +
            "  \"currency\": \"cny\",\n" +
            "  \"subject\": \"Your Subject\",\n" +
            "  \"body\": \"Your Body\",\n" +
            "  \"extra\":{},\n" +
            "  \"time_paid\": null,\n" +
            "  \"time_expire\": 1410838127,\n" +
            "  \"time_settle\": null,\n" +
            "  \"transaction_no\": null,\n" +
            "  \"refunds\": {\n" +
            "    \"object\": \"list\",\n" +
            "    \"url\": \"/v1/charges/ch_L8qn10mLmr1GS8e5OODmHaL4/refunds\",\n" +
            "    \"has_more\": false,\n" +
            "    \"data\": [ ]\n" +
            "  },\n" +
            "  \"amount_refunded\": 0,\n" +
            "  \"failure_code\": null,\n" +
            "  \"failure_msg\": null,\n" +
            "  \"metadata\": {},\n" +
            "  \"credential\": {\n" +
            "    \"object\": \"credential\",\n" +
            "    \"upacp\": {\n" +
            "      \"tn\": \"202001061028470000000\",\n" +
            "      \"mode\": \"01\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"description\": null\n" +
            "}";

    public static Charge parseFakePayResult(){
        return JSON.parseObject(fakePayResultJson,Charge.class);
    }

    public static void main(String[] args) {
        System.out.print(parseFakePayResult().toString());
    }
}
