/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:8889
 Source Schema         : usertest

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 24/05/2022 10:19:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for offices
-- ----------------------------
DROP TABLE IF EXISTS `offices`;
CREATE TABLE `offices` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `officeid` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKmww602ngtpwwq2dg03uscytgc` (`officeid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of offices
-- ----------------------------
BEGIN;
INSERT INTO `offices` VALUES (3, 12);
INSERT INTO `offices` VALUES (1, 22);
INSERT INTO `offices` VALUES (2, 200);
INSERT INTO `offices` VALUES (4, 1.2131231232131231e22);
COMMIT;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(30) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK3g1j96g94xpk3lpxl2qbl985x` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
BEGIN;
INSERT INTO `users` VALUES (10, 'jl.palmerah', 'email@gmail.cm', 'rodhiyanto');
INSERT INTO `users` VALUES (11, 'rodhi', 'rodhi@gmail.com', 'rodhi');
INSERT INTO `users` VALUES (13, 'rodhi', 'rodhi@gmail.com', 'rodhii');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
