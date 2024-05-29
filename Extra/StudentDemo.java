import java.util.Scanner;

class Student
{
    int id_no;
    int no_of_subject_registrated;
    String []subject_code;
    int []subject_credits;
    String []grade_obtained;
    double spi;

    Student(int id_no, int no_of_subject_registrated){
        this.id_no = id_no;
        this.no_of_subject_registrated = no_of_subject_registrated;
        this.subject_code = new String[no_of_subject_registrated];
        this.subject_credits = new int[no_of_subject_registrated];
        this.grade_obtained = new String[no_of_subject_registrated];
    }

    
    public double calculate_spi(){
        int totalCredits = 0;
        int sum = 0;
        for(int i = 0 ; i < no_of_subject_registrated ; i++){
            totalCredits += subject_credits[i];
            switch(grade_obtained[i]){
                case "A+":
                    sum += 10 * subject_credits[i];
                    break;
                case "A":
                    sum += 9 * subject_credits[i];
                    break; 
                case "B+":
                    sum += 8 * subject_credits[i];
                    break;
                case "B":
                    sum += 7 * subject_credits[i];
                    break;
                case "C+":
                    sum += 6 * subject_credits[i];
                    break;
                case "C":
                    sum += 5 * subject_credits[i];
                    break;
                case "F" :
                    sum += 0;
                    break;
                default : 
                 sum += 0;
                 break;
            }
        }
        this.spi = sum / (double)totalCredits;
        return this.spi;
    }

}

/**
 * Lab6_1
 */
public class StudentDemo {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        Student []s = new Student[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter Student ID : ");
            int id_no = sc.nextInt();
            System.out.print("Enter no of Subject Registerd : ");
            int no_of_subject_registrated = sc.nextInt();
            s[i] = new Student(id_no, no_of_subject_registrated);
            for(int j = 0; j < no_of_subject_registrated;j++ ){
                System.out.println("Enter Subject Code : ");
                s[i].subject_code[j] = sc.next();

                System.out.println("Enter Subject Credit : ");
                s[i].subject_credits[j] = sc.nextInt();

                System.out.println("Enter Subject Grade Obtained : ");
                s[i].grade_obtained[j] = sc.next();

            }
            System.out.println("SPI of Student "+(i+1)+" : "+s[i].calculate_spi());

        }
    }
}