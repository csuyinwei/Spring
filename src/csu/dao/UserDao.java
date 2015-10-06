package csu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import csu.po.User;

@Repository("userDao")
public class UserDao {
	@Autowired()
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void add(User user){
		System.out.println("UserDao.add()");
		hibernateTemplate.save(user);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	

}
