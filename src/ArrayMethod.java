import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        int num1[] = {15, 22, 33, 10, 8, 27, 45};
        int num2[] = {15, 22, 33, 10, 8, 27, 45};

        System.out.println("Number of num1 = " + num1.length);

        Arrays.sort(num2);
        System.out.print("num2 >> ");
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i] + ",");
        }
        System.out.println();

        Arrays.sort(num1);
        System.out.print("num1 >> ");
        for (int number : num1) {
            System.out.print(number + ",");
        }
        System.out.println();

        int idx = Arrays.binarySearch(num1, 15);
        System.out.println("Found 15 in index "+idx);
        idx = Arrays.binarySearch(num1, 99);
        System.out.println("Not Found 99 >> "+idx);

        System.out.println("num1 == num2 >> "+Arrays.equals(num1, num2));
        Arrays.fill(num1,1);
        for (int number : num1) {
            System.out.print(number + ",");
        }
        System.out.println();

        System.out.println("num1 == num2 >> "+Arrays.equals(num1, num2));


    }
}
