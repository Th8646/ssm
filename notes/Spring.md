# 1 Spring核心概念

## 1.1 核心概念

IOC（Inversion Of Control）：反转控制，可以管理Java对象。

DI(Dependency Injection)：依赖注入，可以理解为IOC的另一种叫法

AOP：切面编程

JDBCTemplate：Spring提供的一套可以访问数据库的技术

声明式事务：基于IOC/AOP实现事务管理

## 1.2 IOC原理

（1）Spring根据配置文件xml或者注解，创建对象，并放入容器（ConcurrentHashMap）中，并且可以完成对象之间的依赖

（2）当需要使用某个对象实例时，直接从容器中获取

（3）更加关注如何使用对象完成对应的业务

## 1.3 Spring容器结构

简单的实现机制：

(1) 



![image-20240718134316050](image-20240718134316050.png)

![image-20240718134731309](image-20240718134731309.png)

![image-20240718134749522](image-20240718134749522.png)

<img src="image-20240718135004376.png" alt="image-20240718135004376"/>

![image-20240718135849700](image-20240718135849700.png)