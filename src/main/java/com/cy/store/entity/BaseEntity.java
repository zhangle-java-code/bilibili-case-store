package com.cy.store.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


//1.项目中许多实体类都会有日志相关的四个属性，所以在创建实体类之前，应先创建这些实体类的基类，将4个日志属性声明在基类中。在com.cy.store.entity包下创建BaseEntity类，作为实体类的基类。
// https://blog.csdn.net/TRK_YX/article/details/125574495
//
/** 实体类的基类 */
public class BaseEntity implements Serializable {
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

    // TODO Generate: Getter and Setter、Generate hashCode() and equals()、toString()
    // 2.在BaseEntity类中，使用IDEA的Generate功能，生成4个日志属性的Getter和Setter方法。


    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    // TODO 3.在BaseEntity类中，使用IDEA的Generate功能，生成hashCode()和equals()方法。
    // https://blog.csdn.net/JKQ8525350/article/details/125033115
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;

        BaseEntity that = (BaseEntity) o;

        if (getCreatedUser() != null ? !getCreatedUser().equals(that.getCreatedUser()) : that.getCreatedUser() != null)
            return false;
        if (getCreatedTime() != null ? !getCreatedTime().equals(that.getCreatedTime()) : that.getCreatedTime() != null)
            return false;
        if (getModifiedUser() != null ? !getModifiedUser().equals(that.getModifiedUser()) : that.getModifiedUser() != null)
            return false;
        return getModifiedTime() != null ? getModifiedTime().equals(that.getModifiedTime()) : that.getModifiedTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getCreatedUser() != null ? getCreatedUser().hashCode() : 0;
        result = 31 * result + (getCreatedTime() != null ? getCreatedTime().hashCode() : 0);
        result = 31 * result + (getModifiedUser() != null ? getModifiedUser().hashCode() : 0);
        result = 31 * result + (getModifiedTime() != null ? getModifiedTime().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
