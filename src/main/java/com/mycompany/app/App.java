package com.mycompany.app;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mycompany.app.mapper.HelloMapper;
import com.mycompany.app.domain.Hello;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
        // 连接数据库
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sessionFactory.openSession();
        HelloMapper mapper = session.getMapper(HelloMapper.class);
        Hello hello = mapper.findOneById(1);
        System.out.println(hello);
    }
}
