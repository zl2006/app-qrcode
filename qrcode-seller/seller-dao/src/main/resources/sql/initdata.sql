------数据初始化
/*产品管理模块***********************************************************************************/
--类目
INSERT INTO `TB_PQ_CATEGORY` (`CATEGORY_ID`, `CODE`, `NAME`, `PARENT_ID`, `IS_LEAF`, `STATUS`, `HOLD1`, `METO`, `CREATE_TIME`, `UPDATE_TIME`) VALUES ('1', 'MOBILE', '手机', '-1', '0', '1', 'hold', '手机，下面可分智能手机，功能手机等', '2016-03-30 15:42:31', '2016-03-30 15:42:31');
INSERT INTO `TB_PQ_CATEGORY` (`CATEGORY_ID`, `CODE`, `NAME`, `PARENT_ID`, `IS_LEAF`, `STATUS`, `HOLD1`, `METO`, `CREATE_TIME`, `UPDATE_TIME`) VALUES ('2', 'FUNC_MOBILE', '功能手机', '1', '0', '1', 'hold', '功能手机', '2016-03-30 15:42:31', '2016-03-30 15:42:31');
INSERT INTO `TB_PQ_CATEGORY` (`CATEGORY_ID`, `CODE`, `NAME`, `PARENT_ID`, `IS_LEAF`, `STATUS`, `HOLD1`, `METO`, `CREATE_TIME`, `UPDATE_TIME`) VALUES ('3', 'TEST', '测试', '-1', '0', '1', 'hold', '测试', '2016-03-30 15:42:31', '2016-03-30 15:42:31');
--产品
INSERT INTO `TB_PQ_PRODUCT` (`PRODUCT_ID`, `PRD_CODE`, `CATEGORY_ID`, `NAME`, `BRAND`, `TITLE`, `PRICE`, `STATUS`,`SELLER_NICK`, `CREATE_TIME`, `UPDATE_TIME`) VALUES ('1', 'HONGMI3_MOBILE', '2', '红米3', '小米', '红米3智能手机', '999', '1','liangzhou', '2016-01-01 00:00:00', '2016-01-01 00:00:00');
INSERT INTO `TB_PQ_PRODUCT` (`PRODUCT_ID`, `PRD_CODE`, `CATEGORY_ID`, `NAME`, `BRAND`, `TITLE`, `PRICE`, `STATUS`,`SELLER_NICK`, `CREATE_TIME`, `UPDATE_TIME`) VALUES ('2', 'HONGMI2_MOBILE', '2', '红米2', '小米', '红米2智能手机', '699', '1','liangzhou', '2016-01-01 00:00:00', '2016-01-01 00:00:00');
INSERT INTO `TB_PQ_PRODUCT` (`PRODUCT_ID`, `PRD_CODE`, `CATEGORY_ID`, `NAME`, `BRAND`, `TITLE`, `PRICE`, `STATUS`,`SELLER_NICK`, `CREATE_TIME`, `UPDATE_TIME`) VALUES ('3', 'XIAOMI_NOTE2_MOBILE', '2', '小米NOTE2', '小米', '小米NOTE2智能手机', '1699', '1','liangzhou', '2016-01-01 00:00:00', '2016-01-01 00:00:00');
update TB_PQ_PRODUCT set seller_nick = '18665867002';


