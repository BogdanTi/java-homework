package bogdantara;

import java.util.*;

public class Organization extends Employee {
    public void addEmployee(HashMap employees) {
        Employee newEmployee = new Employee();
        Scanner input = new Scanner(System.in);
        System.out.println("Index / Id: ");
        newEmployee.setIndex(input.nextInt());
        System.out.print("Name: ");
        newEmployee.setName(input.next());
        System.out.print("Gender: ");
        newEmployee.setGender(input.next());
        System.out.print("Age: ");
        newEmployee.setAge(input.nextInt());
        System.out.print("Department: ");
        newEmployee.setDepartment(input.next());
        System.out.print("Job Title: ");
        newEmployee.setJobTitle(input.next());
        System.out.println("add mentions: ");
        newEmployee.setMentions(input.next());
        employees.put(employees.size() + 1, newEmployee);
    }

    public void addEmployee(HashMap employees, int indexId, String name, String  gender, int age, String department, String jobTitle, String mentions) {
        Employee newEmployee = new Employee();
        newEmployee.setIndex(indexId);
        newEmployee.setName(name);
        newEmployee.setGender(gender);
        newEmployee.setAge(age);
        newEmployee.setDepartment(department);
        newEmployee.setJobTitle(jobTitle);
        newEmployee.setMentions(mentions);
        employees.put(employees.size() + 1, newEmployee);
    }

    public void displayEmployee(Map.Entry<Integer, Employee> employee) {
        System.out.println("\nThe selected employee is: " + "Name: " + employee.getValue().getName()
                + " index/id: " + employee.getValue().getIndex()
                + " Gender: " + employee.getValue().getGender()
                + " Age: " + employee.getValue().getAge()
                + " Department: " + employee.getValue().getDepartment()
                + " Job Title: " + employee.getValue().getJobTitle()
                + " mentions: " + employee.getValue().getMentions()
                + " position in list: " + employee.getKey());
    }

    public void searchEmployee(HashMap<Integer, Employee> employees) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nSelect search criteria:");
        System.out.println("0. Search by index/id ");
        System.out.println("1. Search by Name ");
        System.out.println("2. Search by Gender ");
        System.out.println("3. Search by Age ");
        System.out.println("4. Search by Department ");
        System.out.println("5. Search by Job Title ");
        System.out.println("6. Search by mentions ");
        int searchOption = input.nextInt();
        switch (searchOption) {
            case 0: {
                System.out.println("Index/Id: ");
                int index = input.nextInt();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getIndex() == index)
                        displayEmployee(employee);
                }
                break;
            }
            case 1: {
                System.out.println("Name: ");
                String name = input.next();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getName().equals(name))
                        displayEmployee(employee);
                }
                break;
            }
            case 2: {
                System.out.println("Gender: ");
                String gender = input.next();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getGender().equals(gender))
                        displayEmployee(employee);
                }
                break;
            }
            case 3: {
                System.out.println("Age: ");
                int age = input.nextInt();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getAge() == age)
                        displayEmployee(employee);
                }
                break;
            }
            case 4: {
                System.out.println("Department: ");
                String department = input.next();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getDepartment().equals(department))
                        displayEmployee(employee);
                }
                break;
            }
            case 5: {
                System.out.println("Job Title: ");
                String jobTitle = input.next();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getJobTitle().equals(jobTitle))
                        displayEmployee(employee);
                }
                break;
            }
            case 6: {
                System.out.println("mentions: ");
                String mentions = input.next();
                for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
                    if (employee.getValue().getMentions().equals(mentions))
                        displayEmployee(employee);
                }
                break;
            }
        }
    }

    public void removeEmployee(HashMap employees) {
        Scanner input = new Scanner(System.in);
        System.out.println("you can delete an entry if you know the user's position in the list");
        System.out.println("Enter the user's position in the list: ");
        employees.remove(input.nextInt());
    }

    public void updateEmployee(HashMap<Integer, Employee> employees) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the user's position in the list: ");
        int userID = input.nextInt();
        for (Map.Entry<Integer, Employee> employee : employees.entrySet()) {
            if (employee.getKey() == userID) {
                System.out.println("\nyou selected: ");
                displayEmployee(employee);
                System.out.println("0. Update the employee's index/id");
                System.out.println("1. Update the employee's name");
                System.out.println("2. Update the employee's department");
                System.out.println("3. Update the employee's job title");
                System.out.println("4. Update the employee's mentions");
                System.out.println("Enter your selection");
                int updateOption = input.nextInt();
                switch (updateOption) {
                    case 0: {
                        System.out.println("Enter the employee's new index/id: ");
                        Integer index = input.nextInt();
                        employee.getValue().setIndex(index);
                        break;
                    }
                    case 1: {
                        System.out.println("Update the employee's name: ");
                        String name = input.next();
                        employee.getValue().setName(name);
                        break;
                    }
                    case 2: {
                        System.out.println("Update the employee's department: ");
                        String department = input.next();
                        employee.getValue().setDepartment(department);
                        break;
                    }
                    case 3: {
                        System.out.println("Update the employee's job title: ");
                        String jobTitle = input.next();
                        employee.getValue().setJobTitle(jobTitle);
                        break;
                    }
                    case 4: {
                        System.out.println("Update the employee's mentions: ");
                        String mentions = input.next();
                        employee.getValue().setMentions(mentions);
                        break;
                    }
                }
                System.out.println("The updated employee:");
                displayEmployee(employee);
            }
        }
    }
    public void mainMenu(HashMap employees) {
        System.out.println("\nOperations available for this employee list");
        System.out.println("1. Add employees");
        System.out.println("2. Search employee by different attributes");
        System.out.println("3. Remove employees one by one");
        System.out.println("4. Update some information for a user selected employee");
        System.out.println("Enter your option: ");
        Scanner input = new Scanner(System.in);
        Organization Org1 = new Organization();
        int menuOption = input.nextInt();
        switch (menuOption) {
            case 1:
                Org1.addEmployee(employees);
                mainMenu(employees);
                break;
            case 2:
                Org1.searchEmployee(employees);
                mainMenu(employees);
                break;
            case 3:
                Org1.removeEmployee(employees);
                mainMenu(employees);
                break;
            case 4:
                Org1.updateEmployee(employees);
                mainMenu(employees);
                break;
            default:
                System.out.println("An invalid option was entered or the user wanted to exit this menu.");
                break;
        }
    }

}
