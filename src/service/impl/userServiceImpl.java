package service.impl;

import dao.userDao;
import dao.impl.usersDaoImpl;
import entity.user;
import service.userService;

public class userServiceImpl implements userService {
	//业务层调用数据访问层的数据
	userDao dao=new usersDaoImpl();
	@Override
	public void save(user user) {
		//使用数据访问层的类，调用它的方法来实现数据的添加
		dao.save(user);
	}

}
