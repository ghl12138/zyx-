package service.impl;

import dao.studentDao;
import dao.impl.studentDaoImpl;
import entity.student;
import service.studentService;

public class studentServiceImpl implements studentService{
	studentDao dao=new studentDaoImpl();
	@Override
	public void query(student id) {
		//
		dao.query(id);
	}

}
