public class TestModifier {
    public static void main(String[] args) {
        TestPublic obj1 = new  TestPublic();
        TestPrivate obj2 = new  TestPrivate();


        System.out.println("Old Salary = "+obj1.salary1);
        obj1.salary1 = 18000.0f;
        System.out.println("Old Salary = "+obj1.salary1);

        System.out.println("Old Salary = "+obj2.getSalary());
        obj2.setSalary2(35000.0f);
        System.out.println("New old Salary = "+obj2.getSalary());
    }
}