import java.util.Scanner; // นำเข้าแพ็คเกจ Scanner สำหรับรับข้อมูลจากผู้ใช้

public class Day {
    //* ประกาศ enum ชื่อ Days ซึ่งมีค่าคือวันต่างๆ ในสัปดาห์
    enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        System.out.println(); //* พิมพ์บรรทัดใหม่เพื่อจัดระเบียบเอาท์พุต

        //* แสดงรายการวันในสัปดาห์พร้อมหมายเลข
        System.out.print("Days: ");
        int i = 1; //* ตัวแปรสำหรับหมายเลขวัน
        for (Days d : Days.values()) { //* ลูปผ่านค่า enum Days ทั้งหมด
            System.out.print(i + "." + d + " ");  //* แสดงหมายเลขและชื่อวัน
            i++; //* เพิ่มหมายเลขวัน
        }
        System.out.println(); //* พิมพ์บรรทัดใหม่หลังจากรายการ

        //* สร้างออบเจกต์ Scanner เพื่อรับข้อมูลจากผู้ใช้
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your day (1-7): "); //* ขอให้ผู้ใช้ป้อนหมายเลขวัน
        int day = scan.nextInt(); //* รับข้อมูลหมายเลขวันจากผู้ใช้

        //* ตรวจสอบว่าเลขวันที่ป้อนอยู่ในช่วงที่ถูกต้อง
        if (day >= 1 && day <= 7) {
            //* เลือกวันจาก enum Days ตามหมายเลขที่ป้อน (ลบ 1 เพราะ array index เริ่มจาก 0)
            Days selectedDay = Days.values()[day - 1];
            System.out.println("You selected: " + selectedDay); //* แสดงวันที่ผู้ใช้เลือก
        } else {
            //* หากหมายเลขวันไม่ถูกต้อง แสดงข้อความเตือน
            System.out.println("Invalid day number.");
        }
        scan.close(); //* ปิดออบเจกต์ Scanner
    }
}
