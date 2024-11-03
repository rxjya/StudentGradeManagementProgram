package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Represents GradeTest class.
 */
public class GradeTest {

  /**
   * Tests constructor of the Grade class.
   */
  @Test
  public void gradeTest() {
    int score = 98;
    Module m = new Module("code", "name", false);
    Grade grade = new Grade(score, m);
    assertEquals(score, grade.getScore());
    assertEquals(m, grade.getModule());
  }

}
