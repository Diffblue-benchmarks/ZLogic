package com.mm.dao;

import com.mm.dao.ZUserDaoImpl;
import com.mm.model.VUser;
import com.mm.model.ZUser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

public class ZUserDaoImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void addVendorInputNullOutputFalse() throws Exception {

    // Arrange
    final ZUserDaoImpl objectUnderTest = new ZUserDaoImpl();
    final VUser user = null;

    // Act
    final boolean actual = objectUnderTest.addVendor(user);

    // Assert result
    Assert.assertFalse(actual);
  }


  @Test
  public void getUserListOutputNull() throws Exception {

    // Arrange
    final ZUserDaoImpl objectUnderTest = new ZUserDaoImpl();

    // Act
    final List<ZUser> actual = objectUnderTest.getUserList();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void loginUserInputNullOutputFalse() throws Exception {

    // Arrange
    final ZUserDaoImpl objectUnderTest = new ZUserDaoImpl();
    final ZUser user = null;

    // Act
    final boolean actual = objectUnderTest.loginUser(user);

    // Assert result
    Assert.assertFalse(actual);
  }
}
