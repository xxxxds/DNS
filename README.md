# DNS Java项目

## 项目介绍

这是一个基于Maven构建的Java DNS项目，提供基本的DNS服务功能。

## 技术栈

- Java 21
- Maven 3.x
- JUnit 5

## 项目结构

```
DNS/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── dns/
│   │               ├── Main.java          # 主类
│   │               └── DNSService.java    # DNS服务类
│   └── test/
│       └── java/
│           └── com/
│               └── dns/
│                   └── DNSServiceTest.java # 测试类
├── pom.xml                                 # Maven配置文件
└── README.md                              # 项目说明
```

## 快速开始

### 编译项目
```bash
mvn compile
```
### 终端乱码解决
```bash
chcp 65001
```

### 运行项目
```bash
mvn exec:java
```

### 运行测试
```bash
mvn test
```

### 清理项目
```bash
mvn clean
```

### 打包项目
```bash
mvn package
```

### 完整的构建和测试
```bash
mvn clean compile test package
```

## 功能特性

- DNS服务启动/停止管理
- 域名解析功能（示例实现）
- 完善的单元测试

## 开发说明

本项目使用Maven进行依赖管理和构建，所有操作都通过Maven命令完成：

1. 开发环境要求：Java 21+
2. 构建工具：Maven 3.x
3. 测试框架：JUnit 5
4. 编码规范：UTF-8
5. 开发在dev分支进行，master分支为稳定版本

## 贡献指南

1. Fork本项目
2. 创建特性分支
3. 提交更改
4. 推送到分支
5. 创建Pull Request

## 许可证

本项目采用MIT许可证。 