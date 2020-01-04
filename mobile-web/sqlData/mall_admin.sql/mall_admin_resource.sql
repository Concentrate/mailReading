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
-- Table structure for table `resource`
--

DROP TABLE IF EXISTS `resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源编号',
  `type` int(11) NOT NULL DEFAULT '-1' COMMENT '资源类型',
  `sort` int(11) NOT NULL DEFAULT '-1' COMMENT '排序',
  `display_name` varchar(50) NOT NULL DEFAULT '' COMMENT '展示名',
  `pid` int(11) NOT NULL DEFAULT '-1' COMMENT '父级资源编号(外键：{@link ResourceDO#id})',
  `handler` varchar(50) DEFAULT '' COMMENT '操作\n     *\n     * 当资源类型为【菜单】时，handler 配置为界面 URL ，或者前端组件名\n     * 当资源类型为【操作】时，handler 配置为后端 URL 。举个例子，如果有一个「创建管理员」的表单，那么前端界面上的按钮可以根据这个 url 判断是否展示，后端接收到该 url 的请求时会判断是否有权限。',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `permissions` varchar(255) DEFAULT NULL COMMENT '权限标识数组，使用逗号分隔',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COMMENT='resource_d_o';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resource`
--

LOCK TABLES `resource` WRITE;
/*!40000 ALTER TABLE `resource` DISABLE KEYS */;
INSERT INTO `resource` VALUES (1,2,-1,'管理员信息',0,'/admin/admin/info',NULL,NULL,'2019-02-24 09:07:43','2019-05-15 22:57:30',''),(2,1,1,'商品',0,'',NULL,NULL,'2019-02-24 20:40:23','2019-05-15 22:57:30',''),(3,1,1,'商品管理',2,'/product/list',NULL,NULL,'2019-02-27 23:34:36','2019-05-15 22:57:30',''),(8,1,1,'测试说明',1,'123',NULL,NULL,'2019-02-28 09:11:15','2019-05-15 22:57:30',''),(9,1,1,'测试说明1',0,NULL,NULL,NULL,'2019-02-28 10:33:57','2019-05-15 22:57:30',''),(10,1,1,'测试说明',9,'/123',NULL,NULL,'2019-02-28 10:34:09','2019-05-15 22:57:30',''),(11,1,1,'测试',9,'/admin/test',NULL,NULL,'2019-03-05 07:04:13','2019-05-15 22:57:30',''),(12,1,1,'首页',0,NULL,NULL,NULL,'2019-03-10 03:56:58','2019-05-15 22:57:30',''),(13,1,8,'系统管理',0,NULL,'desktop','','2019-03-10 03:59:07','2019-05-15 23:48:05','\0'),(14,1,0,'员工列表',13,'/admin/admin-list','team','system.admin.page','2019-03-10 03:59:29','2019-05-16 10:47:59','\0'),(15,1,2,'权限列表',13,'/admin/resource-list',NULL,NULL,'2019-03-10 03:59:56','2019-05-15 22:57:30','\0'),(16,1,1,'角色列表',13,'/admin/role-list',NULL,NULL,'2019-03-10 04:00:35','2019-05-15 22:57:30','\0'),(17,1,1,'测试说明',9,'/123',NULL,NULL,'2019-03-10 10:54:35','2019-05-15 22:57:30',''),(18,1,3,'角色管理',13,'/admin/role-list',NULL,NULL,'2019-03-12 23:59:44','2019-05-15 22:57:30',''),(19,1,4,'数据字典',13,'/admin/dictionary-list','select','system.dataDict.list','2019-03-15 19:10:30','2019-05-16 16:03:01','\0'),(20,1,4,'商品管理',0,NULL,NULL,NULL,'2019-03-15 19:53:09','2019-05-15 22:57:30','\0'),(21,1,1,'商品列表',20,'/product/product-spu-list',NULL,NULL,'2019-03-15 19:55:22','2019-05-15 22:57:30','\0'),(22,1,2,'展示类目',20,'/product/product-category-list',NULL,NULL,'2019-03-15 19:56:42','2019-05-15 22:57:30','\0'),(23,1,7,'营销管理',0,NULL,NULL,NULL,'2019-03-30 22:42:13','2019-05-15 22:57:30','\0'),(24,1,1,'首页广告',23,'/promotion/banner-list',NULL,NULL,'2019-03-30 22:54:57','2019-05-15 22:57:30','\0'),(25,1,2,'商品推荐',23,'/promotion/product-recommend-list',NULL,NULL,'2019-04-01 13:17:28','2019-05-15 22:57:30','\0'),(26,1,3,'优惠劵',23,'/promotion/coupon-card-template-list',NULL,NULL,'2019-04-04 16:02:14','2019-05-15 22:57:30','\0'),(27,1,5,'订单管理',0,NULL,NULL,NULL,'2019-04-06 12:53:55','2019-05-15 22:57:30','\0'),(28,1,1,'订单管理',27,'/order/order-list',NULL,NULL,'2019-04-06 12:57:17','2019-05-15 22:57:30','\0'),(29,1,3,'商品品牌',20,'/product/product-brand-list',NULL,NULL,'2019-04-09 17:58:36','2019-05-15 22:57:30','\0'),(30,1,-99,'发布商品',20,'/product/product-spu-add',NULL,NULL,'2019-05-01 21:01:38','2019-05-15 22:57:30','\0'),(31,1,0,'概述',0,'/home',NULL,NULL,'2019-05-03 00:01:33','2019-05-15 22:57:30','\0'),(32,1,1,'数据分析',0,NULL,NULL,NULL,'2019-05-03 00:02:08','2019-05-15 22:57:30','\0'),(33,1,2,'店铺资产',0,NULL,'money-collect','','2019-05-03 00:02:57','2019-05-15 23:23:20','\0'),(34,1,6,'会员管理',0,NULL,NULL,NULL,'2019-05-03 00:03:55','2019-05-15 22:57:30','\0'),(35,1,8,'test',0,NULL,NULL,NULL,'2019-05-03 13:23:46','2019-05-15 22:57:30',''),(36,1,1,'测试',0,NULL,NULL,NULL,'2019-05-04 14:28:20','2019-05-15 22:57:30',''),(37,1,2,'测试2',36,'/http://baidu.com',NULL,NULL,'2019-05-04 14:30:08','2019-05-15 22:57:30',''),(38,2,1,'策士3',36,'/123213123123',NULL,NULL,'2019-05-04 14:30:37','2019-05-15 22:57:30',''),(39,1,1,'ceshi',0,NULL,NULL,NULL,'2019-05-04 14:41:06','2019-05-15 22:57:30',''),(40,1,1,'测试aa',0,NULL,NULL,NULL,'2019-05-05 16:09:19','2019-05-15 22:57:30',''),(41,1,24,'限时折扣',23,'/promotion/time-limit-discount-list',NULL,NULL,'2019-05-07 22:34:30','2019-05-15 22:57:30','\0'),(42,1,25,'满减送',23,'/promotion/full-privilege-list',NULL,NULL,'2019-05-08 00:05:20','2019-05-15 22:57:30','\0'),(43,1,1,'会员资料',34,'/member/user-list',NULL,NULL,'2019-05-08 11:11:22','2019-05-15 22:57:30','\0'),(44,1,1,'支付单',33,'/pay/transaction-list',NULL,NULL,'2019-05-08 14:17:15','2019-05-15 22:57:30','\0'),(45,1,2,'退款单',33,'/pay/refund-list',NULL,NULL,'2019-05-08 16:58:05','2019-05-15 22:57:30','\0'),(46,1,1,'订单售后',27,'/order/order-refunds',NULL,NULL,'2019-05-09 19:57:23','2019-05-15 22:57:30','\0'),(47,2,1,'新建员工',14,'',NULL,'system.admin.add,system.admin.update','2019-05-15 23:43:58','2019-05-15 23:45:12','\0'),(48,2,1,'新建字典',19,'',NULL,'system.dataDict.add','2019-05-16 16:00:57','2019-05-16 16:00:56','\0'),(49,2,2,'编辑字典',19,'',NULL,'system.dataDict.update','2019-05-16 16:01:18','2019-05-16 16:01:18','\0'),(50,2,3,'删除字典',19,'',NULL,'system.dataDict.delete','2019-05-16 16:01:36','2019-05-16 16:01:36','\0'),(51,1,-1,'短信ss',0,'','user','','2019-05-26 12:00:31','2019-06-03 13:54:54','\0'),(52,1,1,'短信签名',51,'/sms/sign-list','user','','2019-05-26 12:01:56','2019-05-26 12:01:56','\0'),(53,1,2,'短信模板',51,'/sms/template-list','user','','2019-05-26 12:02:19','2019-05-26 12:02:18','\0'),(54,1,3,'部门管理',13,'/admin/dept-list','user','','2019-06-27 23:41:19','2019-06-27 23:41:51','\0'),(55,1,4,'规格管理',20,'/product/product-attr-list',NULL,NULL,'2019-08-14 23:59:38','2019-08-14 23:59:38','\0');
/*!40000 ALTER TABLE `resource` ENABLE KEYS */;
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
