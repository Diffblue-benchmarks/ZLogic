package com.mm.dao;

import java.util.List;

import com.mm.model.City;
import com.mm.model.District;
import com.mm.model.State;
import com.mm.model.ZipCode;

public class ZMasterDaoImpl implements ZMasterDao {

	@Override
	public List<State> getState() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<District> getDistrict(Long stateID, Boolean status)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> getCity(Long districtID, Boolean status) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ZipCode> getZipCode(Long cityID, Boolean status)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
