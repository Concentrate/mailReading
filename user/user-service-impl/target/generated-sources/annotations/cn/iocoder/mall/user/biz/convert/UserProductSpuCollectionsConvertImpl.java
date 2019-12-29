package cn.iocoder.mall.user.biz.convert;

import cn.iocoder.mall.product.api.message.ProductSpuCollectionMessage;
import cn.iocoder.mall.user.api.bo.UserProductSpuCollectionsBO;
import cn.iocoder.mall.user.api.dto.UserProductSpuCollectionsAddDTO;
import cn.iocoder.mall.user.api.dto.UserProductSpuCollectionsUpdateDTO;
import cn.iocoder.mall.user.biz.dataobject.UserProductSpuCollectionsDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-10T18:47:14+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class UserProductSpuCollectionsConvertImpl implements UserProductSpuCollectionsConvert {

    @Override
    public UserProductSpuCollectionsDO convert(UserProductSpuCollectionsAddDTO userSkuCollectionsAddDTO) {
        if ( userSkuCollectionsAddDTO == null ) {
            return null;
        }

        UserProductSpuCollectionsDO userProductSpuCollectionsDO = new UserProductSpuCollectionsDO();

        userProductSpuCollectionsDO.setId( userSkuCollectionsAddDTO.getId() );
        userProductSpuCollectionsDO.setUserId( userSkuCollectionsAddDTO.getUserId() );
        userProductSpuCollectionsDO.setNickname( userSkuCollectionsAddDTO.getNickname() );
        userProductSpuCollectionsDO.setSpuId( userSkuCollectionsAddDTO.getSpuId() );
        userProductSpuCollectionsDO.setSpuName( userSkuCollectionsAddDTO.getSpuName() );
        userProductSpuCollectionsDO.setSpuImage( userSkuCollectionsAddDTO.getSpuImage() );
        userProductSpuCollectionsDO.setSellPoint( userSkuCollectionsAddDTO.getSellPoint() );
        userProductSpuCollectionsDO.setPrice( userSkuCollectionsAddDTO.getPrice() );
        userProductSpuCollectionsDO.setCreateTime( userSkuCollectionsAddDTO.getCreateTime() );
        userProductSpuCollectionsDO.setUpdateTime( userSkuCollectionsAddDTO.getUpdateTime() );
        userProductSpuCollectionsDO.setDeleted( userSkuCollectionsAddDTO.getDeleted() );

        return userProductSpuCollectionsDO;
    }

    @Override
    public UserProductSpuCollectionsDO convert(UserProductSpuCollectionsUpdateDTO userProductSpuCollectionsUpdateDTO) {
        if ( userProductSpuCollectionsUpdateDTO == null ) {
            return null;
        }

        UserProductSpuCollectionsDO userProductSpuCollectionsDO = new UserProductSpuCollectionsDO();

        userProductSpuCollectionsDO.setId( userProductSpuCollectionsUpdateDTO.getId() );
        userProductSpuCollectionsDO.setUpdateTime( userProductSpuCollectionsUpdateDTO.getUpdateTime() );
        userProductSpuCollectionsDO.setDeleted( userProductSpuCollectionsUpdateDTO.getDeleted() );

        return userProductSpuCollectionsDO;
    }

    @Override
    public UserProductSpuCollectionsBO convert(UserProductSpuCollectionsDO userSkuCollectionsDO) {
        if ( userSkuCollectionsDO == null ) {
            return null;
        }

        UserProductSpuCollectionsBO userProductSpuCollectionsBO = new UserProductSpuCollectionsBO();

        userProductSpuCollectionsBO.setId( userSkuCollectionsDO.getId() );
        userProductSpuCollectionsBO.setUserId( userSkuCollectionsDO.getUserId() );
        userProductSpuCollectionsBO.setNickname( userSkuCollectionsDO.getNickname() );
        userProductSpuCollectionsBO.setSpuId( userSkuCollectionsDO.getSpuId() );
        userProductSpuCollectionsBO.setSpuName( userSkuCollectionsDO.getSpuName() );
        userProductSpuCollectionsBO.setSpuImage( userSkuCollectionsDO.getSpuImage() );
        userProductSpuCollectionsBO.setSellPoint( userSkuCollectionsDO.getSellPoint() );
        userProductSpuCollectionsBO.setPrice( userSkuCollectionsDO.getPrice() );
        userProductSpuCollectionsBO.setCreateTime( userSkuCollectionsDO.getCreateTime() );
        userProductSpuCollectionsBO.setUpdateTime( userSkuCollectionsDO.getUpdateTime() );
        userProductSpuCollectionsBO.setDeleted( userSkuCollectionsDO.getDeleted() );

        return userProductSpuCollectionsBO;
    }

    @Override
    public List<UserProductSpuCollectionsBO> convert(List<UserProductSpuCollectionsDO> userSkuCollectionsDOS) {
        if ( userSkuCollectionsDOS == null ) {
            return null;
        }

        List<UserProductSpuCollectionsBO> list = new ArrayList<UserProductSpuCollectionsBO>( userSkuCollectionsDOS.size() );
        for ( UserProductSpuCollectionsDO userProductSpuCollectionsDO : userSkuCollectionsDOS ) {
            list.add( convert( userProductSpuCollectionsDO ) );
        }

        return list;
    }

    @Override
    public UserProductSpuCollectionsAddDTO convert(ProductSpuCollectionMessage productSpuCollectionMessage) {
        if ( productSpuCollectionMessage == null ) {
            return null;
        }

        UserProductSpuCollectionsAddDTO userProductSpuCollectionsAddDTO = new UserProductSpuCollectionsAddDTO();

        userProductSpuCollectionsAddDTO.setUserId( productSpuCollectionMessage.getUserId() );
        userProductSpuCollectionsAddDTO.setSpuId( productSpuCollectionMessage.getSpuId() );
        userProductSpuCollectionsAddDTO.setSpuName( productSpuCollectionMessage.getSpuName() );
        userProductSpuCollectionsAddDTO.setSpuImage( productSpuCollectionMessage.getSpuImage() );
        userProductSpuCollectionsAddDTO.setSellPoint( productSpuCollectionMessage.getSellPoint() );
        userProductSpuCollectionsAddDTO.setPrice( productSpuCollectionMessage.getPrice() );

        return userProductSpuCollectionsAddDTO;
    }
}
