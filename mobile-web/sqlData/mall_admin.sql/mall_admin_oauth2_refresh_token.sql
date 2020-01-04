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
-- Table structure for table `oauth2_refresh_token`
--

DROP TABLE IF EXISTS `oauth2_refresh_token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oauth2_refresh_token` (
  `id` varchar(32) NOT NULL,
  `user_id` int(11) DEFAULT NULL COMMENT '用户编号',
  `user_type` tinyint(255) DEFAULT NULL COMMENT '用户类型',
  `valid` tinyint(4) DEFAULT NULL,
  `expires_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oauth2_refresh_token`
--

LOCK TABLES `oauth2_refresh_token` WRITE;
/*!40000 ALTER TABLE `oauth2_refresh_token` DISABLE KEYS */;
INSERT INTO `oauth2_refresh_token` VALUES ('056ff9cf4d064290928dab60149beea6',28,2,0,'2019-12-31 01:28:28','2019-12-30 13:28:27','2020-01-03 16:13:39'),('07ede5ad1ed5498096307e798f3e8746',28,2,0,'2019-12-24 04:11:17','2019-12-23 16:11:16','2020-01-03 16:13:39'),('0ee80547035043038c62469aa3df2c7a',28,2,0,'2019-12-24 04:24:33','2019-12-23 16:24:33','2020-01-03 16:13:39'),('168319ce812f4c12b0c1a48fe60ed1cc',28,2,0,'2019-12-24 04:12:46','2019-12-23 16:12:45','2020-01-03 16:13:39'),('16d4c54459fe48d3910e43d14eec558e',108,1,1,'2020-01-01 01:47:47','2019-12-31 13:47:47','2019-12-31 13:47:47'),('17821b3f1e4743c39296322e1f22682c',28,2,0,'2019-12-24 04:17:24','2019-12-23 16:17:23','2020-01-03 16:13:39'),('1a21cd906327457bb3816cd7194dc2d8',28,2,0,'2019-12-24 04:21:10','2019-12-23 16:21:10','2020-01-03 16:13:39'),('1b17256e8b7443aab4f4c3d69eb25779',28,2,0,'2019-12-24 04:11:43','2019-12-23 16:11:42','2020-01-03 16:13:39'),('1e52f078487848d4a6114bcdce25e162',28,2,1,'2020-01-04 04:15:34','2020-01-03 16:15:34','2020-01-03 16:15:34'),('1e77d6edbd9b4ed98e4feabad217a4fd',29,2,1,'2020-01-04 04:21:46','2020-01-03 16:21:45','2020-01-03 16:21:45'),('1ea41289e44749c7b54f751396948b31',28,2,0,'2019-12-24 04:24:31','2019-12-23 16:24:30','2020-01-03 16:13:39'),('214395737c47416ea1d6717dff8bc499',28,2,0,'2019-12-25 07:51:12','2019-12-24 19:51:11','2020-01-03 16:13:39'),('252257c4e3444c37b6fd59a8296368d0',28,2,1,'2020-01-04 04:21:05','2020-01-03 16:21:05','2020-01-03 16:21:05'),('27388611088c4b828de801809b8d67fa',28,2,0,'2019-12-24 04:15:07','2019-12-23 16:15:07','2020-01-03 16:13:39'),('2b8f6ea19a364efdbb135b153dcf7803',28,2,0,'2019-12-24 04:22:23','2019-12-23 16:22:22','2020-01-03 16:13:39'),('2fe79859d79f417f81f49edaf3f4add5',28,2,0,'2019-12-30 23:57:20','2019-12-30 11:57:20','2020-01-03 16:13:39'),('309ce0e4dd87408bb1f872ca3543208e',28,2,0,'2019-12-30 23:17:49','2019-12-30 11:17:49','2020-01-03 16:13:39'),('31bb001a3c94497c86836260f6d5794f',28,2,0,'2020-01-04 03:39:07','2020-01-03 15:39:07','2020-01-03 16:13:39'),('31c9bcae9d70450bab9613fa462ac087',28,2,0,'2019-12-24 04:15:56','2019-12-23 16:15:55','2020-01-03 16:13:39'),('3588ded872ab43308e3674b2c5e20966',28,2,0,'2019-12-24 04:19:06','2019-12-23 16:19:06','2020-01-03 16:13:39'),('391b44b04a424b979a5e35e80f36446b',28,2,0,'2019-12-24 05:33:10','2019-12-23 17:33:09','2020-01-03 16:13:39'),('3975f21ba4d140759b41e09157d4b638',28,2,0,'2019-12-24 04:08:16','2019-12-23 16:08:15','2020-01-03 16:13:39'),('3b3af9c0d0604ded865836a2019b43eb',28,2,0,'2019-12-24 04:24:25','2019-12-23 16:24:24','2020-01-03 16:13:39'),('3ef86860047a4f80a29f244c14876508',28,2,0,'2019-12-24 04:22:09','2019-12-23 16:22:09','2020-01-03 16:13:39'),('42e06945917e46d2b6778849ab81b4a8',28,2,0,'2019-12-24 04:16:17','2019-12-23 16:16:17','2020-01-03 16:13:39'),('4634c330caf94e08aabc82bd03500ecb',28,2,0,'2019-12-24 04:11:57','2019-12-23 16:11:56','2020-01-03 16:13:39'),('4efe897bbe5440928b48a2b84aa24274',28,2,0,'2019-12-24 04:17:20','2019-12-23 16:17:20','2020-01-03 16:13:39'),('60f621b059e34fa489c2a89e4c15cf4e',28,2,0,'2019-12-24 22:35:00','2019-12-24 10:34:59','2020-01-03 16:13:39'),('622412edde8f43138f2f924b6597c3b1',28,2,0,'2019-12-24 04:24:32','2019-12-23 16:24:31','2020-01-03 16:13:39'),('671bf18f47c54bfdac0e7f23560f09dd',28,2,0,'2019-12-30 23:36:24','2019-12-30 11:36:23','2020-01-03 16:13:39'),('7104d2e4677c4d6080c84e4e726b877e',28,2,0,'2019-12-31 00:59:36','2019-12-30 12:59:36','2020-01-03 16:13:39'),('72a81678e2654447bff2fef889dd0065',28,2,0,'2019-12-24 04:10:10','2019-12-23 16:10:09','2020-01-03 16:13:39'),('7394061ad52a47558f3fece9e2c27702',28,2,0,'2019-12-24 23:01:25','2019-12-24 11:01:24','2020-01-03 16:13:39'),('73c4bae7d1354696a750ee8da48b5e31',28,2,0,'2019-12-24 04:16:28','2019-12-23 16:16:28','2020-01-03 16:13:39'),('743b4e66b34f4fcf9282d364364319e1',28,2,0,'2019-12-31 01:28:09','2019-12-30 13:28:09','2020-01-03 16:13:39'),('773176be917f468ca0b965347e0be53f',28,2,1,'2020-01-04 04:13:42','2020-01-03 16:13:41','2020-01-03 16:13:41'),('7a42dba2bd6a4aa88b0adb92eabc8e31',28,2,0,'2019-12-25 01:05:24','2019-12-24 13:05:23','2020-01-03 16:13:39'),('7f9796bef9da45a591f90612798ef619',28,2,0,'2019-12-30 23:17:30','2019-12-30 11:17:30','2020-01-03 16:13:39'),('8002716aa1e840c9bc2899dc3a1ccc6d',28,2,0,'2019-12-24 23:19:31','2019-12-24 11:19:31','2020-01-03 16:13:39'),('8249035ac0744fc9a3ee629bce89b852',28,2,0,'2019-12-31 00:38:20','2019-12-30 12:38:19','2020-01-03 16:13:39'),('84419d2785a7431094dfbdc4714f81a3',28,2,0,'2019-12-31 00:59:20','2019-12-30 12:59:19','2020-01-03 16:13:39'),('852329f77385455392205a764bd23c85',28,2,0,'2019-12-31 01:07:07','2019-12-30 13:07:06','2020-01-03 16:13:39'),('8a51f3ee70c74ff4b8c421c43e8b9f5b',28,2,0,'2019-12-31 00:59:11','2019-12-30 12:59:10','2020-01-03 16:13:39'),('8a7dbcac657245d88604d1aa1793dfde',28,2,0,'2019-12-24 05:41:45','2019-12-23 17:41:45','2020-01-03 16:13:39'),('8f1abe27a7994f0285140a216197b421',28,2,0,'2019-12-24 04:24:31','2019-12-23 16:24:31','2020-01-03 16:13:39'),('90a486a5a7f64880adab80d1176d3f99',28,2,0,'2020-01-03 02:35:19','2020-01-02 14:35:19','2020-01-03 16:13:39'),('90d80820bb0e492eb558ccca47ac3e23',30,2,1,'2020-01-04 04:20:21','2020-01-03 16:20:21','2020-01-03 16:20:21'),('91aedfba42ef44cea84b001bc2b48731',28,2,0,'2019-12-24 04:24:28','2019-12-23 16:24:28','2020-01-03 16:13:39'),('96c28b25e0044994bd6086c6eed8b926',28,2,0,'2019-12-30 23:47:59','2019-12-30 11:47:58','2020-01-03 16:13:39'),('96e5991d5ad74a4a9a31305be8804376',28,2,0,'2019-12-24 04:18:10','2019-12-23 16:18:10','2020-01-03 16:13:39'),('9818edc83b1a43a983ccaff1f1c85080',28,2,0,'2019-12-25 01:13:45','2019-12-24 13:13:44','2020-01-03 16:13:39'),('9abbf852c96f47b588074ed4b6208363',28,2,0,'2019-12-24 05:32:04','2019-12-23 17:32:04','2020-01-03 16:13:39'),('9c036d60ce3d4dafb0ea5dc6a32c3fd7',28,2,1,'2020-01-04 04:22:07','2020-01-03 16:22:07','2020-01-03 16:22:07'),('a0f645f665ae4b1994bff38671a95a20',28,2,0,'2019-12-25 23:39:58','2019-12-25 11:39:57','2020-01-03 16:13:39'),('a6abe9b28d7c46aa917c553ddc8db3c4',28,2,0,'2019-12-24 04:09:19','2019-12-23 16:09:19','2020-01-03 16:13:39'),('a6c2419333de4206a020312ce5b1a60a',28,2,0,'2020-01-01 02:01:43','2019-12-31 14:01:42','2020-01-03 16:13:39'),('b1c7cb9183434ddca815566c3d95c4e0',28,2,0,'2019-12-24 22:40:27','2019-12-24 10:40:27','2020-01-03 16:13:39'),('b7d7334430fc4bcb82cec0fba01d0223',28,2,0,'2019-12-24 04:17:17','2019-12-23 16:17:16','2020-01-03 16:13:39'),('babdc671223040c68a164d4acb8256b6',28,2,0,'2019-12-24 04:15:33','2019-12-23 16:15:33','2020-01-03 16:13:39'),('bb9c18c4139d4bd0ba46663b1182e4f1',28,2,0,'2019-12-24 04:24:30','2019-12-23 16:24:29','2020-01-03 16:13:39'),('c086ac84b62a433dab110986e82df7f8',28,2,0,'2019-12-24 04:18:17','2019-12-23 16:18:17','2020-01-03 16:13:39'),('c4cc8f3c5ecf40f5b7afe4260a50b932',28,2,0,'2019-12-30 23:17:19','2019-12-30 11:17:19','2020-01-03 16:13:39'),('c58bc5ad40864f7488f022bc08384e89',28,2,0,'2019-12-24 04:23:37','2019-12-23 16:23:37','2020-01-03 16:13:39'),('d5c0097925a1428d87f7b9f469bdf439',28,2,0,'2019-12-24 04:51:46','2019-12-23 16:51:46','2020-01-03 16:13:39'),('d81f0f1c5ac843219a46d539b3769c9d',28,2,0,'2020-01-04 00:43:44','2020-01-03 12:43:44','2020-01-03 16:13:39'),('d890833eba584a49b240a9c6f678f203',28,2,0,'2019-12-24 04:24:31','2019-12-23 16:24:30','2020-01-03 16:13:39'),('df9cd1cbffaa47a6bcc47b3d7b44e2a1',28,2,0,'2019-12-24 04:19:17','2019-12-23 16:19:17','2020-01-03 16:13:39'),('e068a5eab99b4b6f8feec114202e569a',28,2,0,'2019-12-24 04:41:12','2019-12-23 16:41:11','2020-01-03 16:13:39'),('e1aa8c88a20042bb89dd7c0a9fc26861',28,2,0,'2019-12-24 04:17:27','2019-12-23 16:17:26','2020-01-03 16:13:39'),('e70c4f30ae6c4e58954332f258a031a7',28,2,0,'2019-12-24 04:24:30','2019-12-23 16:24:30','2020-01-03 16:13:39'),('e747a96b59b346cbb8421da585a0274d',28,2,0,'2019-12-31 01:07:54','2019-12-30 13:07:53','2020-01-03 16:13:39'),('e8e5b684ded2402d9533c3acaa62c542',28,2,0,'2019-12-24 04:07:24','2019-12-23 16:07:24','2020-01-03 16:13:39'),('f0cf63a39b624af3a2579b132b65045f',28,2,0,'2019-12-31 00:55:08','2019-12-30 12:55:08','2020-01-03 16:13:39'),('f1344ce7afe24fbe85f2c3b6d79102cf',28,2,0,'2019-12-31 01:10:16','2019-12-30 13:10:15','2020-01-03 16:13:39'),('f79421591e964e84b018b4c16a069bd3',28,2,0,'2019-12-24 04:41:06','2019-12-23 16:41:06','2020-01-03 16:13:39'),('fadc9946f6db4bd5a160fdcef75c131e',28,2,0,'2019-12-26 00:58:32','2019-12-25 12:58:32','2020-01-03 16:13:39');
/*!40000 ALTER TABLE `oauth2_refresh_token` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-03 18:47:40
