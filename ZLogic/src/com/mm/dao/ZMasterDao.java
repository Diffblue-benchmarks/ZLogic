package com.mm.dao;

import java.util.List;

import com.mm.model.City;
import com.mm.model.District;
import com.mm.model.State;
import com.mm.model.ZipCode;

public interface ZMasterDao {
	public List<State> getState() throws Exception;
	public List<District> getDistrict(Long stateID,Boolean status) throws Exception;
	public List<City> getCity(Long districtID, Boolean status) throws Exception;
	public List<ZipCode> getZipCode(Long cityID,Boolean status) throws Exception;
}
