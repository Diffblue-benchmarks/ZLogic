package com.mm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mm.dao.ZUserDao;
import com.mm.model.VUser;
import com.mm.model.ZUser;

public class ZUserServicesImpl implements ZUserServices {

	@Autowired
	ZUserDao zUserDao;
	
	@Override
	public boolean addUser(ZUser user) throws Exception {
		// TODO Auto-generated method stub
		return zUserDao.addUser(user);
	}

	@Override
	public boolean loginUser(ZUser user) throws Exception {
		// TODO Auto-generated method stub
		return zUserDao.loginUser(user);
	}

	@Override
	public boolean deActivateUser(Long user_ID,String status) throws Exception {
		// TODO Auto-generated method stub
		return zUserDao.deActivateUser(user_ID,status);
	}

	@Override
	public List<ZUser> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return zUserDao.getUserList();
	}

	@Override
	public boolean addVendor(VUser user) throws Exception {
		// TODO Auto-generated method stub
		return zUserDao.addVendor(user);
	}

}
