package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;

/**
 * Represents the Student class.
 */
public class Student {
  private long id;
  private String firstName;
  private String lastName;
  private String username;
  private String email;

  private ArrayList<Grade> gradelist;
  private ArrayList<Registration> reglist; // registrations list

  /**
   * Constructs a Student with the given details.
   *
   * @param id students id
   * @param firstName the student's first name
   * @param lastName the student's last name
   * @param username the student's username
   * @param email the student's email address
   */
  public Student(long id, String firstName, String lastName, String username, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.email = email;

    this.gradelist = new ArrayList<Grade>();
    this.reglist = new ArrayList<Registration>();
  }

  // Getters and setters

  /**
   * Returns the student's ID.
   *
   * @return id
   */
  public long getId() {
    return id;
  }

  /**
   * Returns the student's first name.
   *
   * @return firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns the student's last name.
   *
   * @return lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Returns the student's username.
   *
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Returns the student's email.
   *
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Adds grade to the arraylist.
   *
   * 
   */
  public void addGrade(Grade g) throws NoRegistrationException {

    for (int i = 0; i < reglist.size(); i++) {
      Module mo = reglist.get(i).getModule();
      Module m = g.getModule();
      if (mo == m) {
        gradelist.add(g);
        return;
      }

    }
    throw new NoRegistrationException("This is a NoRegistratioNexception");

  }


  /**
   * Registers new Module, meaning adding a registration referenced to the module to the
   * Registration arraylist.
   *
   * 
   */
  public void registerModule(Module m) {
    Registration r = new Registration(m);
    reglist.add(r);
  }

  /**
   * Computes average.
   *
   * @return averages
   */
  public float computeAverage() throws NoGradeAvailableException {
    int sum = 0;
    for (int i = 0; i < gradelist.size(); i++) {
      sum += gradelist.get(i).getScore();
    }
    if (sum == 0) {
      throw new NoGradeAvailableException("This is a NoGradeAvailableException");
    }
    return (float) sum / (float) gradelist.size();
  }

  /**
   * Computes average.
   *
   * @return averages
   */
  public Grade getGrade(Module m) throws NoGradeAvailableException {
    for (int i = 0; i < reglist.size(); i++) {
      if (gradelist.get(i).getModule() == m) {
        return gradelist.get(i);
      }

    }
    throw new NoGradeAvailableException("This is a NoGradeAvailableException");
  }

  /**
   * Computes average.
   *
   * @return averages
   */
  public ArrayList<Grade> getGradelist() {
    return this.gradelist;
  }


  /**
   * Computes average.
   *
   * @return averages
   */
  public ArrayList<Registration> getReglist() {
    return this.reglist;
  }

}
