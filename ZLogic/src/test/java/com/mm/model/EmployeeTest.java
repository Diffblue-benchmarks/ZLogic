package com.mm.model;

import com.mm.model.Employee;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EmployeeTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void getEmailOutputNull() {

    // Arrange
    final Employee objectUnderTest = new Employee();

    // Act
    final String actual = objectUnderTest.getEmail();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getFirstNameOutputNull() {

    // Arrange
    final Employee objectUnderTest = new Employee();

    // Act
    final String actual = objectUnderTest.getFirstName();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getIdOutputZero() {

    // Arrange
    final Employee objectUnderTest = new Employee();

    // Act
    final long actual = objectUnderTest.getId();

    // Assert result
    Assert.assertEquals(0L, actual);
  }


  @Test
  public void getLastNameOutputNull() {

    // Arrange
    final Employee objectUnderTest = new Employee();

    // Act
    final String actual = objectUnderTest.getLastName();

    // Assert result
    Assert.assertNull(actual);
  }


  @Test
  public void getPhoneOutputNull() {

    // Arrange
    final Employee objectUnderTest = new Employee();

    // Act
    final String actual = objectUnderTest.getPhone();

    // Assert result
    Assert.assertNull(actual);
  }
}
