package com.wangjh.mybatis.annotation;

import com.wangjh.mybatis.config.WJHImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author wjh
 * @date 2022/12/2 01:26
 * @email 1151777592@qq.com
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(WJHImportBeanDefinitionRegistrar.class)
public @interface WJHMapperScan {

    String value();
}
