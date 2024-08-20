import java.util.Scanner;
public class Person {
    public String name;
    public int age;
    public String subject;
    public int salary;
    public String grade;
    public int studentClass;

    public Person(String name, int age,String subject, int salary,String grade,int studentClass) {
        this.name = name;
        this.age = age;
        this.subject=subject;
        this.salary = salary;
    }
    
class Teacher extends Person
{
public Teacher(String name,int age,String subject,int salary)
{
super(name,age,subject,salary, null,0 );
}
 void display() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}
class Student extends Person
{
public Student(String name,String grade,int studentClass)
{
super(name,0,null,0,grade,studentClass);
}
void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Class: " + studentClass);
    }
}


class Main
{
public static void main(String args[])
{
    int choice;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of teachers u want to enter ");
int m=sc.nextInt();
System.out.println("enter the no of  stuenets u want to enter ");
int n=sc.nextInt();
while(true)
{
System.out.println("1.teacher");
System.out.println(".student");
System.out.println("exit");
System.out.println("enter yoyr choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
Teacher[] teachers = new Teacher[m];

for(int i=0;i<m;i++)
{
System.out.println("enter the details of teacher" +(i+1));
System.out.println("enter name");
String name=sc.next();
System.out.println("enter age");
int age=sc.nextInt();
System.out.println("enter subject");
String subject=sc.next();
System.out.println("enter salary");
int salary=sc.nextInt();
teachers[i]=new Teacher(name,age,subject,salary);
}
case 2:
    Student[] students = new Student[n];
for(int j=0;j<n;j++)
{
System.out.println("enter the details of student"+(j+1));
System.out.println("enter the name");
String name=sc.next();
System.out.println("enter the grade");
String grade=sc.next();
System.out.println("enter the class");
int studentClass=sc.nextInt();
students[j]=new Student(name,grade,studentClass);
}
case 3:
        System.out.println("Exiting...");
                    return;
default:
        System.out.println("Invalid choice. Please try again.");
}
}
for(Teacher teacher:teachers)
{
Teacher.display();
System.out.println();
}
for(Student student:students)
{
Student.display();
System.out.println();
}
}
}



