package cn.iocoder.mall.pay.biz.dao;

import cn.iocoder.mall.pay.biz.dataobject.PayNotifyTaskDO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayNotifyTaskMapper {

    void insert(PayNotifyTaskDO entity);

    int update(PayNotifyTaskDO entity);

    /**
     * 获得需要通知的 PayTransactionNotifyTaskDO 记录。需要满足如下条件：
     *
     * 1. status 非成功
     * 2. nextNotifyTime 小于当前时间
     * // 3. lastExecuteTime > nextNotifyTime // @added by ldy, 不认同3，硬是没理解意思
     *
     * @return PayTransactionNotifyTaskDO 数组
     */
    List<PayNotifyTaskDO> selectByNotify();

}
