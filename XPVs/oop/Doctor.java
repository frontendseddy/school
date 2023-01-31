package XPVs.oop;

import java.sql.SQLOutput;

public class Doctor {
    int salary;
    String name;

    public Doctor (String name) {
        this.name = name;
        salary = 50000;
        System.out.println(this.name);
        System.out.println("I am Doctor");
    }

    void printInfo(){
        System.out.println("Name is " + name);
        System.out.println("Salary is " + salary);
    }

    void prescribe(String drug){
        System.out.println("Prescribing " + drug);
    }




}
