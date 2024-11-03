package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Represents NoGradeAvailableExceptionTest class.
 */
public class NoGradeAvailableExceptionTest {

  /**
   * Tests constructor of the Grade class.
   */
  @Test
  public void noGradeAvailableExceptionTest() {
    String msg = "example message";
    NoGradeAvailableException exception = new NoGradeAvailableException(msg);
    assertEquals(msg, exception.getMessage());
  }

}
