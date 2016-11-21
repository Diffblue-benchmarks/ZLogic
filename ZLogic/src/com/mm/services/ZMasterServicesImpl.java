package com.mm.services;

import java.util.List;

import com.mm.dao.ZMasterDao;
import com.mm.model.City;
import com.mm.model.District;
import com.mm.model.State;
import com.mm.model.ZipCode;

public class ZMasterServicesImpl implements ZMasterServices {

	ZMasterDao zMasterDao;
	@Override
	public List<State> getState() throws Exception {
		// TODO Auto-generated method stub
		return zMasterDao.getState();
	}

	@Override
	public List<District> getDistrict(Long stateID, Boolean status)
			throws Exception {
		// TODO Auto-generated method stub
		return zMasterDao.getDistrict(stateID, status);
	}

	@Override
	public List<City> getCity(Long districtID, Boolean status) throws Exception {
		// TODO Auto-generated method stub
		return zMasterDao.getCity(districtID, status);
	}

	@Override
	public List<ZipCode> getZipCode(Long cityID, Boolean status)
			throws Exception {
		// TODO Auto-generated method stub
		return zMasterDao.getZipCode(cityID, status);
	}

}
