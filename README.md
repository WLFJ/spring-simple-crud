# 极其简单的CRUD系统

首先建立如下table:

```
mysql> desc wywtb_inviteJob;
+---------+------+------+-----+---------+----------------+
| Field   | Type | Null | Key | Default | Extra          |
+---------+------+------+-----+---------+----------------+
| wywid   | int  | NO   | PRI | NULL    | auto_increment |
| wywname | text | NO   |     | NULL    |                |
| wywage  | int  | NO   |     | NULL    |                |
| wywjob  | text | NO   |     | NULL    |                |
+---------+------+------+-----+---------+----------------+
4 rows in set (0.01 sec)
```

之后……就可以运行项目了。

## 特性

本项目支持简单的C、U、D。R部分使用了MyBatis的动态SQL生成查询语句。可以在此基础上完成任何大作业（并不）。

## 使用许可

本项目遵循WTFPL协议。

## 后记

老师布置两个小时写好……真的太艰难了。不过运气不错，提前半个小时搞定啦～
