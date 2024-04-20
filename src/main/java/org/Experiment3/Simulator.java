package org.Experiment3;

import org.jetbrains.annotations.NotNull;

public class Simulator {

    void playSound(@NotNull Animal animal){

        System.out.print( animal.getAnimalName() + " may cry like this: ");

        animal.cry();

    }

}
