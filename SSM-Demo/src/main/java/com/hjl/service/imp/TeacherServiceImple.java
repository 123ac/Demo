package com.hjl.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjl.dao.TeacherInterface;
import com.hjl.entity.Teacher;
import com.hjl.service.TeacherService;

@Service //service��עҵ�����������ע����д��������ģ���ע������ཻ��Spring��������spring����ҪΪ����������
public class TeacherServiceImple implements TeacherService{
	@Autowired	//@Autowired ע�ͣ������Զ����Ա���������������캯�����б�ע������Զ�װ��Ĺ���
	TeacherInterface ti;
	
	/**
	 * ��ѯ��ʦ��Ϣ
	 */
	public List<Teacher> select() {
		// TODO Auto-generated method stub
		List<Teacher> list=ti.select();
		return list;
	}

}
