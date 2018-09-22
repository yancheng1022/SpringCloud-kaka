package com.kaka.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor  //空参构造函数
//@AllArgsConstructor 全参构造函数
@Data  //get set 方法
@Accessors(chain = true)  //支持链式调用 类似：Person px =new Person().setOld("xxx").setName("xxx");

public class Dept implements Serializable {
    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
