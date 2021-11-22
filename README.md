# 设计模式实践与运用

## 简介

设计模式无非通过（花式运用）：

- 组合
- extents继承 / implement实现
- 多态
- 抽象



**6大原则（规范）：**

**总原则——开闭原则（Open Closed Principle）**

**1、单一职责原则（Single Responsibility Principle）**

**2、里氏替换原则（Liskov Substitution Principle）**

**3、依赖倒置原则（Dependence Inversion Principle）**

**4、接口隔离原则（Interface Segregation Principle）**

**5、迪米特法则（最少知道原则）(Law of Demeter)**

**6、合成复用原则（Composite Reuse Principle）**



## **疑问：**

为什么要这么设计我直接写不是跟直观嘛？

你的场景过于简单，项目规模还不够大，当项目类、方法和代码过多，相信我你会看的眼花缭乱
因此使用设计模式也是重构代码方法之一



## **好处：**

减少代码之间的耦合

增强可读性扩展性可维护性



**我的目的：**创建易理解例子帮助理解为什么设计模式要这么做 

**学习设计模式模板：**

- 设计模式应用场景
- 解决了什么问题 
- 优缺点是什么





## **23种设计模式**

- [x] 监听器模式（listener）	类似观察者模式



**创建型模式**关注点是如何创建对象，其核心思想是要把对象的创建和使用相分离，这样使得两者能相对独立地变换。

**创建型模式:**

- [x] 工厂方法：Factory Method
- [x] 抽象工厂：Abstract Factory
- [x] 建造者：Builder
- [x] 原型：Prototype
- [x] 单例：Singleton



**结构型模式**主要涉及如何组合各种对象以便获得更好、更灵活的结构。虽然面向对象的继承机制提供了最基本的子类扩展父类的功能，但结构型模式不仅仅简单地使用继承，而更多地通过组合与运行期的动态组合来实现更灵活的功能。

**结构型模式:**

- [x] 装饰器模式
- [x] 组合模式
- [x] 适配器模式
- [x] 代理模式
- [x] 享元模式
- [x] 桥接模式
- [x] 外观模式



**行为型模式**主要涉及算法和对象间的职责分配。通过使用对象组合，行为型模式可以描述一组对象应该如何协作来完成一个整体任务。

**行为型模式:**

- [ ] 责任链
- [x] 命令 请求责任与行为分离
- [x] 解释器
- [x] 迭代器 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示
- [x] 中介者 
- [x] 备忘录
- [x] 观察者
- [ ] 状态
- [x] 策略
- [x] 模板方法
- [x] 访问者 数据结构与数据操作分离

