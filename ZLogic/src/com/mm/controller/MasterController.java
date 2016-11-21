package com.mm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mm.model.City;
import com.mm.model.District;
import com.mm.model.Employee;
import com.mm.model.State;
import com.mm.model.ZipCode;
import com.mm.services.DataServices;
import com.mm.services.ZMasterServices;

@Controller
@RequestMapping("/zmaster")
public class MasterController {
	
	@Autowired
	ZMasterServices zMasterServices;
	
	@RequestMapping(value = "/state", method = RequestMethod.GET)
	public @ResponseBody
	List<State> getState() {
		List<State> stateList = null;
		try {
			stateList = zMasterServices.getState();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stateList;
	}
	
	@RequestMapping(value = "/district", method = RequestMethod.GET)
	public @ResponseBody
	List<District> getDistrict(@PathVariable("stateID") long stateID, @PathVariable("status") Boolean status) {
		List<District> districtList = null;
		try {
			districtList = zMasterServices.getDistrict(stateID, status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return districtList;
	}
	
	
	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public @ResponseBody
	List<City> getCity(@PathVariable("districtID") long districtID, @PathVariable("status") Boolean status) {
		List<City> cityList = null;
		try {
			cityList = zMasterServices.getCity(districtID, status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cityList;
	}
	
	@RequestMapping(value = "/zipcode", method = RequestMethod.GET)
	public @ResponseBody
	List<ZipCode> getZipCode(@PathVariable("cityID") long cityID, @PathVariable("status") Boolean status) {
		List<ZipCode> zipCodeList = null;
		try {
			zipCodeList = zMasterServices.getZipCode(cityID, status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return zipCodeList;
	}

}
