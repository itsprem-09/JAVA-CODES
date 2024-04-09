import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int subject_code;
    double subject_credits;
    double grade_obtained;
    double spi;
    double grade_obtained1;

    Student(int id_no,int no_of_subjects_registered,int subject_code,double subject_credits,double grade_obtained){
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
    }

    public void calcSpi(){
        
        if(grade_obtained == 'a'){
            grade_obtained1 = subject_credits;
        }
        else if (grade_obtained == 'b') {
            grade_obtained1 = ((subject_credits)/1.5);
        }
        else if (grade_obtained == 'c') {
            grade_obtained1 = ((subject_credits)/2.0);
        }
        else if (grade_obtained == 'd') {
            grade_obtained1 = ((subject_credits)/2.5);
        }
        spi = (grade_obtained1 / subject_credits)*10;
        System.out.println("SPI of Following Student is = "+spi);
    }

}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(args[0]);

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Details for Student-" + (i + 1) + " : ");
            System.out.println("================================================");

            System.out.println("Enter id-no. :");
            int id_no = sc.nextInt();

            System.out.println("Enter Number of Subjects Registered :");
            int no_of_subjects_registered = sc.nextInt();

            System.out.println("Enter Subject Credit :");
            double subject_credits = sc.nextDouble();

            System.out.println("Enter Subject Code :");
            int subject_code = sc.nextInt();

            System.out.println("Enter Grade Obtained :");
            char grade_obtained = sc.next().toLowerCase().charAt(0);

            System.out.println("================================================");

            

            students[i] = new Student(id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
            students[i].calcSpi();

        }
        sc.close();

    }
}
