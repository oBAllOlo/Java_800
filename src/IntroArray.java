import java.util.Arrays;
import java.util.Scanner;

public class IntroArray {
     public static void main(String[] args) {
        //*สร้างและกำหนดค่าเริ่มต้นให้กับอาร์เรย์ num ที่ประกอบด้วยตัวเลข 7 ตัว.
        int[] num = {15,22,33,10,7,27,16};
        //* พิมพ์ความยาวของอาร์เรย์ num ออกมา. 
        System.out.println("length of num : " + num.length);
        //*ลูปผ่านทุกค่าของอาร์เรย์ num และพิมพ์ค่าแต่ละตัวออกมา. */
        for(int i = 0 ; i < num.length ; i++){
            System.out.println("num[" + i + "] = " + num[i]);
        }

        System.out.println("");

        //*ใช้เมธอด fill จากคลาส Arrays เพื่อเติมค่าทุกตัวในอาร์เรย์ num ให้เป็น 0.
        Arrays.fill(num, 0);
        //*ลูปผ่านทุกค่าของอาร์เรย์ num อีกครั้งและพิมพ์ค่าแต่ละตัวออกมา (จะเป็น 0 ทั้งหมด). */
        for(int i = 0 ; i < num.length ; i++){
            System.out.println("num[" + i + "] = " + num[i]);
        }

        System.out.println();

        //*สร้างอาร์เรย์ grade ที่ประกอบด้วยตัวอักษร 3 ตัว และกำหนดค่าให้แต่ละตำแหน่ง. */
        char grade[];
        grade = new char[3];
        grade[0] = 'F'; grade[1] = 'A'; grade[2] = 'C';

        //*ลูปผ่านทุกค่าของอาร์เรย์ grade และพิมพ์ค่าแต่ละตัวออกมา. */
        for(int i = 0 ; i < grade.length; i++){
            System.out.println(grade[i]+", ");
        }

        System.out.println();

        //*สร้างตัวแปร sum สำหรับเก็บผลรวมและ avg สำหรับเก็บค่าเฉลี่ย. */
        float sum = 0.0f, avg;
        //*สร้างอาร์เรย์ temp ที่ประกอบด้วยตัวเลขแบบทศนิยม 4 ตัว. */
        float []temp = new float[4];
        //*สร้างออบเจกต์ Scanner เพื่ออ่านค่าจากคอนโซล.
        Scanner scan = new Scanner(System.in);
        //*ลูปผ่านทุกตำแหน่งของอาร์เรย์ temp, อ่านค่าจากผู้ใช้และเก็บในอาร์เรย์ temp. */
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Temp "+(i+2)+" = ");
            temp[i] = scan.nextFloat();
            //*เพิ่มค่าที่อ่านได้เข้าไปในตัวแปร sum. */
            sum = sum + temp[i];

        }
        //*คำนวณค่าเฉลี่ยจากผลรวม (sum) และจำนวนสมาชิกในอาร์เรย์ (temp.length). */
        avg = sum / temp.length;
        //*พิมพ์ค่าเฉลี่ยออกมาโดยมีทศนิยมสองตำแหน่ง. */
        System.out.printf("Average = "+"%.2f\n",avg);
        //*ปิดออบเจกต์ Scanner. */
        scan.close();
    }
    //*ตัวอย่างผลลัพธ์เมื่อรันโปรแกรม: */
    /*length of num : 7
    num[0] = 15
    num[1] = 22
    num[2] = 33
    num[3] = 10
    num[4] = 7
    num[5] = 27
    num[6] = 16

    num[0] = 0
    num[1] = 0
    num[2] = 0
    num[3] = 0
    num[4] = 0
    num[5] = 0
    num[6] = 0

    F, 
    A, 
    C, 

    Temp 1 = 25.0
    Temp 2 = 30.0
    Temp 3 = 28.5
    Temp 4 = 27.0
    Average = 27.63
    */
}
