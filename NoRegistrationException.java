package uk.ac.rhul.cs2800.model;

/**
 * Represents NoGradeAvailable class.
 */
public class NoRegistrationException extends Exception {


  private static final long serialVersionUID = -6707648102725429282L;

  /**
   * Constructs NoGradeAvailableException.
   */
  public NoRegistrationException(String msg) {
    super(msg);
  }
}
