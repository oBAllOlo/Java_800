import java.util.Scanner;

public class EnumTest {
    //* ประกาศ enum สำหรับสี
    enum Colors {Red, Green, Blue}
    
    //* ประกาศ enum สำหรับระดับเกรด
    enum Grade {G, S, U}
    
    //* ประกาศ enum สำหรับวันในสัปดาห์
    enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        String msg = "Unknown"; //* กำหนดค่าเริ่มต้นให้กับข้อความเป็น "Unknown"

        //* แสดงเกรดทั้งหมดที่ประกาศใน enum Grade
        System.out.print("Grade Levels are:");
        for (Grade g : Grade.values()) {
            System.out.printf("%2s ", g);
        }
        System.out.println();

        //* สร้างออบเจกต์ Scanner เพื่อรับข้อมูลจากผู้ใช้
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade:"); //* ขอมูลระดับเกรดจากผู้ใช้
        String yg = scan.nextLine(); //* อ่านข้อมูลระดับเกรดจากผู้ใช้

        //* เปรียบเทียบข้อมูลเกรดที่ผู้ใช้ป้อนกับค่าใน enum Grade
        for (Grade g : Grade.values()) {
            if (yg.equalsIgnoreCase(g.toString())) {
                //* ใช้ switch-case เพื่อตรวจสอบเกรดและกำหนดข้อความที่เหมาะสม
                switch (g) {
                    case G:
                        msg = "Good"; //* กำหนดข้อความเป็น "Good" สำหรับเกรด G
                        break;
                    case S:
                        msg = "Satisfactory"; //* กำหนดข้อความเป็น "Satisfactory" สำหรับเกรด S
                        break;
                    case U:
                        msg = "Unsatisfactory"; //* กำหนดข้อความเป็น "Unsatisfactory" สำหรับเกรด U
                        break;
                }
            }
        }

        //* แสดงผลลัพธ์เกรดและข้อความที่กำหนด
        System.out.println("Your grade is " + yg + " = " + msg);

        //* แสดงค่าของ enum Colors
        for (Colors color : Colors.values()){
            System.out.println(color);
        }
    }
}

/*
ผลลัพธ์ของการทำงานทั้งหมดของโปรแกรมนี้

Grade Levels are: G  S  U 
Enter your grade:g
Your grade is g = Good
Red
Green
Blue

*/
