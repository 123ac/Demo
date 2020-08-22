package com.hjl.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjl.dao.TeacherInterface;
import com.hjl.entity.Teacher;
import com.hjl.service.TeacherService;

@Service //service标注业务层组件；这个注解是写在类上面的，标注将这个类交给Spring容器管理，spring容器要为他创建对象。
public class TeacherServiceImple implements TeacherService{
	@Autowired	//@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作
	TeacherInterface ti;
	
	/**
	 * 查询教师信息
	 */
	public List<Teacher> select() {
		// TODO Auto-generated method stub
		List<Teacher> list=ti.select();
		return list;
	}

}
