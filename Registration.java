package uk.ac.rhul.cs2800.model;

/**
 * Represents registration class.
 */
public class Registration {

  private Module module;

  /**
   * Constructs Registration.
   */
  public Registration(Module module) {
    this.module = module;
  }

  /**
   * Returns module variable.
   *
   * @return module module
   */
  public Module getModule() {
    return this.module;
  }

}
