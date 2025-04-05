package labtwo;

import java.util.List;

/**
 * Session
 */
public class Session {

  String data;
  String time;
  String module;
  String group;
  List<String> absentStudents;

  // Constructor
  public Session() {
    this.data = "Unknown";
    this.time = "Unknown";
    this.module = "Unknown";
    this.group = "Unknown";
  }

  public Session(String data, String time, String module, String group) {
    this.data = data;
    this.time = time;
    this.module = module;
    this.group = group;
  }

  // Method
  public void markAbsent(String studentName) {
    if (!absentStudents.contains(studentName)) {
      absentStudents.add(studentName);
    } else {
      System.out.println("Student is already marked as absent.");
    }
  }

  public void getAbsences() {
    System.out.println("Absent Students: ");
    if (absentStudents.isEmpty()) {
      System.out.println("No students are absent.");
    } else {
      for (String student : absentStudents) {
        System.out.println(student);
      }
    }
  }

  // Getters and Setters
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getModule() {
    return module;
  }

  public void setModule(String module) {
    this.module = module;
  }

}
