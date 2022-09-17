ls
mkdir _home/.m2
touch _home/.m2/settings.xml
mvn package
touch _home/.gitignore
mvn install
mvn package
java -cp /home/pilot/.m2/repository/mysql/mysql-connector-java/5.1.38/mysql-connector-java-5.1.38.jar:/home/pilot/.m2/repository/junit/junit/4.11/junit-4.11.jar:/home/pilot/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/pilot/.m2/repository/org/mybatis/mybatis/3.5.10/mybatis-3.5.10.jar:target/mvn-app-1.0-SNAPSHOT.jar  com.mycompany.app.App
exit
