import java.io.*;
import java.util.Scanner;

class Student{
    String name;
    int age;

    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name : "+name + " " +"Age : "+ age;
    }
}

public class StudentDemo {
    public static void main(String[] args) {

            String fileName = "Student.txt";
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Students :");
            int n = sc.nextInt();

            Student[] stu = new Student[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter Name of Student");
                String name = sc.next();
                System.out.println("Enter age of Student");
                int age = sc.nextInt();

                stu[i] = new Student(name, age);
            }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

            for (int i = 0; i < stu.length; i++) {
                bw.write(stu[i].toString()+"\n");
            }
            bw.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine())!= null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
}
