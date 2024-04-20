package org.Experiment3;

public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        Animal cat = new Cat("Tom");
        Animal dog = new Dog("Spike");

        simulator.playSound(cat);
        simulator.playSound(dog);
    }
}
