import java.util.Scanner;
class Student
{
    Scanner sc = new Scanner(System.in);
    int sid;
    String sname;
    String ssection;
    String saddress;
    void studentdetails()
    {
        System.out.println("Enter Student Id:");
        sid=sc.nextInt();
        System.out.println("Enter Student Name:");
        sname=sc.next();
        System.out.println("Enter Student Section:");
        ssection=sc.next();
        System.out.println("Enter Student Address:");
        saddress=sc.next();

    }
    void printsd()
    {
        System.out.println("Student ID is:"+sid);
        System.out.println("\n Student Name is:"+sname);
        System.out.println("\n Student Section:"+ssection);
        System.out.println("\n Student Address:"+saddress);
    }
}
class Exam extends Student
{
    int internal_marks,external_marks,extra_marks;
    float total;
    void StudentMarks()
    {
        System.out.println("Enter Internal Marks:");
        internal_marks=sc.nextInt();
        System.out.println("Enter External Marks:");
        external_marks=sc.nextInt();
        System.out.println("Enter Internal Marks:");
        extra_marks=sc.nextInt();
    }
    void printsmarks()
    {
        System.out.println("Internal Marks:"+internal_marks);
        System.out.println("External Marks:"+external_marks);
        System.out.println("Extra Marks:"+extra_marks);
    }
    void total()
    {
        total=internal_marks+external_marks+extra_marks;
        System.out.println("Total Marks:"+total);
    }
}
class Result extends Exam
{
    float percentage;
    void percentage()
    {
        percentage = (total/300)*100;
        System.out.println("Percentage is:"+percentage);
    }
}
class Project extends Result
{
    void grade()
    {
        if(percentage<90 && percentage>=80)
        {
            System.out.println("A Grade");
        }
        else if(percentage<80 && percentage>=70)
        {
            System.out.println("B Grade");
        }
        else if(percentage<70 && percentage>=60)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
public class Inherit
{
    public static void main(String args[])
    {
        Project p=new Project();
        p.studentdetails();
        p.printsd();
        p.StudentMarks();
        p.printsmarks();
        p.total();
        p.percentage();
        p.grade();
    }
}