import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        //*สร้าง ArrayList ชื่อ num:
        ArrayList<Integer> num = new ArrayList<>();
        //* เพิ่มค่าลงใน ArrayList: 
        for (int i = 0; i < 5; i++) 
            num.add(i + 3);
            //TODO ในลูปนี้ โปรแกรมจะเพิ่มตัวเลขตั้งแต่ 3 ถึง 7 ลงใน ArrayList ทำให้ num มีค่าดังนี้: [3, 4, 5, 6, 7].

        //* โปรแกรมจะพิมพ์ค่าใน ArrayList ออกมาดังนี้: 3, 4, 5, 6, 7,
        for (int number : num) 
            System.out.print(number+", ");
            //TODO โปรแกรมจะพิมพ์ค่าใน ArrayList ออกมาดังนี้: 3, 4, 5, 6, 7, 

        //*พิมพ์ขนาดของ ArrayList: 
        System.out.println("Total size = "+num.size());
        //TODO ขนาดของ num คือ 5 ดังนั้นโปรแกรมจะพิมพ์: Total size = 5.

        //* เพิ่มค่าในตำแหน่งที่ 2 ของ ArrayList:
        num.add(2,10);
        //TODO โปรแกรมจะเพิ่มค่า 10 ที่ตำแหน่งที่ 2 ของ ArrayList ทำให้ num มีค่าดังนี้: [3, 4, 10, 5, 6, 7].

        //* พิมพ์ค่าใน ArrayList อีกครั้ง:
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i)+", ");
        }
        //TODO โปรแกรมจะพิมพ์ค่าใน ArrayList ออกมาดังนี้: 3, 4, 10, 5, 6, 7, .

         //* พิมพ์ขนาดของ ArrayList อีกครั้ง:
        System.out.println("Total size = "+num.size());
        //TODO ขนาดของ num คือ 6 ดังนั้นโปรแกรมจะพิมพ์: Total size = 6.

        //* ลบค่าที่ตำแหน่งที่ 3 ของ ArrayList:
        num.remove(3);
        //TODO โปรแกรมจะลบค่าที่ตำแหน่งที่ 3 (ค่าคือ 5) ทำให้ num มีค่าดังนี้: [3, 4, 10, 6, 7].

        //* พิมพ์ค่าใน ArrayList อีกครั้ง:
        for (int number : num) 
            System.out.print(number+", ");
            //TODO โปรแกรมจะพิมพ์ค่าใน ArrayList ออกมาดังนี้: 3, 4, 10, 6, 7, .

        //* ค้นหาตำแหน่งของค่า 6 ใน ArrayList:
        int idx1 = num.indexOf(6);
        System.out.println("Number 6 is index = "+idx1);
        //TODO โปรแกรมจะหาตำแหน่งของค่า 6 ใน ArrayList และพิมพ์ออกมา ตำแหน่งคือ 3 ดังนั้นจะพิมพ์: Number 6 is index = 3.
        
        //* ค้นหาตำแหน่งของค่า 25 ใน ArrayList:
        idx1 = num.indexOf(25);
        System.out.println("Number 25 is index = "+idx1);
        //TODO โปรแกรมจะหาตำแหน่งของค่า 25 ใน ArrayList ซึ่งไม่มีอยู่ในลิสต์ ดังนั้นจะคืนค่ากลับมาเป็น -1 และพิมพ์: Number 25 is index = -1.



        //* ผลลัพธ์ของการทำงานทั้งหมดของโปรแกรมนี้จะเป็น:
       //? 3, 4, 5, 6, 7, Total size = 5
       //? 3, 4, 10, 5, 6, 7, Total size = 6
       //? 3, 4, 10, 6, 7, Number 6 is index = 3
       //? Number 25 is index = -1



    }
}
