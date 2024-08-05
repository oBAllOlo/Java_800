import java.util.Scanner;

public class EnumTest {
    enum Colors {Red, Green, Blue}
    enum Grade {G, S, U}
    enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    
    public static void main(String[] args) {
        String msg = "Unknown";
        System.out.print("Grade Levels are:");
        for (Grade g : Grade.values()) {
            System.out.printf("%2s ", g);
        }
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade:");
        String yg = scan.nextLine();

        // Compare the input grade with enum values
        for (Grade g : Grade.values()) {
            if (yg.equalsIgnoreCase(g.toString())) {
                switch (g) {
                    case G:
                        msg = "Good";
                        break;
                    case S:
                        msg = "Satisfactory";
                        break;
                    case U:
                        msg = "Unsatisfactory";
                        break;
                }
            }
        }
        System.out.println("Your grade is " + yg + " = " + msg);
        scan.close();

        for (Colors color : Colors.values()){
            System.out.println(color);
        }

    

    }
}
