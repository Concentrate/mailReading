-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: mall_admin
-- ------------------------------------------------------
-- Server version	8.0.0-dmr

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `data_dict`
--

DROP TABLE IF EXISTS `data_dict`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `enum_value` varchar(50) NOT NULL DEFAULT '' COMMENT '大类枚举值',
  `display_name` varchar(50) NOT NULL DEFAULT '' COMMENT '展示名',
  `sort` int(11) NOT NULL DEFAULT '-1' COMMENT '排序值',
  `memo` varchar(50) DEFAULT '' COMMENT '备注',
  `value` varchar(50) NOT NULL DEFAULT '' COMMENT '小类数值',
  `deleted` tinyint(11) NOT NULL DEFAULT '0' COMMENT '是否删除',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4 COMMENT='data_dict';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_dict`
--

LOCK TABLES `data_dict` WRITE;
/*!40000 ALTER TABLE `data_dict` DISABLE KEYS */;
INSERT INTO `data_dict` VALUES (1,'gender','男',1,'性别 - 男（嗨）','1',0,'2019-03-03 13:03:46','2019-03-15 08:51:45'),(2,'gender','女',2,'性别（女）','2',0,'2019-03-03 13:04:00','2019-03-15 09:19:20'),(3,'gender','未知',10,NULL,'3',1,'2019-03-02 23:09:19','2019-03-03 05:11:47'),(4,'common_status','开启',1,'状态 - 开启','1',0,'2019-03-15 17:28:08','2019-03-15 09:28:07'),(5,'common_status','禁用',2,'状态 - 禁用','2',0,'2019-03-15 17:28:54','2019-03-15 09:28:54'),(6,'test','测试',1,'你猜','1',1,'2019-03-15 17:36:54','2019-03-15 09:36:59'),(7,'test','测试',1,'1','1',1,'2019-03-15 17:37:13','2019-03-15 10:46:21'),(8,'delete_status','未删除',0,'正常/未删除','0',0,'2019-03-22 21:20:59','2019-03-22 13:20:59'),(9,'delete_status','删除',1,'删除','1',0,'2019-03-22 21:23:20','2019-03-22 13:23:20'),(10,'order_status','等待付款',1,'订单状态','1',0,'2019-03-24 16:17:55','2019-03-24 08:20:24'),(11,'order_status','等待发货',2,'	等待发货','2',0,'2019-03-24 16:18:39','2019-03-24 08:20:14'),(12,'order_status','已发货',3,'已发货','3',0,'2019-03-24 16:19:14','2019-03-24 08:20:07'),(13,'order_status','已完成',4,'	已完成','4',0,'2019-03-24 16:19:37','2019-03-24 08:20:03'),(14,'order_status','已关闭',5,'已关闭','5',0,'2019-03-24 16:19:50','2019-03-24 08:19:50'),(15,'order_has_return_exchange','无退换货',1,'.','1',0,'2019-03-24 16:51:27','2019-03-24 08:51:26'),(16,'order_has_return_exchange','退货',2,'.','2',0,'2019-03-24 16:51:36','2019-03-24 08:51:35'),(17,'order_has_return_exchange','换货',3,'.','3',0,'2019-03-24 16:51:45','2019-03-24 08:51:44'),(18,'order_has_return_exchange','退换货',4,'。','4',0,'2019-03-24 16:52:01','2019-03-24 08:52:00'),(19,'order_cancel_reasons','无法联系上买家',1,'.','1',0,'2019-03-30 15:19:18','2019-03-30 07:19:17'),(20,'order_cancel_reasons','买家误拍或重拍了',2,',','2',0,'2019-03-30 15:19:31','2019-03-30 07:19:30'),(21,'order_cancel_reasons','买家无诚意完成交易',3,'.','3',0,'2019-03-30 15:19:42','2019-03-30 07:19:41'),(22,'order_cancel_reasons','已通过银行线下汇款',4,'.','4',0,'2019-03-30 15:19:56','2019-03-30 07:19:56'),(23,'order_cancel_reasons','已通过同城见面交易',5,'.','5',0,'2019-03-30 15:20:21','2019-03-30 07:20:21'),(24,'order_cancel_reasons','已通过货到付款交易',6,'.','6',0,'2019-03-30 15:20:37','2019-03-30 07:20:37'),(25,'order_cancel_reasons','已通过网上银行直接汇款',7,'.','7',0,'2019-03-30 15:20:48','2019-03-30 07:20:47'),(26,'order_cancel_reasons','已经缺货无法交易',8,'.','8',0,'2019-03-30 15:21:01','2019-03-30 07:21:01'),(27,'order_cancel_reasons','其他',20,'.','20',0,'2019-03-30 17:16:27','2019-03-30 09:16:27'),(28,'logistics_company','顺丰快递',1,'.','1',0,'2019-04-05 16:26:22','2019-04-05 08:26:22'),(29,'logistics_company','顺风速运',2,'.','2',0,'2019-04-05 16:26:40','2019-04-05 08:27:48'),(30,'logistics_company','圆通快递',3,'.','3',0,'2019-04-05 16:26:57','2019-04-05 08:26:56'),(31,'logistics_company','申通快递',4,'.','4',0,'2019-04-05 16:27:14','2019-04-05 08:27:14'),(32,'logistics_company','EMS',5,'.','5',0,'2019-04-05 16:28:00','2019-04-05 08:28:00'),(33,'logistics_company','申通快递',6,'.','6',0,'2019-04-05 16:28:40','2019-04-05 08:28:40'),(34,'logistics_company','天天快递',7,'.','7',0,'2019-04-05 16:28:51','2019-04-05 08:28:51'),(35,'logistics_company','环球速运',8,'.','8',0,'2019-04-05 16:29:12','2019-04-05 08:29:12'),(36,'testOne','ttest',1,'1','testO',0,'2019-04-11 17:48:29','2019-04-11 09:48:28'),(37,'order_return_reason','退货原因',1,'退货原因','0',1,'2019-04-25 23:25:10','2019-04-25 15:27:02'),(38,'order_return_reason','不想要了',1,'.','1',0,'2019-04-25 23:25:55','2019-04-25 15:25:55'),(39,'order_return_reason','多拍重拍',2,'.','2',0,'2019-04-25 23:26:23','2019-04-25 15:26:23'),(40,'order_return_reason','少货',3,'.','3',0,'2019-04-25 23:26:48','2019-04-25 15:26:47'),(41,'order_return_return_type','订单退货类型',1,'.','-1',1,'2019-04-27 11:57:45','2019-04-27 03:58:16'),(42,'order_return_return_type','退货退款',1,'.','1',1,'2019-04-27 11:58:05','2019-04-27 04:12:01'),(43,'order_return_return_type','退款',2,'.','2',1,'2019-04-27 11:58:14','2019-04-27 04:12:03'),(44,'order_return_service_type','退货退款',1,'.','1',0,'2019-04-27 12:12:26','2019-04-27 04:12:25'),(45,'order_return_service_type','退款',2,'2','2',0,'2019-04-27 12:12:36','2019-04-27 04:12:35'),(46,'order_return_status','退货申请',1,'1','1',0,'2019-05-06 22:50:06','2019-05-06 14:50:05'),(47,'order_return_status','2',2,'2','2',1,'2019-05-06 22:50:46','2019-05-06 14:51:57'),(48,'order_return_status','1',1,'1','-1',1,'2019-05-06 22:51:07','2019-05-06 14:52:00'),(49,'order_return_status','0',0,'0','0',1,'2019-05-06 22:51:39','2019-05-06 14:52:02'),(50,'order_return_status','申请成功',2,'.','2',0,'2019-05-06 22:52:13','2019-05-06 14:52:12'),(51,'order_return_status','申请失败',3,'.','3',0,'2019-05-06 22:52:34','2019-05-06 14:52:34'),(52,'order_return_status','退货中',4,'.','4',0,'2019-05-06 22:52:44','2019-05-06 14:52:43'),(53,'order_return_status','已收货',5,'.','5',0,'2019-05-06 22:52:57','2019-05-09 14:17:35'),(54,'order_return_status','退款成功',6,'.','6',0,'2019-05-09 22:17:52','2019-05-09 14:17:51'),(55,'sms_platform','云片',1,'短信服务云片','1',0,'2019-05-26 15:09:37','2019-05-26 07:09:37'),(56,'sms_platform','阿里云',2,'阿里云短信服务','2',0,'2019-05-26 15:09:56','2019-05-26 07:09:56'),(57,'sms_apply_status','审核中',1,'审核中','1',0,'2019-05-26 15:11:27','2019-05-26 07:11:27'),(58,'sms_apply_status','审核成功',2,'审核成功','2',0,'2019-05-26 15:11:40','2019-05-26 07:11:40'),(59,'sms_apply_status','审核失败',10,'审核失败','10',0,'2019-05-26 15:12:10','2019-05-26 07:12:10'),(60,'sms_type','验证码',1,'验证码','1',0,'2019-05-26 23:51:15','2019-05-26 15:51:15'),(61,'sms_type','通知',2,'通知','2',0,'2019-05-26 23:51:29','2019-05-26 15:51:28'),(62,'sms_type','营销',3,'营销','3',0,'2019-05-26 23:51:47','2019-05-26 15:51:46');
/*!40000 ALTER TABLE `data_dict` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-03 18:47:39
