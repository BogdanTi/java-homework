package bogdantara;


import java.util.HashMap;

public class Week4Homework {
    public static void main(String[] args) {
        Organization Org1 = new Organization();
        HashMap<Integer, Employee> employees = new HashMap<>();

        Org1.addEmployee(employees,  1, "Gigel Aurel", "M", 19, "QA", "qa manual", "sample employee");

        Org1.mainMenu(employees);
    }
}