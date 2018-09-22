package com.kaka.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor  //�ղι��캯��
//@AllArgsConstructor ȫ�ι��캯��
@Data  //get set ����
@Accessors(chain = true)  //֧����ʽ���� ���ƣ�Person px =new Person().setOld("xxx").setName("xxx");

public class Dept implements Serializable {
    private Long 	deptno; // ����
    private String 	dname; // ��������
    private String 	db_source;// �����Ǹ����ݿ⣬��Ϊ΢����ܹ�����һ�������Ӧһ�����ݿ⣬ͬһ����Ϣ���洢����ͬ���ݿ�

    public Dept(String dname) {
        this.dname = dname;
    }
}
