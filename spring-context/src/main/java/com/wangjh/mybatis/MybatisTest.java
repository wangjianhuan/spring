package com.wangjh.mybatis;

import com.wangjh.mybatis.config.AppConfig;
import com.wangjh.mybatis.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wjh
 * @date 2022/12/1 23:30
 * @email 1151777592@qq.com
 */
public class MybatisTest {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        // Object appConfig = context.getBean("appConfig");
        // System.out.println("appConfig = " + appConfig);

        // ===============>>  原始jdbc start
        // InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        // SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        //
        // UserMapper mapper = sqlSession.getMapper(UserMapper.class);   // 代理对象
        //
        // mapper.selectById();
        //
        // sqlSession.commit();
        // sqlSession.flushStatements();
        // sqlSession.close();
        // ===============>>  原始jdbc end




        UserService userService = context.getBean("userService", UserService.class);

        userService.test();


    }
}
