package cn.iocoder.mall.order.biz.convert;

import cn.iocoder.mall.order.api.bo.OrderCommentCreateBO;
import cn.iocoder.mall.order.api.bo.OrderCommentInfoBO;
import cn.iocoder.mall.order.api.bo.OrderCommentStateInfoPageBO.OrderCommentStateInfoItem;
import cn.iocoder.mall.order.api.bo.OrderCommentTimeOutBO;
import cn.iocoder.mall.order.api.dto.OrderCommentCreateDTO;
import cn.iocoder.mall.order.biz.dataobject.OrderCommentDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-10T18:47:10+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class OrderCommentConvertImpl implements OrderCommentConvert {

    @Override
    public OrderCommentStateInfoItem convertOrderCommentStateInfoItem(OrderCommentDO orderCommentDO) {
        if ( orderCommentDO == null ) {
            return null;
        }

        OrderCommentStateInfoItem orderCommentStateInfoItem = new OrderCommentStateInfoItem();

        orderCommentStateInfoItem.setOrderId( orderCommentDO.getOrderId() );
        orderCommentStateInfoItem.setOrderNo( orderCommentDO.getOrderNo() );
        orderCommentStateInfoItem.setProductSpuId( orderCommentDO.getProductSpuId() );
        orderCommentStateInfoItem.setProductSpuName( orderCommentDO.getProductSpuName() );
        orderCommentStateInfoItem.setProductSkuId( orderCommentDO.getProductSkuId() );
        orderCommentStateInfoItem.setProductSkuAttrs( orderCommentDO.getProductSkuAttrs() );
        orderCommentStateInfoItem.setProductSkuPrice( orderCommentDO.getProductSkuPrice() );
        orderCommentStateInfoItem.setProductSkuPicUrl( orderCommentDO.getProductSkuPicUrl() );
        orderCommentStateInfoItem.setCommentState( orderCommentDO.getCommentState() );
        orderCommentStateInfoItem.setCreateTime( orderCommentDO.getCreateTime() );

        return orderCommentStateInfoItem;
    }

    @Override
    public List<OrderCommentStateInfoItem> convertOrderCommentStateInfoItems(List<OrderCommentDO> orderCommentDOList) {
        if ( orderCommentDOList == null ) {
            return null;
        }

        List<OrderCommentStateInfoItem> list = new ArrayList<OrderCommentStateInfoItem>( orderCommentDOList.size() );
        for ( OrderCommentDO orderCommentDO : orderCommentDOList ) {
            list.add( convertOrderCommentStateInfoItem( orderCommentDO ) );
        }

        return list;
    }

    @Override
    public OrderCommentDO convertOrderCommentDO(OrderCommentCreateDTO orderCommentCreateDTO) {
        if ( orderCommentCreateDTO == null ) {
            return null;
        }

        OrderCommentDO orderCommentDO = new OrderCommentDO();

        orderCommentDO.setOrderId( orderCommentCreateDTO.getOrderId() );
        orderCommentDO.setOrderNo( orderCommentCreateDTO.getOrderNo() );
        orderCommentDO.setProductSpuId( orderCommentCreateDTO.getProductSpuId() );
        orderCommentDO.setProductSpuName( orderCommentCreateDTO.getProductSpuName() );
        orderCommentDO.setProductSkuId( orderCommentCreateDTO.getProductSkuId() );
        orderCommentDO.setProductSkuAttrs( orderCommentCreateDTO.getProductSkuAttrs() );
        orderCommentDO.setProductSkuPrice( orderCommentCreateDTO.getProductSkuPrice() );
        orderCommentDO.setProductSkuPicUrl( orderCommentCreateDTO.getProductSkuPicUrl() );
        orderCommentDO.setUserId( orderCommentCreateDTO.getUserId() );
        orderCommentDO.setUserAvatar( orderCommentCreateDTO.getUserAvatar() );
        orderCommentDO.setUserNickName( orderCommentCreateDTO.getUserNickName() );
        orderCommentDO.setStar( orderCommentCreateDTO.getStar() );
        orderCommentDO.setProductDescriptionStar( orderCommentCreateDTO.getProductDescriptionStar() );
        orderCommentDO.setLogisticsStar( orderCommentCreateDTO.getLogisticsStar() );
        orderCommentDO.setMerchantStar( orderCommentCreateDTO.getMerchantStar() );
        orderCommentDO.setCommentContent( orderCommentCreateDTO.getCommentContent() );
        orderCommentDO.setCommentPics( orderCommentCreateDTO.getCommentPics() );

        return orderCommentDO;
    }

    @Override
    public OrderCommentCreateBO convertOrderCommentCreateBO(OrderCommentDO orderCommentDO) {
        if ( orderCommentDO == null ) {
            return null;
        }

        OrderCommentCreateBO orderCommentCreateBO = new OrderCommentCreateBO();

        orderCommentCreateBO.setId( orderCommentDO.getId() );

        return orderCommentCreateBO;
    }

    @Override
    public OrderCommentInfoBO convertOrderCommentInfoBO(OrderCommentDO orderCommentDO) {
        if ( orderCommentDO == null ) {
            return null;
        }

        OrderCommentInfoBO orderCommentInfoBO = new OrderCommentInfoBO();

        orderCommentInfoBO.setId( orderCommentDO.getId() );
        orderCommentInfoBO.setUserAvatar( orderCommentDO.getUserAvatar() );
        orderCommentInfoBO.setUserNickName( orderCommentDO.getUserNickName() );
        orderCommentInfoBO.setStar( orderCommentDO.getStar() );
        orderCommentInfoBO.setCommentContent( orderCommentDO.getCommentContent() );
        orderCommentInfoBO.setCommentPics( orderCommentDO.getCommentPics() );
        orderCommentInfoBO.setLikeCount( orderCommentDO.getLikeCount() );
        orderCommentInfoBO.setCreateTime( orderCommentDO.getCreateTime() );
        if ( orderCommentDO.getProductSkuId() != null ) {
            orderCommentInfoBO.setProductSkuId( orderCommentDO.getProductSkuId() );
        }
        orderCommentInfoBO.setProductSkuAttrs( orderCommentDO.getProductSkuAttrs() );
        if ( orderCommentDO.getProductSkuPrice() != null ) {
            orderCommentInfoBO.setProductSkuPrice( String.valueOf( orderCommentDO.getProductSkuPrice() ) );
        }
        orderCommentInfoBO.setProductSkuPicUrl( orderCommentDO.getProductSkuPicUrl() );

        return orderCommentInfoBO;
    }

    @Override
    public OrderCommentTimeOutBO convertOrderCommentTimeOutBO(OrderCommentDO orderCommentDO) {
        if ( orderCommentDO == null ) {
            return null;
        }

        OrderCommentTimeOutBO orderCommentTimeOutBO = new OrderCommentTimeOutBO();

        orderCommentTimeOutBO.setId( orderCommentDO.getId() );

        return orderCommentTimeOutBO;
    }

    @Override
    public List<OrderCommentTimeOutBO> convertOrderCommentTimeOutBOList(List<OrderCommentDO> orderCommentDOList) {
        if ( orderCommentDOList == null ) {
            return null;
        }

        List<OrderCommentTimeOutBO> list = new ArrayList<OrderCommentTimeOutBO>( orderCommentDOList.size() );
        for ( OrderCommentDO orderCommentDO : orderCommentDOList ) {
            list.add( convertOrderCommentTimeOutBO( orderCommentDO ) );
        }

        return list;
    }
}
