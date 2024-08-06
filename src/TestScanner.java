import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = sc.nextLine();

        
        System.out.print("Input your age: ");
        int age = sc.nextInt();

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");

    }
}
