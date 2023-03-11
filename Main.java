import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] list={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        for (int i = 0; i< 3; i++){
            for (int j =0; j< 3;j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------TRANSPOSE----------------");
        int[][] newlist=new int[3][3];
        for (int i = 0; i< 3; i++){
            for (int j =0; j< 3;j++) {
                newlist[i][j]=list[j][i];
                System.out.print(newlist[i][j] + " ");
            }
            System.out.println();
        }
    }
}
