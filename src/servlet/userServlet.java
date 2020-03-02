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
 * 操作用户信息的servlet
 * @author 86152
 *
 */
//注解
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
		//设置一个请求数据的代码
		req.setCharacterEncoding("UTF-8");
		//在servlet中去访问service中的数据
		userServiceImpl us=new userServiceImpl();
		user user= new user();
		//获得页面上的数据
		String name=req.getParameter("name");
		//需要对年龄进行转换,用到包装类
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName("张三");
		//调用实体类中setter方法为私有属性赋值
		user.setAge(20);
		us.save(user);
	}
	
}
