package children;

public class Student{
 String name;
 String schoolsystem;
 public void student(String name,String schoolsystem) {
  this.name=name; 
  this.schoolsystem=schoolsystem;
 }
 public String getName() {
 return name;
 }
 public String getSchoolsystem() {
 return schoolsystem;
 }
 public void setName(String name) { 
  this.name=name;
 }
 public void setSchoolsystem(String schoolsystem) {
  this.schoolsystem=schoolsystem;
 }
 }