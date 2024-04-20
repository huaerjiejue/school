package org.Experiment3;

public class Cat implements Animal{
    private final String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void cry() {
        System.out.println("meow meow meow!");
    }

    @Override
    public String getAnimalName() {
        return this.name;
    }
}
