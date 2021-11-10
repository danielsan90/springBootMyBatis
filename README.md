# springBootMyBatis

https://programmersought.com/article/6574775874/

MyBatis is a first class persistence framework with support for custom SQL, stored procedures and advanced mappings.
MyBatis eliminates almost all of the JDBC code and manual setting of parameters and retrieval of results.
MyBatis can use simple XML or Annotations for configuration and map primitives, Map interfaces and Java POJOs (Plain Old Java Objects) to database records.

1)
 <!-- mybatis con starter-->
 <dependency>
     <groupId>org.mybatis.spring.boot</groupId>
     <artifactId>mybatis-spring-boot-starter</artifactId>
     <version>1.3.1</version>
 </dependency>

 che fa lo starter?
to use MyBatis with Spring you need at least an SqlSessionFactory and at least one mapper interface.

con lo starter invece:

-Autodetect an existing DataSource
-Will create and register an instance of a SqlSessionFactory passing that DataSource as an input using the SqlSessionFactoryBean
-Will create and register an instance of a SqlSessionTemplate got out of the SqlSessionFactory
-Auto-scan your mappers, link them to the SqlSessionTemplate and register them to Spring context so they can be injected into your beans


2) qui ci vieni a scrive le query che ti servono
 Create UserMapper.xml in the resources —> mapper directory:

 <?xml version="1.0" encoding="UTF-8"?>
 <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
         "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
 <mapper namespace="com.my.dao.UserMapper">

     <resultMap id="baseMap" type="com.my.model.User">
         <result column="id" property="id" />
         <result column="user_name" property="userName" />
         <result column="user_age" property="userAge" />
     </resultMap>

     <!-- Insert data -->
     <insert id="insertUser" parameterType="com.my.model.User">
         insert into user (user_name,user_age) values (#{userName},#{userAge})
     </insert>

     <!-- Query data -->
     <select id="queryUser" parameterType="java.lang.String" resultType="com.my.model.User">
         select id,user_name as userName,user_age as userAge from user where id = #{id}
     </select>
 </mapper>


3) crei poi il rispettivo model entity java


4) crei il dao annotato con mapper
