--创建数据库和用户，以及授权操作

--创建数据库
create database if not exists market default charset utf8 collate utf8_general_ci;

--创建用户
CREATE USER market_admin  IDENTIFIED  BY 'market_admin';			--管理员
CREATE USER market_app IDENTIFIED  BY 'market_app' ;						--应用程序使用
CREATE USER market_main IDENTIFIED  BY 'market_main';					--维护员


--授权, 安全原因实际环境中一定要指定ｉｐ地址，不能是％号。
grant all privileges on market.* to market_admin@"%" identified  by 'market_admin';
grant all privileges on market.* to market_admin@"127.0.0.1" identified  by 'market_admin';
grant all privileges on market.* to market_admin@"localhost" identified  by 'market_admin';
flush privileges;

grant  select, update, delete,insert  on market.* to market_app@"%" identified  by 'market_app';
grant  select, update, delete,insert   on market.* to market_app@"127.0.0.1" identified  by 'market_app';
grant  select, update, delete,insert   on market.* to market_app@"localhost" identified  by 'market_app';
flush privileges;

grant  select   on market.* to market_main@"%" identified  by 'market_main';
grant  select   on market.* to market_main@"127.0.0.1" identified  by 'market_main';
grant  select   on market.* to market_main@"localhost" identified  by 'market_main';
flush privileges;


