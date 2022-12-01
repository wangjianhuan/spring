package com.wangjh.mybatis.config;

import com.wangjh.mybatis.annotation.WJHMapperScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wjh
 * @date 2022/12/1 23:30
 * @email 1151777592@qq.com
 */
@ComponentScan("com.wangjh.mybatis")
@WJHMapperScan("com.wangjh.mybatis.mapper")
public class AppConfig {
}
