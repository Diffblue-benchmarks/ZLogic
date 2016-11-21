package com.mm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.mm.model.Employee;
import com.mm.model.VUser;
import com.mm.model.ZUser;

public class ZUserDaoImpl implements ZUserDao {
	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	@Override
	public boolean addUser(ZUser user) throws Exception {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public boolean loginUser(ZUser user) throws Exception {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean deActivateUser(Long user_ID, String status) throws Exception {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		Object o = session.load(ZUser.class, user_ID);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

	@Override
	public List<ZUser> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addVendor(VUser user) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
}
