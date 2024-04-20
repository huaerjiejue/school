package org.Experiment3;

public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public Person() {
        this.name = "No One";
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void businessCard() {
        System.out.println("Name: " + this.name);
    }
}
