package com.ing.zoo;

import java.util.Random;

/**
 * The Tiger class represents a tiger animal in the zoo.
 * It extends the Animal class.
 */
public class Tiger extends Animal {

    /**
     * Constructs a Tiger object with the given name.
     *
     * @param name The name of the tiger.
     */
    public Tiger(String name) {
        super(name);
    }

    /**
     * Makes the tiger say hello by printing a roaring sound.
     */
    @Override
    public void sayHello() {
        String helloText = "rraaarww";
        System.out.println(helloText);
    }

    /**
     * Makes the tiger eat leaves.
     * Tigers are carnivorous and do not eat leaves.
     */
    @Override
    public void eatLeaves() {
        // Tigers do not eat leaves
    }

    /**
     * Makes the tiger eat meat by printing an eating sound.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    /**
     * Makes the tiger perform a random trick: either jumping in a tree or scratching its ears.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}