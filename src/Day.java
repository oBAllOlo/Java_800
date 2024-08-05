    import java.util.Scanner;

    public class Day {
        enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

        public static void main(String[] args) {
            System.out.println();
            System.out.print("Days: ");
            int i = 1; 
            for (Days d : Days.values()) {
                System.out.print(i + "." + d + " ");
                i++; 
            }
            System.out.println();

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your day (1-7): ");
            int day = scan.nextInt();
            
            if (day >= 1 && day <= 7) {
                Days selectedDay = Days.values()[day - 1];
                System.out.println("You selected: " + selectedDay);
            } else {
                System.out.println("Invalid day number.");
            }
            
            scan.close();
        }
    }
