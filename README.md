# maven + mybatis

## 构建环境

    docker pull modicn/openjdk:8-bullseye
    docker build ./openjdk -t bao/openjdk

## 进入容器

    ./run-container.sh

## 问题

执行命令：

    mvn package

    java -cp /home/pilot/.m2/repository/mysql/mysql-connector-java/5.1.38/mysql-connector-java-5.1.38.jar:/home/pilot/.m2/repository/junit/junit/4.11/junit-4.11.jar:/home/pilot/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/pilot/.m2/repository/org/mybatis/mybatis/3.5.10/mybatis-3.5.10.jar:target/mvn-app-1.0-SNAPSHOT.jar  com.mycompany.app.App

报错：

    Exception in thread "main" org.apache.ibatis.exceptions.PersistenceException:
    Error building SqlSession.
    The error may exist in com.mycompany.app.mapper.RegionMapper
    Cause: org.apache.ibatis.builder.BuilderException: Error parsing SQL Mapper Configuration. Cause: java.io.IOException: Could not find resource com.mycompany.app.mapper.RegionMapper