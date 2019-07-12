package com.mm.model;

import com.mm.model.Status;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StatusTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void getCodeOutputZero() {

    // Arrange
    final Status objectUnderTest = new Status();

    // Act
    final int actual = objectUnderTest.getCode();

    // Assert result
    Assert.assertEquals(0, actual);
  }


  @Test
  public void getMessageOutputNull() {

    // Arrange
    final Status objectUnderTest = new Status();

    // Act
    final String actual = objectUnderTest.getMessage();

    // Assert result
    Assert.assertNull(actual);
  }
}
