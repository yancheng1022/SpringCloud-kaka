package com.kaka.controller;


import com.kaka.entities.Dept;
import com.kaka.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController
{
	@Autowired
	private DeptService service = null;

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	//һ�����÷��񷽷�ʧ�ܲ��׳��˴�����Ϣ�󣬻��Զ�����@HystrixCommand��ע�õ�fallbackMethod�������е�ָ������
	//@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id)
	{

		Dept dept = this.service.get(id);

		if (null == dept) {
			throw new RuntimeException("��ID��" + id + "û��û�ж�Ӧ����Ϣ");
		}

		return dept;
	}

//	public Dept processHystrix_Get(@PathVariable("id") Long id)
//	{
//		return new Dept().setDeptno(id).setDname("��ID��" + id + "û��û�ж�Ӧ����Ϣ,null--@HystrixCommand")
//				.setDb_source("no this database in MySQL");
//	}
}