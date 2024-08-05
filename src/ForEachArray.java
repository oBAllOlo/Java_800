import java.util.ArrayList;

public class ForEachArray {
    public static void main(String[] args) {
        // 1D Array
        double[] score = {18.5, 40.25, 30.75};
        int[] number = new int[5];
        number[0] = 2;

        // Initialize the number array
        for (int i = 1; i < number.length; i++) {
            number[i] = i + 5;
        }

        // Print number array using traditional for loop
        System.out.println("Number array:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        // Print number array using for-each loop
        System.out.println("Number array (for-each loop):");
        for (int n : number) {
            System.out.print(n + ", ");
        }
        System.out.println();

        // Print score array using for-each loop
        System.out.println("Score array:");
        for (double s : score) {
            System.out.print(s + ", ");
        }
        System.out.println();

        // ArrayList example
        ArrayList<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("World");
        str.add(1, "Java");

        // Print ArrayList using traditional for loop
        System.out.println("ArrayList (traditional for loop):");
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }

        // Print ArrayList using for-each loop
        System.out.println("ArrayList (for-each loop):");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
