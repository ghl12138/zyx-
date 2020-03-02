package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.user;
import service.impl.userServiceImpl;
/**
 * �����û���Ϣ��servlet
 * @author 86152
 *
 */
//ע��
@WebServlet("/Add")
public class userServlet extends HttpServlet {

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
		userServiceImpl us=new userServiceImpl();
		user user= new user();
		//���ҳ���ϵ�����
		String name=req.getParameter("name");
		//��Ҫ���������ת��,�õ���װ��
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName("����");
		//����ʵ������setter����Ϊ˽�����Ը�ֵ
		user.setAge(20);
		us.save(user);
	}
	
}
