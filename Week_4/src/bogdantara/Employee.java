package bogdantara;

import java.util.HashMap;

public class Employee {
    public int indexId;
    private String name;
    private int age;
    private String gender;
    private String department;
    private String jobTitle;
    private String mentions;

    public void setIndex(int indexId) {this.indexId = indexId;}
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setGender(String gender) {this.gender = gender;}
    public void setDepartment(String department) {this.department = department;}
    public void setJobTitle(String jobTitle) {this.jobTitle = jobTitle;}
    public void setMentions(String mentions) {this.mentions = mentions;}
    public int getIndex() {return this.indexId;}
    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    public String getGender() {return this.gender;}
    public String getDepartment() {return this.department;}
    public String getJobTitle() {return this.jobTitle;}
    public String getMentions() {return this.mentions;}

    public void displayDetails(){
        System.out.println("Index/ID: "+ this.indexId + " Name: "
                + this.name + " Gender: " + this.gender + " Age: "
                + this.age + " Department: " + this.department + " Job Title: "
                + this.jobTitle + " Mentions: " + this.mentions);
    }
}