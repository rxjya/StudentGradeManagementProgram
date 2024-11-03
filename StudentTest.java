package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


/**
 * Tests Student class.
 */
public class StudentTest {

  /**
   * Tests Student class.
   */
  @Test
  public void studentTest() {
    long id = 123;
    String firstName = "";
    String lastName = "";
    String email = "";
    String username = "";

    Student student = new Student(id, firstName, lastName, username, email);
    assertEquals(id, student.getId());
    assertEquals(firstName, student.getFirstName());
    assertEquals(lastName, student.getLastName());
    assertEquals(username, student.getUsername());
    assertEquals(email, student.getEmail());
  }

  @Test
  public void computeAverageTest() throws NoGradeAvailableException, NoRegistrationException {
    Student s = new Student(4562732, "Ishaaq", "Idontknowhislatname",
        "Idontknowhislatname@gmail.com", "ahmad");


    assertThrows(NoGradeAvailableException.class, () -> {
      s.computeAverage();
    });


    Module m1 = new Module("code", "name", false);
    s.registerModule(m1);
    Grade g1 = new Grade(30, m1);

    Module m2 = new Module("code1", "name1", true);
    s.registerModule(m2);
    Grade g2 = new Grade(20, m2);

    s.addGrade(g1);
    s.addGrade(g2);

    float average = s.computeAverage();

    assert average == 25;


  }

  @Test
  public void addGradeTest() throws NoRegistrationException {
    Student s = new Student(4562732, "Ishaaq", "Idontknowhislatname",
        "Idontknowhislatname@gmail.com", "ahmad");

    Module m = new Module("code", "name", false);
    Grade g = new Grade(23, m);



    assertThrows(NoRegistrationException.class, () -> {
      s.addGrade(g);
    });

    s.registerModule(m);
    s.addGrade(g);
    ArrayList<Grade> gradelist = s.getGradelist();

    assert gradelist.size() == 1;


  }


  @Test
  public void getGradeTest() throws NoRegistrationException, NoGradeAvailableException {
    Student s = new Student(4562732, "Ishaaq", "Idontknowhislatname",
        "Idontknowhislatname@gmail.com", "ahmad");

    Module m = new Module("code", "name", false);
    Grade g = new Grade(23, m);

    assertThrows(NoGradeAvailableException.class, () -> {
      s.getGrade(m);
    });


    s.registerModule(m);
    s.addGrade(g);

    assert s.getGrade(m) == g;


  }

  @Test
  public void registerModuleTest() {
    Student s = new Student(4562732, "Ishaaq", "Idontknowhislatname",
        "Idontknowhislatname@gmail.com", "ahmad");

    Module m = new Module("code", "name", false);
    s.registerModule(m);

    ArrayList<Registration> reglist = s.getReglist();

    assert reglist.size() == 1;


  }



}
