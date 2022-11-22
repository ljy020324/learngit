package children;
import java.util.ArrayList;
import java.util.Scanner;
public class Child {

 int big;
 int medium;
 int small;
 ArrayList<Student> array=new ArrayList<Student>();
 Scanner in=new Scanner(System.in);
 public void SchoolSystem (int big, int medium, int small) {
 this.big=big;
 this.medium=medium;
 this.small=small;
 }
 public boolean addStudent(ArrayList<Student> array) {
 for(int i=0;;i++) {
 System.out.println("输入要查询的班级(1 ：大班,2：中班，3：小班，0：退出)");
 int stuType=in.nextInt();
 if(stuType==1) {
 if(big!=0) {
 System.out.println("剩余"+big+"个名额");
 System.out.println("录入学生信息");
 System.out.print("请输入学生姓名");
 String name=in.next();
 System.out.print("请输入学生班级:");
 String schoolsystem=in.next();
 Student s=new Student();
 s.setName(name);
 s.setSchoolsystem(schoolsystem);
 array.add(s);
 big--;
 return true;
 }
 else {
 System.out.println("无剩余名额");
 return false;
 }
 }
 else if(stuType==2) {
 if(medium!=0){
 System.out.println("剩余"+medium+"个名额");
 System.out.println("录入学生信息");
 System.out.print("请输入学生姓名:");
 String name=in.next();
 System.out.print("请输入学生班级:");
 String schoolsystem=in.next();
 Student s=new Student();
 s.setName(name);
 s.setSchoolsystem(schoolsystem);
 array.add(s);
 medium--;
 return true;
 }
 else {
 System.out.println("无剩余名额"); 
 return false;
 }
 }
 else if(stuType==3) {
 if(small!=0) {
 System.out.println("剩余"+small+"个名额");
 System.out. println("录入学生信息");
 System.out.print("请输入学生姓名:");
 String name=in.next();
 System.out.print("请输入学生班级：");
 String schoolsystem=in.next();
 Student s=new Student(); 
 s.setName(name);
 s.setSchoolsystem(schoolsystem); 
 array.add(s);
 small--;
 return true;
 }
 else {
 System.out.println("无剩余名额");
 return false;
 }
 }
 else if(stuType==0) {
 System.out.println("退出成功");
 return false;
 }
 }
 }
 public void print(ArrayList<Student> array) {
 for(int i=0;i<array.size();i++) {
 Student s=array.get(i);
 System.out.println(s.getName()+","+s.getSchoolsystem());
 }
 }
}