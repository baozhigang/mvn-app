# maven + spring-boot

## 数据库初始化：

    docker compose up -d mysql
    docker compose exec -T mysql mysql -u app_user -papp_pass app < table.sql

## 开发环境编译项目：

    docker compose run --rm jdk mvn clean compile

## 开发环境运行项目：

    docker compose up -d jdk