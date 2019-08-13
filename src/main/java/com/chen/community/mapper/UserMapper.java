package com.chen.community.mapper;

import com.chen.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @className UserMapper
 * @Author Administrator
 * @Data 2019/8/13
 */
@Mapper
public interface UserMapper {
    @Insert("Insert into user (name,account_id,token,gmt_create,gmt_modified) value (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
