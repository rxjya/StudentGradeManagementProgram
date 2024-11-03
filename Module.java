package uk.ac.rhul.cs2800.model;

/**
 * Represents Module class.
 */
public class Module {
  private String code;
  private String name;
  private boolean mnc;

  /**
   * Constructs a Module with the given details.
   *
   * @param code the module code
   * @param name the module name
   * @param mnc whether the module is mnc
   */
  public Module(String code, String name, boolean mnc) {
    this.code = code;
    this.name = name;
    this.mnc = mnc;
  }

  /**
   * Returns code.
   *
   * @return code
   */
  public String getCode() {
    return code;
  }

  /**
   * Returns name.
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Returns mnc boolean value.
   *
   * @return mcn
   */
  public boolean getMnc() {
    return mnc;
  }

}
