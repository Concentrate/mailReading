package cn.iocoder.mall.order.biz.convert;

import cn.iocoder.mall.order.api.bo.OrderCommentMerchantReplyBO;
import cn.iocoder.mall.order.api.bo.OrderCommentReplyCreateBO;
import cn.iocoder.mall.order.api.bo.OrderCommentReplyPageBO.OrderCommentReplayItem;
import cn.iocoder.mall.order.api.dto.OrderCommentReplyCreateDTO;
import cn.iocoder.mall.order.biz.dataobject.OrderCommentReplyDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-10T18:47:10+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class OrderCommentReplyConvertImpl implements OrderCommentReplyConvert {

    @Override
    public OrderCommentReplyDO convert(OrderCommentReplyCreateDTO orderCommentReplyCreateDTO) {
        if ( orderCommentReplyCreateDTO == null ) {
            return null;
        }

        OrderCommentReplyDO orderCommentReplyDO = new OrderCommentReplyDO();

        orderCommentReplyDO.setCommentId( orderCommentReplyCreateDTO.getCommentId() );
        orderCommentReplyDO.setParentId( orderCommentReplyCreateDTO.getParentId() );
        orderCommentReplyDO.setParentUserId( orderCommentReplyCreateDTO.getParentUserId() );
        orderCommentReplyDO.setParentUserNickName( orderCommentReplyCreateDTO.getParentUserNickName() );
        orderCommentReplyDO.setParentUserAvatar( orderCommentReplyCreateDTO.getParentUserAvatar() );
        orderCommentReplyDO.setReplyContent( orderCommentReplyCreateDTO.getReplyContent() );
        orderCommentReplyDO.setReplyUserId( orderCommentReplyCreateDTO.getReplyUserId() );
        orderCommentReplyDO.setReplyUserNickName( orderCommentReplyCreateDTO.getReplyUserNickName() );
        orderCommentReplyDO.setReplyUserAvatar( orderCommentReplyCreateDTO.getReplyUserAvatar() );
        orderCommentReplyDO.setUserType( orderCommentReplyCreateDTO.getUserType() );

        return orderCommentReplyDO;
    }

    @Override
    public OrderCommentReplyCreateBO convert(OrderCommentReplyDO orderCommentReplyDO) {
        if ( orderCommentReplyDO == null ) {
            return null;
        }

        OrderCommentReplyCreateBO orderCommentReplyCreateBO = new OrderCommentReplyCreateBO();

        orderCommentReplyCreateBO.setId( orderCommentReplyDO.getId() );

        return orderCommentReplyCreateBO;
    }

    @Override
    public List<OrderCommentMerchantReplyBO> convert(List<OrderCommentReplyDO> orderCommentReplyDOList) {
        if ( orderCommentReplyDOList == null ) {
            return null;
        }

        List<OrderCommentMerchantReplyBO> list = new ArrayList<OrderCommentMerchantReplyBO>( orderCommentReplyDOList.size() );
        for ( OrderCommentReplyDO orderCommentReplyDO : orderCommentReplyDOList ) {
            list.add( orderCommentReplyDOToOrderCommentMerchantReplyBO( orderCommentReplyDO ) );
        }

        return list;
    }

    @Override
    public List<OrderCommentReplayItem> convertOrderCommentReplayItem(List<OrderCommentReplyDO> orderCommentReplyDOList) {
        if ( orderCommentReplyDOList == null ) {
            return null;
        }

        List<OrderCommentReplayItem> list = new ArrayList<OrderCommentReplayItem>( orderCommentReplyDOList.size() );
        for ( OrderCommentReplyDO orderCommentReplyDO : orderCommentReplyDOList ) {
            list.add( orderCommentReplyDOToOrderCommentReplayItem( orderCommentReplyDO ) );
        }

        return list;
    }

    protected OrderCommentMerchantReplyBO orderCommentReplyDOToOrderCommentMerchantReplyBO(OrderCommentReplyDO orderCommentReplyDO) {
        if ( orderCommentReplyDO == null ) {
            return null;
        }

        OrderCommentMerchantReplyBO orderCommentMerchantReplyBO = new OrderCommentMerchantReplyBO();

        orderCommentMerchantReplyBO.setReplyContent( orderCommentReplyDO.getReplyContent() );

        return orderCommentMerchantReplyBO;
    }

    protected OrderCommentReplayItem orderCommentReplyDOToOrderCommentReplayItem(OrderCommentReplyDO orderCommentReplyDO) {
        if ( orderCommentReplyDO == null ) {
            return null;
        }

        OrderCommentReplayItem orderCommentReplayItem = new OrderCommentReplayItem();

        orderCommentReplayItem.setId( orderCommentReplyDO.getId() );
        orderCommentReplayItem.setReplyType( orderCommentReplyDO.getReplyType() );
        orderCommentReplayItem.setReplyContent( orderCommentReplyDO.getReplyContent() );
        if ( orderCommentReplyDO.getReplyUserId() != null ) {
            orderCommentReplayItem.setReplyUserId( orderCommentReplyDO.getReplyUserId() );
        }
        orderCommentReplayItem.setReplyUserNickName( orderCommentReplyDO.getReplyUserNickName() );
        orderCommentReplayItem.setReplyUserAvatar( orderCommentReplyDO.getReplyUserAvatar() );
        orderCommentReplayItem.setParentUserNickName( orderCommentReplyDO.getParentUserNickName() );
        orderCommentReplayItem.setCreateTime( orderCommentReplyDO.getCreateTime() );

        return orderCommentReplayItem;
    }
}
