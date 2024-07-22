import java.util.Arrays;
import java.util.Scanner;

public class IntroArray {
     public static void main(String[] args) {
        int[] num = {15,22,33,10,7,27,16};
        System.out.println("length of num : " + num.length);
        for(int i = 0 ; i < num.length ; i++){
            System.out.println("num[" + i + "] = " + num[i]);
        }

        System.out.println("");
        Arrays.fill(num, 0);
        for(int i = 0 ; i < num.length ; i++){
            System.out.println("num[" + i + "] = " + num[i]);
        }

        System.out.println();
        char grade[];
        grade = new char[3];
        grade[0] = 'F'; grade[1] = 'A'; grade[2] = 'C';
        for(int i = 0 ; i < grade.length; i++){
            System.out.println(grade[i]+", ");
        }

        System.out.println();
        float sum = 0.0f, avg;
        float []temp = new float[4];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Temp "+(i+1)+" = ");
            temp[i] = scan.nextFloat();
            sum = sum + temp[i];

        }
        avg = sum / temp.length;
        System.out.printf("Average = "+"%.2f\n",avg);
        scan.close();
    }
}
