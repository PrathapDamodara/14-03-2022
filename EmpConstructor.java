import java.util.*;
class Employee
{
    int eid;
    String ename;
    int esal;
    String eaddress;
    //constructor overloading
    Employee(int eid,String ename,int esal,String eaddress)
    {
        this.eid=eid;
        this.ename=ename;
        this.esal=esal;
        this.eaddress=eaddress;
    }
    
    Employee(int eid)
    {
        this.eid=eid;
    }
    
    Employee(int eid,String ename)
    {
        this.eid=eid;
        this.ename=ename;
    }
    
    Employee(int eid,String ename,int esal)
    {
        this.eid=eid;
        this.ename=ename;
        this.esal=esal;
    }
    
    void display()
    {
        System.out.println(eid+"\n"+ename+"\n"+esal+"\n"+eaddress);
    }
    
    void reading()
    {
        System.out.println(ename+" reading");
    }
    
    void writing()
    {
        System.out.println(ename+" Writing");
    }
    
}
class EmpConstructor
{
    public static void main(String args[])
    {
        Employee emp1=new Employee(001,"Basha",85000,"Nellore");
        System.out.println("Employee 1 information");
        emp1.display();
        emp1.reading();
        emp1.writing();
        
        Employee emp2=new Employee(002);
        System.out.println("Employee 2 information");
        emp2.display();
        emp2.reading();
        emp2.writing();
        
        Employee emp3=new Employee(003,"Vivek");
        System.out.println("Employee 3 informatio");
        emp3.display();
        emp3.reading();
        emp3.writing();
        
        Employee emp4=new Employee(004,"Vivek",70000);
        System.out.println("Employee 4 informatio");
        emp4.display();
        emp4.reading();
        emp4.writing();
    }
}
