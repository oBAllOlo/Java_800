import java.util.Scanner;

public class Test3D {
    public static void main(String[] args) {
        int[][][] room; // ประกาศอาร์เรย์สามมิติ
        RoomInfo roomData = new RoomInfo(); // สร้างออบเจกต์ RoomInfo
        room = roomData.inputData(); // รับข้อมูลจากผู้ใช้
        roomData.checkData(room); // คำนวณข้อมูลที่ต้องการ
        roomData.showData(); // แสดงผลลัพธ์
    }
}

class RoomInfo {
    private int block, row, column; // ขนาดของอาร์เรย์สามมิติ
    private int totalMan, totalAvail; // รวมจำนวนนักศึกษาและห้องว่าง

    // คำนวณจำนวนคนหรือห้องว่างในอาร์เรย์สามมิติ
    public int getTotal(int[][][] rm, int t) {
        int count = 0;
        for (int i = 0; i < block; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    switch (t) {
                        case 0: // ตรวจหาห้องว่าง
                            if (rm[i][j][k] == 0)
                                count++;
                            break;
                        case 1: // คำนวณจำนวนคน
                            if (rm[i][j][k] != 0)
                                count += rm[i][j][k];
                            break;
                    }
                }
            }
        }
        return count;
    }

    // รับข้อมูลจากผู้ใช้
    public int[][][] inputData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input total Building --> ");
        block = scan.nextInt(); // จำนวนตึก
        System.out.print("Input total Floor --> ");
        row = scan.nextInt(); // จำนวนชั้น
        System.out.print("Input total Room --> ");
        column = scan.nextInt(); // จำนวนห้อง

        int[][][] rm = new int[block][row][column]; // สร้างอาร์เรย์สามมิติ

        // รับข้อมูลจำนวนคนในแต่ละห้อง
        for (int i = 0; i < block; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    System.out.print("Input people in building " + (i + 1) + " Floor " + (j + 1) + " Room " + (k + 1) + " --> ");
                    rm[i][j][k] = scan.nextInt(); // รับค่าจำนวนคน
                }
            }
        }
        return rm; // ส่งคืนอาร์เรย์สามมิติ
    }

    // คำนวณข้อมูลรวมจำนวนคนและห้องว่าง
    public void checkData(int[][][] rm) {
        totalMan = getTotal(rm, 1); // คำนวณจำนวนคนทั้งหมด
        totalAvail = getTotal(rm, 0); // คำนวณจำนวนห้องว่าง
    }

    // แสดงผลลัพธ์
    public void showData() {
        System.out.println("Total People = " + totalMan); // แสดงจำนวนคนทั้งหมด
        System.out.println("Total Available Room = " + totalAvail); // แสดงจำนวนห้องว่าง
    }
}
