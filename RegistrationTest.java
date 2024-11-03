package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Represents RegistrationTest class.
 */
public class RegistrationTest {

  /**
   * Tests constructor of the Grade class.
   */
  @Test
  public void RegistrationTest() {
    Module module = new Module("code", "name", false);
    Registration reg = new Registration(module);
    assertEquals(module, reg.getModule());
  }

}
