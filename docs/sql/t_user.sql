USE store;
# 2.在store数据库中创建t_user用户数据表
DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user
(
    uid           INT AUTO_INCREMENT COMMENT '用户id',
    username      VARCHAR(20) NOT NULL UNIQUE COMMENT '用户名',
    password      CHAR(32)    NOT NULL COMMENT '密码',
    salt          CHAR(36) COMMENT '盐值',
    phone         VARCHAR(20) COMMENT '电话号码',
    email         VARCHAR(30) COMMENT '电子邮箱',
    gender        INT COMMENT '性别:0-女，1-男',
    avatar        VARCHAR(50) COMMENT '头像',
    is_delete     INT COMMENT '是否删除：0-未删除，1-已删除',
    created_user  VARCHAR(20) COMMENT '日志-创建人',
    created_time  DATETIME COMMENT '日志-创建时间',
    modified_user VARCHAR(20) COMMENT '日志-最后修改执行人',
    modified_time DATETIME COMMENT '日志-最后修改时间',
    PRIMARY KEY (uid)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户数据表';

select *
from t_user;


# 插入数据
# INSERT INTO t_user (除了uid以外的字段列表) VALUES (匹配的值列表)
INSERT INTO t_user
(username, password, salt, phone, email, gender, avatar, is_delete, created_user, created_time, modified_user,modified_time)
VALUES
    ('admin', '123456', '123456', '12345678901', 'zhangle@163.com', 1, '/upload/1.jpg', 0, 'admin', NOW(), 'admin',NOW());


select * from t_user;
SELECT * FROM t_user WHERE username='admin'

