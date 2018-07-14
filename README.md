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
