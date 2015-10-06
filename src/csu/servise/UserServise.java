package csu.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import csu.dao.UserDao;
import csu.po.User;


@Service("UserServise")
public class UserServise {
	
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	public void add(String uname){
		System.out.println("UserServise.add()");
		User user = new User();
		user.setUname(uname);
		userDao.add(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	
	

}
