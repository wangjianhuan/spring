package com.wangjh.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author wjh
 * @date 2022/12/2 00:17
 * @email 1151777592@qq.com
 */
public interface UserMapper {

    @Select("select 'user'")
    String selectById();
}
