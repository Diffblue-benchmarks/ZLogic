package com.mm.model;

import com.mm.model.ZUser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.InvocationTargetException;

public class ZUserTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void getCodeOutputNull() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final String actual = objectUnderTest.getCode();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getEmailOutputNull() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final String actual = objectUnderTest.getEmail();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getFirstNameOutputNull() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final String actual = objectUnderTest.getFirstName();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getIdOutputZero() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final long actual = objectUnderTest.getId();

    // Assert result
    Assert.assertEquals(0L, actual);
  }


  @Test
  public void getIsActiveOutputNull() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final Boolean actual = objectUnderTest.getIsActive();

    // Assert result
    Assert.assertNull(actual);
  }

  @Test
  public void getIsAdminOutputNull() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final Boolean actual = objectUnderTest.getIsAdmin();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getLastNameOutputNull() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final String actual = objectUnderTest.getLastName();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getPasswordOutputNull() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final String actual = objectUnderTest.getPassword();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getPhoneOutputNull() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final String actual = objectUnderTest.getPhone();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getUsernameOutputNull() {

    // Arrange
    final ZUser objectUnderTest = new ZUser();

    // Act
    final String actual = objectUnderTest.getUsername();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void toStringOutputNotNull() throws InvocationTargetException {

    // Arrange
    final ZUser objectUnderTest = new ZUser();
    objectUnderTest.setEmail("");
    objectUnderTest.setPassword("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    objectUnderTest.setIsActive(true);
    objectUnderTest.setLastName("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    objectUnderTest.setPhone("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
    objectUnderTest.setId(4L);
    objectUnderTest.setCode("");
    objectUnderTest.setIsAdmin(true);
    objectUnderTest.setFirstName("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    objectUnderTest.setUsername("");

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals(
        "ZUser [id=4, username=, code=, firstName=!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!, lastName=AAAAAAAAAAAAAAAAAAAAAAAAAAAA, email=, phone=DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD, password=HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH, isActive=true, isAdmin=true]",
        actual);
  }
}
