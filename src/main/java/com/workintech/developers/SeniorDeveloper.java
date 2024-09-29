package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id ,String name , double salary) {
        super(id, name, salary);
    }

    public void work () {
        System.out.println("Senior Developer salary updated.");
        super.setSalary(this.getSalary() + 1500);
    }
}
