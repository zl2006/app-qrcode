--创建数据库和用户，以及授权操作

--创建数据库
create database if not exists qrcode default charset utf8 collate utf8_general_ci;

--创建用户
CREATE USER qrcode_admin  IDENTIFIED  	BY 'qrcode_admin';						--管理员
CREATE USER qrcode_app IDENTIFIED  		BY 'qrcode_app' ;							--应用程序使用
CREATE USER qrcode_main IDENTIFIED  	BY 'qrcode_main';							--维护员


--授权, 安全原因实际环境中一定要指定ｉｐ地址，不能是％号。
grant all privileges on qrcode.* to qrcode_admin@"%" identified  by 'qrcode_admin';
grant all privileges on qrcode.* to qrcode_admin@"127.0.0.1" identified  by 'qrcode_admin';
grant all privileges on qrcode.* to qrcode_admin@"localhost" identified  by 'qrcode_admin';
flush privileges;

grant  select, update, delete,insert  on qrcode.* to qrcode_app@"%" identified  by 'qrcode_app';
grant  select, update, delete,insert   on qrcode.* to qrcode_app@"127.0.0.1" identified  by 'qrcode_app';
grant  select, update, delete,insert   on qrcode.* to qrcode_app@"localhost" identified  by 'qrcode_app';
flush privileges;

grant  select   on qrcode.* to qrcode_main@"%" identified  by 'qrcode_main';
grant  select   on qrcode.* to qrcode_main@"127.0.0.1" identified  by 'qrcode_main';
grant  select   on qrcode.* to qrcode_main@"localhost" identified  by 'qrcode_main';
flush privileges;


