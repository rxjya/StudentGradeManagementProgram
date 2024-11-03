package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Represents NoGradeAvailableExceptionTest class.
 */
public class NoRegistrationExceptionTest {

  /**
   * Tests constructor of the Grade class.
   */
  @Test
  public void noRegistrationExceptionTest() {
    String msg = "example message";
    NoRegistrationException exception = new NoRegistrationException(msg);
    assertEquals(msg, exception.getMessage());
  }

}
