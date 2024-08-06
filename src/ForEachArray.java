import java.util.ArrayList;

public class ForEachArray {
    public static void main(String[] args) {
        // 1D Array
        double[] score = {18.5, 40.25, 30.75}; //* สร้างอาร์เรย์ double ชื่อ score และกำหนดค่าเริ่มต้น
        int[] number = new int[5]; //* สร้างอาร์เรย์ int ชื่อ number ขนาด 5
        number[0] = 2; //* กำหนดค่าให้กับตำแหน่งแรกของอาร์เรย์ number

        //* Initialize the number array
        for (int i = 1; i < number.length; i++) { //* ลูปเริ่มจากตำแหน่งที่ 1 จนถึงตำแหน่งสุดท้ายของอาร์เรย์
            number[i] = i + 5; //* กำหนดค่าของแต่ละตำแหน่งในอาร์เรย์ number
        }

        //* Print number array using traditional for loop
        System.out.println("Number array:");
        for (int i = 0; i < number.length; i++) { //* ลูปผ่านแต่ละตำแหน่งของอาร์เรย์ number
            System.out.println(number[i]); //* แสดงค่าของแต่ละตำแหน่ง
        }

        //* Print number array using for-each loop
        System.out.println("Number array (for-each loop):");
        for (int n : number) { //* ลูปผ่านแต่ละค่าในอาร์เรย์ number โดยใช้ for-each loop
            System.out.print(n + ", "); //* แสดงค่าของแต่ละตำแหน่ง
        }
        System.out.println(); //* ขึ้นบรรทัดใหม่

        //* Print score array using for-each loop
        System.out.println("Score array:");
        for (double s : score) { //* ลูปผ่านแต่ละค่าในอาร์เรย์ score โดยใช้ for-each loop
            System.out.print(s + ", "); //* แสดงค่าของแต่ละตำแหน่ง
        }
        System.out.println(); //* ขึ้นบรรทัดใหม่

        //* ArrayList example
        ArrayList<String> str = new ArrayList<>(); //* สร้าง ArrayList ชื่อ str สำหรับเก็บข้อมูลประเภท String
        str.add("Hello"); //* เพิ่มข้อความ "Hello" ลงใน ArrayList
        str.add("World"); //* เพิ่มข้อความ "World" ลงใน ArrayList
        str.add(1, "Java"); //* เพิ่มข้อความ "Java" ที่ตำแหน่งที่ 1 (หลัง "Hello")

        //* Print ArrayList using traditional for loop
        System.out.println("ArrayList (traditional for loop):");
        for (int i = 0; i < str.size(); i++) { //* ลูปผ่านแต่ละตำแหน่งของ ArrayList
            System.out.println(str.get(i)); //* แสดงค่าของแต่ละตำแหน่ง
        }

        //* Print ArrayList using for-each loop
        System.out.println("ArrayList (for-each loop):");
        for (String s : str) { //* ลูปผ่านแต่ละค่าใน ArrayList โดยใช้ for-each loop
            System.out.println(s); //* แสดงค่าของแต่ละตำแหน่ง
        }
    }
}
