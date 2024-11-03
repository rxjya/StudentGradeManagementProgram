package uk.ac.rhul.cs2800.model;

/**
 * Represents NoGradeAvailable class.
 */
public class NoGradeAvailableException extends Exception {

  private static final long serialVersionUID = -6342993651380284134L;

  /**
   * Constructs NoGradeAvailableException.
   */
  public NoGradeAvailableException(String msg) {
    super(msg);
  }
}
