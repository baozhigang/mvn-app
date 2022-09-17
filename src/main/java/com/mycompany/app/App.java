package com.mycompany.app;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mycompany.app.mapper.RegionMapper;
import com.mycompany.app.domain.Region;

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
        RegionMapper mapper = session.getMapper(RegionMapper.class);
        Region region = mapper.findOneById(1);
        System.out.println(region);

        System.out.println( "Hello World!" );
    }
}
