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
 System.out.println("����Ҫ��ѯ�İ༶(1 �����,2���а࣬3��С�࣬0���˳�)");
 int stuType=in.nextInt();
 if(stuType==1) {
 if(big!=0) {
 System.out.println("ʣ��"+big+"������");
 System.out.println("¼��ѧ����Ϣ");
 System.out.print("������ѧ������");
 String name=in.next();
 System.out.print("������ѧ���༶:");
 String schoolsystem=in.next();
 Student s=new Student();
 s.setName(name);
 s.setSchoolsystem(schoolsystem);
 array.add(s);
 big--;
 return true;
 }
 else {
 System.out.println("��ʣ������");
 return false;
 }
 }
 else if(stuType==2) {
 if(medium!=0){
 System.out.println("ʣ��"+medium+"������");
 System.out.println("¼��ѧ����Ϣ");
 System.out.print("������ѧ������:");
 String name=in.next();
 System.out.print("������ѧ���༶:");
 String schoolsystem=in.next();
 Student s=new Student();
 s.setName(name);
 s.setSchoolsystem(schoolsystem);
 array.add(s);
 medium--;
 return true;
 }
 else {
 System.out.println("��ʣ������"); 
 return false;
 }
 }
 else if(stuType==3) {
 if(small!=0) {
 System.out.println("ʣ��"+small+"������");
 System.out. println("¼��ѧ����Ϣ");
 System.out.print("������ѧ������:");
 String name=in.next();
 System.out.print("������ѧ���༶��");
 String schoolsystem=in.next();
 Student s=new Student(); 
 s.setName(name);
 s.setSchoolsystem(schoolsystem); 
 array.add(s);
 small--;
 return true;
 }
 else {
 System.out.println("��ʣ������");
 return false;
 }
 }
 else if(stuType==0) {
 System.out.println("�˳��ɹ�");
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