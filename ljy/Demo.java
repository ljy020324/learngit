package children;
import java.util.ArrayList;
import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
ArrayList<Student> array=new ArrayList<Student>();
Scanner in=new Scanner(System.in);
Child a=new Child(); 
a.SchoolSystem(10,15,20); 
while(a.addStudent(array)){
 a.addStudent(array);
}
System.out.println("班级学生信息为为为");
a.print(array);
}
}