package com.wangjh.mybatis.config;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.classreading.MetadataReader;

import java.io.IOException;
import java.util.Objects;
import java.util.Set;

/**
 * @author wjh
 * @date 2022/12/2 02:00
 * @email 1151777592@qq.com
 */
public class WJHClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

    public WJHClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
        super(registry);
    }

    /**
     * 重写 isCandidateComponent 方法   如果拿到的类是一个接口，就返回 true
     */
    @Override
    protected boolean isCandidateComponent(AnnotatedBeanDefinition annotatedBeanDefinition) {
        return annotatedBeanDefinition.getMetadata().isInterface();
    }

    @Override
    protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
        Set<BeanDefinitionHolder> beanDefinitionHolders = super.doScan(basePackages);
        for (BeanDefinitionHolder beanDefinitionHolder : beanDefinitionHolders) {
            BeanDefinition beanDefinition = beanDefinitionHolder.getBeanDefinition();
            beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(Objects.requireNonNull(beanDefinition.getBeanClassName()));
            beanDefinition.setBeanClassName(WJHFactoryBean.class.getName());
        }
        return beanDefinitionHolders;
    }

    // 重写这个方法   让其在扫描的时候直接忽略注解   扫描所有的类
    @Override
    protected boolean isCandidateComponent(MetadataReader metadataReader) throws IOException {
        return true;
    }
}
