import java.util.Scanner;

public class Test2D {
    public static void main(String[] args) {
        //* ประกาศตัวแปร i, j สำหรับใช้ในลูป และ total สำหรับเก็บผลรวมของจำนวนนักศึกษา
        int i, j, total = 0;
        
        //* สร้างอาร์เรย์ tfac ขนาด 2 สำหรับเก็บผลรวมของจำนวนนักศึกษาในแต่ละคณะ
        int[] tfac = new int[2];
        
        //* สร้างอาร์เรย์สองมิติ num_std ขนาด 2x4 สำหรับเก็บจำนวนนักศึกษาในแต่ละปีการศึกษาของแต่ละคณะ
        int[][] num_std = new int[2][4];
        
        //* สร้างออบเจกต์ Scanner เพื่อรับค่าจากผู้ใช้
        Scanner scan = new Scanner(System.in);

        //* ลูปผ่านคณะต่างๆ (2 คณะ)
        for (i = 0; i < num_std.length; i++) {
            System.out.println("Input student of Fac" + (i + 1));
            tfac[i] = 0; //* ตั้งค่า tfac[i] เป็น 0 เพื่อเริ่มต้นการนับจำนวนนักศึกษาในคณะ i+1

            //* ลูปผ่านปีการศึกษา (4 ปี) เพื่อรับค่าจำนวนนักศึกษาในแต่ละปี
            for (j = 0; j < num_std[i].length; j++) {
                System.out.print("Year " + (j + 1) + " = ");
                num_std[i][j] = scan.nextInt(); //* รับค่าจำนวนนักศึกษาจากผู้ใช้และเก็บใน num_std[i][j]
                tfac[i] += num_std[i][j]; //* บวกจำนวนนักศึกษาในปีนั้นเข้ากับ tfac[i]
            }

            total += tfac[i]; //* บวกผลรวมของคณะ i+1 เข้ากับ total
        }

        //* ลูปผ่านคณะต่างๆ อีกครั้งเพื่อแสดงผล
        for (i = 0; i < num_std.length; i++) {
            System.out.println("=========================================");
            
            //* ลูปผ่านปีการศึกษาเพื่อแสดงจำนวนนักศึกษาในแต่ละปีของแต่ละคณะ
            for (j = 0; j < num_std[i].length; j++) {
                System.out.println("Student in year " + (j + 1) + " = " + num_std[i][j]);
            }
            
            //* แสดงผลรวมของจำนวนนักศึกษาในคณะ i+1
            System.out.println("Total Faculty " + (i + 1) + " = " + tfac[i]);
        }

        //* แสดงผลรวมของจำนวนนักศึกษาทุกคณะ
        System.out.println("=========================================");
        System.out.println("Total Student = " + total);
    }
}
