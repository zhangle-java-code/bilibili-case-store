package com.cy.store.mapper;
import com.cy.store.entity.User;
import org.apache.ibatis.annotations.Mapper;

//用户模块持久层接口
// ❓ MyBatis与Spring整合后需要实现实体和数据表的映射关系。实现实体和数据表的映射关系可以在Mapper接口上添加@Mapper注解。
// 建议以后直接在SpringBoot启动类中加@MapperScan("mapper包") 注解，这样会比较方便，不需要对每个Mapper都添加@Mapper注解。

@Mapper
public interface UserMapper {
    /**
     * 插入用户数据
     * @param user 用户数据
     * @return 受影响的行数
     */
    Integer insert(User user);

    /**
     * 根据用户名查询用户数据
     * @param username 用户名
     * @return 匹配的用户数据，如果没有匹配的数据，则返回null
     */
    User findByUsername(String username);

}
