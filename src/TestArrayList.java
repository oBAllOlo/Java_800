import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 5; i++) 
            num.add(i + 3);
        for (int number : num) 
            System.out.print(number+", ");

        System.out.println("Total size = "+num.size());

        num.add(2,10);
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i)+", ");
        }

        System.out.println("Total size = "+num.size());
        num.remove(3);
        for (int number : num) 
            System.out.print(number+", ");

        int idx1 = num.indexOf(6);
        System.out.println("Number 6 is index = "+idx1);
        idx1 = num.indexOf(25);
        System.out.println("Number 25 is index = "+idx1);
    }
}
