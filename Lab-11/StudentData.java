import java.io.*;
import java.util.*;

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

public class StudentData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String filename = "StudentData.txt";
        System.out.println("Enter Number of Students : ");
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
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            
            for (int i = 0; i < stu.length; i++) {
                dos.writeUTF(stu[i].toString()+"\n");
            }
            dos.close();
        } 
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(filename));
            while (dis.available() > 0) {
                System.out.println(dis.readUTF());
            }
            dis.close();
        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


    }   
}
