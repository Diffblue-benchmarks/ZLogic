package com.mm.services;

import java.util.List;

import com.mm.model.VUser;
import com.mm.model.ZUser;

public interface ZUserServices {
	public boolean addUser(ZUser user) throws Exception;
	public boolean addVendor(VUser user) throws Exception;
	public boolean loginUser(ZUser user) throws Exception;
	public boolean deActivateUser(Long user_ID, String status) throws Exception;
	public List<ZUser> getUserList() throws Exception;
}
