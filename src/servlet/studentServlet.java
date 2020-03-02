package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.student;
import service.impl.studentServiceImpl;

@WebServlet("/Query")
public class studentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//����һ���������ݵĴ���
				req.setCharacterEncoding("UTF-8");
				//��servlet��ȥ����service�е�����
				studentServiceImpl us=new studentServiceImpl();
				student s= new student();
				//���ҳ���ϵ�����
				String name=req.getParameter("name");
				//��Ҫ���������ת��,�õ���װ��
				int age=Integer.parseInt(req.getParameter("age"));
				s.setName("����");
				//����ʵ������setter����Ϊ˽�����Ը�ֵ
				s.setAge(20);
				us.query(s);
	}

}