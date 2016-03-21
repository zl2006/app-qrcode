-------------------------------------------------模块名称------------------------------------------------------------
--服务目录表
CREATE TABLE IF NOT EXISTS `TB_SERVICE_CATEGORY` (
  `CATEGORY_ID` INT NOT NULL AUTO_INCREMENT COMMENT '服务类目标识\n',
  `PARENT_ID` INT NOT NULL DEFAULT -1 COMMENT '父类目标识, 顶级类目值为-1. 默认为-1.\n\n',
  `NAME` VARCHAR(32) NOT NULL COMMENT '服务类目名称\n',
  `ICON` VARCHAR(128) NULL COMMENT '类目图标',
  `STATUS` VARCHAR(8) NOT NULL COMMENT '状态,0为无效,1为有效',
  `DESCRIPTION` VARCHAR(128) NULL COMMENT '类目描述\n',
  `CREATE_TIME` TIMESTAMP NULL,
  `UPDATE_TIME` TIMESTAMP NULL,
  PRIMARY KEY (`CATEGORY_ID`))
ENGINE = InnoDB
COMMENT = '服务类目\n';


