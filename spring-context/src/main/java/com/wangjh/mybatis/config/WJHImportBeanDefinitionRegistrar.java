package com.wangjh.mybatis.config;

import com.wangjh.mybatis.annotation.WJHMapperScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author wjh
 * @date 2022/12/2 01:30
 * @email 1151777592@qq.com
 */
public class WJHImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        // ImportBeanDefinitionRegistrar.super.registerBeanDefinitions(importingClassMetadata, registry, importBeanNameGenerator);

        // 扫描 路径

        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(WJHMapperScan.class.getName());
        String path = (String) annotationAttributes.get("value");
        // System.out.println("path = " + path);
        // 创建一个属于自己的扫描器 只扫描是接口就返回 true
        WJHClassPathBeanDefinitionScanner pathBeanDefinitionScanner = new WJHClassPathBeanDefinitionScanner(registry);
        // 添加一个 IncludeFilter ，让其忽略是否添加 @Component 注解（其中一种方式）
        // pathBeanDefinitionScanner.addIncludeFilter(new TypeFilter() {
        //     @Override
        //     public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //         return true;
        //     }
        // });

        // 扫描
        pathBeanDefinitionScanner.scan(path);
        //
        // AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        // beanDefinition.setBeanClass(WJHFactoryBean.class);
        // beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(UserMapper.class);
        // registry.registerBeanDefinition("userMapper", beanDefinition);
        //
        // AbstractBeanDefinition beanDefinition1 = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        // beanDefinition1.setBeanClass(WJHFactoryBean.class);
        // beanDefinition1.getConstructorArgumentValues().addGenericArgumentValue(OrderMapper.class);
        // registry.registerBeanDefinition("orderMapper", beanDefinition1);
    }
}
