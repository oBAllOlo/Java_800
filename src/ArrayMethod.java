import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        int num1[] = {15, 22, 33, 10, 8, 27, 45}; //* สร้างอาร์เรย์ num1
        int num2[] = {15, 22, 33, 10, 8, 27, 45}; //* สร้างอาร์เรย์ num2

        System.out.println("Number of num1 = " + num1.length); //* แสดงความยาวของอาร์เรย์ num1

        Arrays.sort(num2); //* เรียงลำดับอาร์เรย์ num2
        System.out.print("num2 >> ");
        for (int i = 0; i < num2.length; i++) { //* ลูปผ่านแต่ละองค์ประกอบของ num2
            System.out.print(num2[i] + ","); //* แสดงค่าแต่ละองค์ประกอบของ num2
        }
        System.out.println(); //* ขึ้นบรรทัดใหม่

        Arrays.sort(num1); //* เรียงลำดับอาร์เรย์ num1
        System.out.print("num1 >> ");
        for (int number : num1) { //* ลูปผ่านแต่ละองค์ประกอบของ num1
            System.out.print(number + ","); //* แสดงค่าแต่ละองค์ประกอบของ num1
        }
        System.out.println(); //* ขึ้นบรรทัดใหม่

        int idx = Arrays.binarySearch(num1, 15); //* ค้นหาค่าของ 15 ในอาร์เรย์ num1
        System.out.println("Found 15 in index "+idx); //* แสดงตำแหน่งที่พบ 15
        idx = Arrays.binarySearch(num1, 99); //* ค้นหาค่าของ 99 ในอาร์เรย์ num1
        System.out.println("Not Found 99 >> "+idx); //* แสดงผลลัพธ์ของการค้นหาค่า 99 (ไม่พบจะคืนค่า -1)

        System.out.println("num1 == num2 >> "+Arrays.equals(num1, num2)); //* ตรวจสอบความเท่ากันของ num1 และ num2

        Arrays.fill(num1, 1); //* เติมค่า 1 ให้กับทุกตำแหน่งในอาร์เรย์ num1
        for (int number : num1) { //* ลูปผ่านแต่ละองค์ประกอบของ num1
            System.out.print(number + ","); //* แสดงค่าแต่ละองค์ประกอบของ num1
        }
        System.out.println(); //* ขึ้นบรรทัดใหม่

        System.out.println("num1 == num2 >> "+Arrays.equals(num1, num2)); //* ตรวจสอบความเท่ากันของ num1 และ num2 หลังจากเติมค่าใหม่
    }
}
