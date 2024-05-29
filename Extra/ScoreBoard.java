import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte innings,over;

        System.out.print("Enter the number of innings: ");
        innings=sc.nextByte();
        System.out.print("Enter the number of overs: ");
        over=sc.nextByte();

        byte wide=50,noball=51, no_Wide=0,no_NoBall=0,b=6;
        byte[][][] runs = new byte[innings][over][b];
        int totalRuns=0;
        for(int i=0; i<runs.length ; i++){
            for(int j=0; j<runs[i].length ; j++){
                
                for(int k=0; k<b ;k++){
                    while (true) {
                        System.out.print("Enter the runs for inning: "+(i+1)+" over: "+(j+1)+" ball: "+(k+1)+": ");
                        runs[i][j][k]= sc.nextByte();

                        if(runs[j][j][k]==wide){
                            no_Wide++; b++; 
                            break;
                        }
                        else if(runs[i][j][k]==noball){
                            no_NoBall++; b++; 
                            break;
                        }
                        else if(runs[i][j][k]>6 || runs[i][j][k]<0){
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                }
                b=6;
            }
        }
        for(int i=0; i<runs.length;i++){
            for(int j=0;j<runs[i].length;j++){
                for(int k=0; k<b;k++){
                    totalRuns+=runs[i][j][k];
                }
            }
        }
        System.out.println("Total number of Runs= "+totalRuns);
        System.out.println("Total number of Wide= "+no_Wide);
        System.out.println("Total number of No Ball= "+no_NoBall);
        sc.close();
    }
}