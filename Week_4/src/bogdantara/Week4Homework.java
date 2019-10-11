package bogdantara;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week4Homework {
    public static void main(String[] args){
        //creating and populating the employee class
        public class Employee {
            public static int index;
            public int index;
            private String surname;
            private String name;
            private int age;
            private String gender;
            private String department;
            private String jobTitle;
            private String mention1;
            private String mention2;
            private String id;
            public int index = 0;

            public Employee(int index, String surname, String name, int age, String gender, String department,
                            String jobTitle, String mention1, String mention2, String id){
                this.index = index;
                this.surname = surname;
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.department = department;
                this.jobTitle = jobTitle;
                this.mention1 = mention1;
                this.mention2 = mention2;
                this.id = id;
            }
                return index;
            public Integer getIndex() {return index};;
            public String getSurname(){
                return surname;
            }
            public String getName(){
                return name;
            }
            public Integer getAge(){
                return age;
            }
            public String getGender(){
                return gender;
            }
            public String getDepartment(){
                return department;
            }
            public String getJobTitle(){
                return jobTitle;
            }
            public String getMention1(){
                return mention1;
            }
            public String getMention2(){
                return mention2;
            }
            public String getId(){
                return id;
            }
            public void setIndex (int index) {this.index = index};
            public void setSurname(String surname){
                this.surname = surname;
            }
            public void setName(String name){
                this.name = name;
            }
            public void setAge(int age){
                this.age = age;
            }
            public void setGender(String gender){
                this.gender = gender;
            }
            public void setDepartment(String department){
                this.department = department;
            }
            public void setJobTitle(String jobTitle){
                this.jobTitle = jobTitle;
            }
            public void setMention1(String mention1){
                this.mention1 = mention1;
            }
            public void setMention2(String mention2){
                this.mention2 = mention2;
            }
            public void setId(String id){
                this.id = id;
            }
        }
        //creating an organization class capable of storing&searching employees
        public class Organization {
            private List<Employee> employeeList = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Scanner scanner = new Scanner(System.in);
            //ability to display one user selected employee
            <index> void displayEmployee(int Employee.index){
                System.out.println("Select the index for the employee you want to display: ");
                int indexToDisplay = scanner.nextInt();
                System.out.println("Displaying the selected employee:");
                System.out.println(Employee[indexToDisplay]);
            }
            //ability to add employees
            void addEmployee() throws IOException{
                System.out.println("Enter the employee's surname: ");
                String surname = reader.readLine();
                System.out.println("Enter the employee's name: ");
                String name = reader.readLine();
                System.out.println("Enter the employee's age: ");
                int age = scanner.nextInt();
                System.out.println("Enter the employee's chosen gender: ");
                String gender = reader.readLine();
                System.out.println("Enter the employee's department: ");
                String department = reader.readLine();
                System.out.println("Enter the employee's job title: ");
                String jobTitle = reader.readLine();
                System.out.println("Each employee can have 2 mention fields for misc notes");
                System.out.println("Enter mention 1 for this employee: ");
                String mention1 = reader.readLine();
                System.out.println("Enter mention 2 for this employee: ");
                String mention2 = reader.readLine();
                System.out.println("Enter the employee's allocated ID: ");
                String id = reader.readLine();
                int index = Employee.index;
                employeeList.add(new Employee(index, surname, name, age, gender, department, jobTitle, mention1, mention2, id));
            }
            //ability to delete an employee from the list
            void removeEmployee(){
                System.out.println("Enter the index for the employee to remove: ");
                int indexToDelete = scanner.nextInt();
                employeeList.remove(indexToDelete);
                System.out.println("Employee with index " + indexToDelete + " was removed from the list.");
            }
            //ability to search an employee
            void searchEmployee() throws IOException{
                System.out.println("You can search an employee by using the following keywords:");
                System.out.println("index, surname, name, age, gender, department, jobTitle, mention1, mention2, id");
                System.out.println("Please type your selection: ");
                String selection = reader.readLine();
                switch (selection){
                    case "index":
                        System.out.println("Enter the index to search: ");
                        int index = scanner.nextInt();
                        System.out.println("The search result is: ");
                        System.out.println(employeeList[index]);
                        break;
                    case "surname":
                        System.out.println("enter the surname you want to search: ");
                        String searchSurname = reader.readLine();
                        System.out.println("The search result(s) is: ");
                        for (int i = 0; i <= employeeList.size() - 1; i++){
                            if (searchSurname.contains(employeeList[i])){
                                System.out.println(employeeList[i]);
                            }
                            else
                                System.out.println("404: not found");
                        }
                    case "name":
                        System.out.println("enter the name you want to search: ");
                        String searchName = reader.readLine();
                        System.out.println("The search result(s) is: ");
                        for (int i = 0; i <= employeeList - 1; i++){
                            if (searchName.contains(employeeList[i])){
                                System.out.println(employeeList[i]);
                            }
                            else
                                System.out.println("404: not found");
                        }
                    case "age":
                        System.out.println("enter the age you want to search: ");
                        String searchAge = reader.readLine();
                        System.out.println("The search result(s) is: ");
                        for (int i = 0; i <= employeeList - 1; i++){
                            if (searchAge.contains(employeeList[i])){
                                System.out.println(employeeList[i]);
                            }
                            else
                                System.out.println("404: not found");
                        }
                    case "gender":
                        System.out.println("enter the gender you want to search: ");
                        String searchGender = reader.readLine();
                        System.out.println("The search result(s) is: ");
                        for (int i = 0; i <= employeeList - 1; i++){
                            if (searchGender.contains(employeeList[i])){
                                System.out.println(employeeList[i]);
                            }
                            else
                                System.out.println("404: not found");
                        }
                    case "department":
                        System.out.println("enter the department you want to search: ");
                        String searchDepartment = reader.readLine();
                        System.out.println("The search result(s) is: ");
                        for (int i = 0; i <= employeeList - 1; i++){
                            if (searchDepartment.contains(employeeList[i])){
                                System.out.println(employeeList[i]);
                            }
                            else
                                System.out.println("404: not found");
                        }
                    case "jobTitle":
                        System.out.println("enter the jobTitle you want to search: ");
                        String searchJobTitle = reader.readLine();
                        System.out.println("The search result(s) is: ");
                        for (int i = 0; i <= employeeList - 1; i++){
                            if (searchJobTitle.contains(employeeList[i])){
                                System.out.println(employeeList[i]);
                            }
                            else
                                System.out.println("404: not found");
                        }
                    case "mention1":
                        System.out.println("enter the mention1 you want to search: ");
                        String searchMention1 = reader.readLine();
                        System.out.println("The search result(s) is: ");
                        for (int i = 0; i <= employeeList - 1; i++){
                            if (searchMention1.contains(employeeList[i])){
                                System.out.println(employeeList[i]);
                            }
                            else
                                System.out.println("404: not found");
                        }
                    case "mention2":
                        System.out.println("enter the mention2 you want to search: ");
                        String searchMention2 = reader.readLine();
                        System.out.println("The search result(s) is: ");
                        for (int i = 0; i <= employeeList - 1; i++){
                            if (searchMention2.contains(employeeList[i])){
                                System.out.println(employeeList[i]);
                            }
                            else
                                System.out.println("404: not found");
                        }
                    case "id":
                        System.out.println("enter the id you want to search: ");
                        String searchId = reader.readLine();
                        System.out.println("The search result(s) is: ");
                        for (int i = 0; i <= employeeList - 1; i++){
                            if (searchId.contains(employeeList[i])){
                                System.out.println(employeeList[i]);
                            }
                            else
                                System.out.println("404: not found");
                        }
                }
            }
            //ability to update information
            void updateEmployeeSurname() throws IOException{
                System.out.println("Enter the index of the employee to update: ");
                int index  = scanner.nextInt();
                for (Employee employee : employeeList){
                    System.out.println("index: " + employee.getIndex() + " has surname: " + employee.getSurname());
                }
                System.out.println("Enter the new surname");
            }
        }
        }

}
