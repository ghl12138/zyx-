package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.userDao;
import entity.user;

public class usersDaoImpl implements userDao{

	@Override
	public void save(user user) {
		// ����һ�������������û���Ϣ
		List<user> list=new ArrayList<user>();
		list.add(user);
		for(user user2:list) {
			System.out.println(user2.getName()+","+user2.getAge());
		}
	}

	@Override
	public void update(user user) {
		System.out.println("ִ���޸��û���Ϣ�Ĳ���");
	}
	
}
