package service.impl;

import dao.userDao;
import dao.impl.usersDaoImpl;
import entity.user;
import service.userService;

public class userServiceImpl implements userService {
	//ҵ���������ݷ��ʲ������
	userDao dao=new usersDaoImpl();
	@Override
	public void save(user user) {
		//ʹ�����ݷ��ʲ���࣬�������ķ�����ʵ�����ݵ����
		dao.save(user);
	}

}
