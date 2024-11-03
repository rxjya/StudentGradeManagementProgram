package uk.ac.rhul.cs2800.model;

/**
 * Represents Grade class.
 */
public class Grade {
  private int score;
  private Module mo;

  /**
   * Constructor for Grade class.
   */
  public Grade(int score, Module mo) {
    this.score = score;
    this.mo = mo;
  }

  /**
   * Returns score.
   *
   * @return score
   */
  public int getScore() {
    return score;
  }

  /**
   * Returns score.
   *
   * @return score
   */
  public Module getModule() {
    return this.mo;
  }

}
