package com.cy.store.entity;

import java.io.Serializable;

//继承自BaseEntity类，在类中声明与数据表中对应的属性。
public class User extends BaseEntity implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private Integer gender;
    private String avatar;
    private Integer isDelete;
}
