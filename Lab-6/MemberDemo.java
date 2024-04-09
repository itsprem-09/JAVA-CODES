import java.util.Scanner;

class Member{
    String name;
    int age;
    int phoneNumber;
    String address;
    double salary;
    Scanner sc = new Scanner(System.in);


    public Member(){
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Age : ");
        age = sc.nextInt();
        System.out.println("Enter Phone Number : ");
        phoneNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Address : ");
        address = sc.nextLine();
        System.out.println("Enter Salery : ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    public void printSalary(){
        System.out.println("Salery of Following Member is = "+salary);
    }

    public void printDetails(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Phone Number = "+phoneNumber);
        System.out.println("Address = "+address);
    }

}

class Employee extends Member{
    String specialization;

    public Employee(){
        super();
        System.out.println("Enter Specialization : ");
        specialization = sc.nextLine();
    }

    public void printSpecialization(){
        System.out.println("Specialization of Following Employee is = "+specialization);
    }
    
}

class Manager extends Member{
    String department;

    public Manager(){
        super();
        System.out.println("Enter Department : ");
        department = sc.nextLine();
    }

    public void printDepartment(){
        System.out.println("Department of Following Manager is = "+department);
    }
}


public class MemberDemo {
    public static void main(String[] args) {
        System.out.println("Enter Employee Details as Follows : ");
        Employee e1 = new Employee();
        System.out.println("==============================================");
        System.out.println("Enter Mangaer Details as Follows : ");
        Manager m1 = new Manager();
        System.out.println("==============================================");
        System.out.println("Employee Details :");
        System.out.println("==============================================");
        e1.printDetails();
        e1.printSalary();
        e1.printSpecialization();
        System.out.println("==============================================");
        System.out.println("Manager Details :");
        System.out.println("==============================================");
        m1.printDetails();
        m1.printSalary();
        m1.printDepartment();;
    }
}
