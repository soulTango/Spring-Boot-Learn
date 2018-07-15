# Spring-Boot-Learn
Spring Boot的学习
按照网上配置springBoot的与Mybatis的结合，总是扫描不到mapper的*.xml文件，
解决方法首先把mapper的*.xml文件放到resoures下面，网上还有其他两种方式，
也可以做到，其次就是我遇到的问题，我的application.yml文件中在配置mybatis
时，因为是粘贴的代码，mybatis: 前面多了一个空格，不仔细看是看不出来的。
把空格去掉后就可以顺利完成结合了。
yml文件的层级结构是其特点，但同时也要求使用者更加细心，不要因为空格等原因
导致配置出错。
实现Mybatis的二级缓存，新建一个类实现org.apache.ibatis.cache.Cache接口，
但是自己实现的二级缓存，必须要有一个带id的构造函数，否则会报错，具体的搭
建是参照网址：https://www.jb51.net/article/129812.htm 来学习的。

spring boot application.yml文件中的常量值的获取：
1、引入依赖：作用是支持 @ConfigurationProperties 注解，代码：
<dependency> 
  <groupId>org.springframework.boot</groupId> 
  <artifactId>spring-boot-configuration-processor</artifactId> 
  <optional>true</optional> 
</dependency>

这是application.yml文件中自定义的属性及常量值：
book:
  name: chinese
  author: mark

接下来创建一个bean来接收配置信息，bean中要有的注解：
@Component
@ConfigurationProperties(prefix="book") //接收application.yml中的book下面的属性
bean中的属性要和application.yml名称一致，如果是String类型的一定要有setter方法。
然后在需要使用属性的地方自动注入bean就可以了。
注意点：如果形如
bookTell:
  name: chinese
  author: mark
不能使用驼峰命名法，要使用book-tell来代替，不能有大写字母。