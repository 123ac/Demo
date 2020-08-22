package com.hjl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hjl.entity.Teacher;
import com.hjl.service.TeacherService;

@org.springframework.stereotype.Controller //��������ע�����
public class Controller {
	@Autowired
	TeacherService ts;
	
	//��ѯ��ʦ��Ϣ
	@RequestMapping(value="query")
	public ModelAndView query() {
		List<Teacher> list=ts.select();
		ModelAndView mav=new ModelAndView();
		mav.addObject("list", list);
		//��תָ���ҳ��index.jsp
		mav.setViewName("select");
		return mav;		
	}
 	
}