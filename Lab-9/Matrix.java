import java.util.Scanner;

class MatrixThread extends Thread{
    int sum;
    int[] currentRow;
    public MatrixThread(int[] currentRow){
        this.currentRow = currentRow;
        this.sum = 0;
    }
    public void run(){
        for (int temp : currentRow) {
            sum += temp;
        }
    }
    public int getSum(){
        return this.sum;
    }
}

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows in Matrix :");
        int m = sc.nextInt();
        System.out.println("Enter Number of col in Matrix :");
        int n = sc.nextInt();

        int[][] nums = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        MatrixThread[] mt = new MatrixThread[m];

        for (int i = 0; i < m; i++) {
            mt[i] = new MatrixThread(nums[i]);
            mt[i].start();
        }

        try {
            for (int i = 0; i < m; i++) {
                mt[i].join();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        for (int i = 0; i < m; i++) {
            System.out.println("Sum of row "+(i+1)+" : "+mt[i].getSum());
        }
        sc.close();

    }
}
