/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : smallterm

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2019-06-18 19:13:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for me_shop
-- ----------------------------
DROP TABLE IF EXISTS `me_shop`;
CREATE TABLE `me_shop` (
  `shop_id` int(11) NOT NULL,
  `shop_address` varchar(120) NOT NULL,
  `shop_name` varchar(80) NOT NULL,
  `shop_time` varchar(30) NOT NULL,
  `shop_phone` varchar(20) NOT NULL,
  `shop_image` varchar(120) NOT NULL,
  `shop_longitude` varchar(16) NOT NULL,
  `shop_latitude` varchar(16) NOT NULL,
  `shop_type` varchar(2) NOT NULL,
  `shop_desc` varchar(255) NOT NULL,
  `shop_spend` varchar(12) NOT NULL,
  `shop_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of me_shop
-- ----------------------------

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
INSERT INTO `me_user` VALUES ('1', '张松韬', '111111');
INSERT INTO `me_user` VALUES ('2', '周栋利', '111111');
INSERT INTO `me_user` VALUES ('3', '郑逸', '111111');
INSERT INTO `me_user` VALUES ('4', '张剑峰', '111111');
INSERT INTO `me_user` VALUES ('5', '徐文铎', '111111');
INSERT INTO `me_user` VALUES ('6', '余志强', '111111');
INSERT INTO `me_user` VALUES ('51', '渣渣涛', 'abcaaa');
INSERT INTO `me_user` VALUES ('52', '渣渣12', '2323');
