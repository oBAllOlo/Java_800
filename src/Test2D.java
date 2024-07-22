import java.util.*;

public class Test2D {
    public static void main(String[] args) {
        int i,j,total=0;
        int []tfac = new int[2];
        int [][]num_std = new int[2][4];
        Scanner scan = new Scanner(System.in);
        for (i = 0; i < num_std.length; i++) {
            System.out.println("input student of Fac"+(i+1));
            tfac[i] = 0;
            for(j = 0; j < num_std[i].length; j++){
                System.out.print("Year "+(j+1)+" = ");
                num_std[i][j] = scan.nextInt();
                tfac[i] = tfac[i] + num_std[i][j];
            }
            total = total + tfac[i];
        }
        for(i = 0; i < num_std.length; i++) {
            System.out.println("=========================================");
            for (j = 0; j < num_std[i].length; j++) {
                System.out.println("Student in year "+(j+1)+" = "+num_std[i][j]);
            }
            System.out.println("Total Faculty "+(i+1)+" = "+tfac[i]);
        }
        System.out.println("=========================================");
        System.out.println("Total Student = "+total);
    }

}
