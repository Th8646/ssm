# 1 Spring核心概念

## 1.1 核心概念

IOC（Inversion Of Control）：反转控制，可以管理Java对象

AOP：切面编程

JDBCTemplate：Spring提供的一套可以访问数据库的技术

DI(Dependency Injection)：依赖诸如，可以理解为IOC的另一种叫法

声明式事务：基于IOC/AOP实现事务管理

## 1.2 IOC原理

（1）Spring根据配置文件xml或者注解，创建对象，并放入容器（ConcurrentHashMap）中，并且可以完成对象之间的依赖

（2）当需要使用某个对象实例时，直接从容器中获取

（3）更加关注如何使用对象完成对应的业务