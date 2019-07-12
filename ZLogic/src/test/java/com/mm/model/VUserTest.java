package com.mm.model;

import com.mm.model.VUser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.InvocationTargetException;

public class VUserTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void getAadharNoOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getAadharNo();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getAddressOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getAddress();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getAgeOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getAge();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getCityOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getCity();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getDistrictOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getDistrict();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getDobOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getDob();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getEmailOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getEmail();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getFirstNameOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getFirstName();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getIdOutputZero() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final long actual = objectUnderTest.getId();

    // Assert result
    Assert.assertEquals(0L, actual);
  }


  @Test
  public void getImagePathOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getImagePath();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getLastNameOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getLastName();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getPhoneOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getPhone();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getStateOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getState();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getStatusOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getStatus();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getVendorIDPathOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getVendorIDPath();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getZipCodeOutputNull() {

    // Arrange
    final VUser objectUnderTest = new VUser();

    // Act
    final String actual = objectUnderTest.getZipCode();

    // Assert result
    Assert.assertNull(actual);
  }

  @Test
  public void toStringOutputNotNull() throws InvocationTargetException {

    // Arrange
    final VUser objectUnderTest = new VUser();
    objectUnderTest.setPhone("");
    objectUnderTest.setId(-9L);
    objectUnderTest.setDob("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    objectUnderTest.setStatus("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
    objectUnderTest.setEmail(
        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
    objectUnderTest.setFirstName("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    objectUnderTest.setAddress("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    objectUnderTest.setLastName("");
    objectUnderTest.setAge("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    objectUnderTest.setAadharNo("");
    objectUnderTest.setVendorIDPath("");
    objectUnderTest.setDistrict("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    objectUnderTest.setImagePath("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    objectUnderTest.setState("");
    objectUnderTest.setCity("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    objectUnderTest.setZipCode("BBBBBBBBBBBBBBBBBBBBBBB");

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals(
        "VUser [id=-9, firstName=!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!, lastName=, email=\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\", phone=, aadharNo=, state=, district=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@, city=AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA, zipCode=BBBBBBBBBBBBBBBBBBBBBBB, address=AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA, age=!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!, status=BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB, imagePath=AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA, vendorIDPath=, dob=AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA]",
        actual);
  }
}
