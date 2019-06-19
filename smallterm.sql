/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : smallterm

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2019-06-19 20:14:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for me_shop
-- ----------------------------
DROP TABLE IF EXISTS `me_shop`;
CREATE TABLE `me_shop` (
  `shop_id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_address` varchar(120) NOT NULL,
  `shop_name` varchar(80) NOT NULL,
  `shop_time` varchar(30) NOT NULL,
  `shop_phone` varchar(20) NOT NULL,
  `shop_image` varchar(255) NOT NULL,
  `shop_longitude` varchar(32) NOT NULL,
  `shop_latitude` varchar(32) NOT NULL,
  `shop_type` varchar(22) NOT NULL,
  `shop_desc` varchar(255) NOT NULL,
  `shop_spend` varchar(12) NOT NULL,
  `shop_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of me_shop
-- ----------------------------
INSERT INTO `me_shop` VALUES ('1', '杭州', '商户1', '8:00-20:00', '100-800820', 'http://money.ycwb.com/pic/2019-05/16/681aa47b-e207-4a62-b565-bb3afb723d67.jpg', '120.58845099124592', '29.965598592898655', '餐饮美食', '描述。。。。。。。。。。。。。。。。。', '20元', '2019-06-19 16:20:21');
INSERT INTO `me_shop` VALUES ('2', '杭州', '商户2', '8:00-20:00', '100-800820', 'http://www.lczp88.com/UploadFiles/FCK/2015-03/zhaopai0.jpg', '120.58845099124592', '29.965598592898655', '餐饮美食', '描述。。。。。。。。。。。。。。。。。', '20元', '2019-06-19 16:20:21');
INSERT INTO `me_shop` VALUES ('3', '杭州', '商户3', '8:00-20:00', '100-800820', 'http://money.ycwb.com/pic/2019-05/16/681aa47b-e207-4a62-b565-bb3afb723d67.jpg', '120.58845099124592', '29.965598592898655', '休闲娱乐', '描述。。。。。。。。。。。。。。。。。', '20元', '2019-06-19 16:20:21');
INSERT INTO `me_shop` VALUES ('4', '杭州', '商户4', '8:00-20:00', '100-800820', 'http://www.lczp88.com/UploadFiles/FCK/2015-03/zhaopai0.jpg', '120.58845099124592', '29.965598592898655', '休闲娱乐', '描述。。。。。。。。。。。。。。。。。', '20元', '2019-06-19 16:20:21');
INSERT INTO `me_shop` VALUES ('5', '杭州', '商户5', '8:00-20:00', '100-800820', 'http://money.ycwb.com/pic/2019-05/16/681aa47b-e207-4a62-b565-bb3afb723d67.jpg', '120.58845099124592', '29.965598592898655', '餐饮美食', '描述。。。。。。。。。。。。。。。。。', '20元', '2019-06-19 16:20:21');
INSERT INTO `me_shop` VALUES ('6', '杭州', '商户6', '8:00-20:00', '100-800820', 'http://www.lczp88.com/UploadFiles/FCK/2015-03/zhaopai0.jpg', '120.58845099124592', '29.965598592898655', '餐饮美食', '描述。。。。。。。。。。。。。。。。。', '20元', '2019-06-19 16:20:21');
INSERT INTO `me_shop` VALUES ('7', '杭州', '商户7', '8:00-20:00', '100-800820', 'http://money.ycwb.com/pic/2019-05/16/681aa47b-e207-4a62-b565-bb3afb723d67.jpg', '120.58845099124592', '29.965598592898655', '休闲娱乐', '描述。。。。。。。。。。。。。。。。。', '20元', '2019-06-19 16:20:21');
INSERT INTO `me_shop` VALUES ('8', '杭州', '商户8', '8:00-20:00', '100-800820', 'http://www.lczp88.com/UploadFiles/FCK/2015-03/zhaopai0.jpg', '120.58845099124592', '29.965598592898655', '休闲娱乐', '描述。。。。。。。。。。。。。。。。。', '20元', '2019-06-19 16:20:21');
INSERT INTO `me_shop` VALUES ('9', '杭州', '商户9', '8:00-20:00', '100-800820', 'http://money.ycwb.com/pic/2019-05/16/681aa47b-e207-4a62-b565-bb3afb723d67.jpg\r\nhttp://www.lczp88.com/UploadFiles/FCK/2015-03/zhaopai0.jpg', '120.58845099124592', '29.965598592898655', '休闲娱乐', '描述。。。。。。。。。。。。。。。。。', '20元', '2019-06-19 16:20:21');

-- ----------------------------
-- Table structure for me_user
-- ----------------------------
DROP TABLE IF EXISTS `me_user`;
CREATE TABLE `me_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of me_user
-- ----------------------------
INSERT INTO `me_user` VALUES ('1', '123456', '123456');
INSERT INTO `me_user` VALUES ('2', '周栋利', '111111');
INSERT INTO `me_user` VALUES ('3', '郑逸', '111111');
INSERT INTO `me_user` VALUES ('4', '张剑峰', '111111');
INSERT INTO `me_user` VALUES ('5', '徐文铎', '111111');
INSERT INTO `me_user` VALUES ('6', '余志强', '111111');
INSERT INTO `me_user` VALUES ('51', '渣渣涛', 'abcaaa');
INSERT INTO `me_user` VALUES ('52', '渣渣12', '2323');
