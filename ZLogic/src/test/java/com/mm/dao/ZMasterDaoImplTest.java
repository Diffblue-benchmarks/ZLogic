package com.mm.dao;

import com.mm.dao.ZMasterDaoImpl;
import com.mm.model.City;
import com.mm.model.District;
import com.mm.model.State;
import com.mm.model.ZipCode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

public class ZMasterDaoImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void getCityInputNullNullOutputNull() throws Exception {

    // Arrange
    final ZMasterDaoImpl objectUnderTest = new ZMasterDaoImpl();
    final Long districtID = null;
    final Boolean status = null;

    // Act
    final List<City> actual = objectUnderTest.getCity(districtID, status);

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getDistrictInputNullNullOutputNull() throws Exception {

    // Arrange
    final ZMasterDaoImpl objectUnderTest = new ZMasterDaoImpl();
    final Long stateID = null;
    final Boolean status = null;

    // Act
    final List<District> actual = objectUnderTest.getDistrict(stateID, status);

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getStateOutputNull() throws Exception {

    // Arrange
    final ZMasterDaoImpl objectUnderTest = new ZMasterDaoImpl();

    // Act
    final List<State> actual = objectUnderTest.getState();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getZipCodeInputNullNullOutputNull() throws Exception {

    // Arrange
    final ZMasterDaoImpl objectUnderTest = new ZMasterDaoImpl();
    final Long cityID = null;
    final Boolean status = null;

    // Act
    final List<ZipCode> actual = objectUnderTest.getZipCode(cityID, status);

    // Assert result
    Assert.assertNull(actual);
  }
}
