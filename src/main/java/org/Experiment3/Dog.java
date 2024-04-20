package org.Experiment3;

public class Dog implements Animal{
    private final String name;

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void cry() {
        System.out.println("barf barf barf!");
    }

    @Override
    public String getAnimalName() {
        return this.name;
    }
}
