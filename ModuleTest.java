package uk.ac.rhul.cs2800.model;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Represents GradeTest class.
 */
public class ModuleTest {

  /**
   * Tests constructor of the Grade class.
   */
  @Test
  public void ModuleTest() {
    String code = "Code";
    String name = "Name";
    boolean mnc = false;
    Module module = new Module(code, name, mnc);

    assertEquals(code, module.getCode());
    assertEquals(name, module.getName());
    assertEquals(mnc, module.getMnc());
  }

}
