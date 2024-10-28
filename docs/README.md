一、项目介绍

本项目是基于vue、springboot、mysql等技术栈的前后端分离的面向社团的文件管理系统，主要功能有：
1.文件操作：用户可以上传、下载、删除、分享文件，文件分类、搜索功能；
2.备份管理：文件支持云端备份和本地备份双重备份，对文件进行版本管理；
3.系统设置：管理员可以设置系统参数，如：文件大小限制、备份周期等；
4.文件搜索：用户可以搜索文件，根据文件名、标签、描述进行搜索，并可以预览文件内容；
5.文件分类：用户可以对文件进行自定义分类，便于管理；
6.权限管理：用户可以管理自己的文件，设置文件权限；
7.用户管理：管理员可以管理用户，分配角色、权限；
8.系统日志：管理员可以查看系统日志，对用户操作进行记录；

二、项目目录结构

```
└── fil-of-shadow
     └── docs
         ├── README.md // 项目介绍
         ├── 项目需求文档.md // 项目需求文档
         ├── 项目设计文档.md // 项目设计文档
         ├── 项目开发文档.md // 项目开发文档
         ├── 项目测试文档.md // 项目测试文档
         └── 项目部署文档.md // 项目部署文档
    └── fif-shadow
         └── src // 项目源码
             └── main // 项目主体
                └── java // 项目java源码
                    └── com.shadow.fifshadow // 项目核心代码
                         └── common // 项目公共代码
                            ├── enumeration // 枚举类
                            ├── exception // 异常类
                            ├── ResponseStatus.java // 响应状态类
                            └── Result.java // 统一返回结果类
                        ├── config // 项目配置
                        ├── controller // 项目控制器
                        ├── entity // 实体类
                        ├── filter // 过滤器
                        ├── mapper // 数据库映射
                        ├── service // 业务逻辑层
                        └── util // 工具类
                └── resources
                    ├── application.yml // 项目配置文件
                    └── application-dev.yml // 项目开发环境配置文件
         └── pom.xml // 项目依赖管理文件
    └── sdk // 项目SDK
         └── alist-sdk // 阿里云OSS SDK
             └── src // SDK源码
                 └── main // SDK主体代码
                     └── java // SDK java源码
                         └── top.wpaint // SDK核心代码
                               └── api // SDK接口定义
                                  ├── auth // 阿里云OSS认证接口
                                  ├── common // 阿里云OSS公共接口
                                  ├── fs // 文件存储接口
                                  ├── API.java // 阿里云OSS接口定义类
                              ├── client // 阿里云OSS客户端类
                              ├── common // 阿里云OSS公共类
                              ├── config // 阿里云OSS配置类
                              └── entity // 阿里云OSS实体类
                                  ├── fs // 文件存储实体类
                                  ├── user // 用户实体类
                                  └── ResponseEntity.java // 阿里云OSS响应类
                              └──  util // 阿里云OSS工具类
                 └── pox.xml // SDK依赖管理文件
```
三、项目技术栈

前端：Vue    
后端：Spring、Mybatis、MySQL    
数据库：MySQL    
云存储：阿里云OSS    
开发工具：IDEA、Maven、Git    
版本管理：Git     


