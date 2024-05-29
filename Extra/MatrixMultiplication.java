import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Rows in Matrix:");
        int row = sc.nextInt();

        int a[][] = new int[row][row]; 
        int b[][] = new int[row][row]; 
        int c[][] = new int[row][row]; 

        System.out.println("Enter Element In Matrix-1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Enter Element :");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Element In Matrix-2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Enter Element :");
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i=0 ; i < row; i++){    
            for(int j=0 ; j < row ; j++){    
                c[i][j]=0;      
            for(int k=0 ; k < row ; k++)      
            {      
                c[i][j]+=a[i][k]*b[k][j];      
            } 
            System.out.print(c[i][j]+" ");  
            }
            System.out.println();    
            }    
    }
}
