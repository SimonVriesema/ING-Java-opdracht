package com.ing.zoo;

import com.ing.zoo.Animal;

import java.util.Random;

/**
 * The Pig class represents a pig animal in the zoo.
 * It extends the Animal class.
 */
public class Pig extends Animal {

    /**
     * Constructs a Pig object with the given name.
     *
     * @param name The name of the pig.
     */
    public Pig(String name) {
        super(name);
    }

    /**
     * Makes the pig say hello by printing a splash sound.
     */
    @Override
    public void sayHello() {
        String helloText = "splash";
        System.out.println(helloText);
    }

    /**
     * Makes the pig eat leaves by printing an eating sound.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch oink";
        System.out.println(eatText);
    }

    /**
     * Makes the pig eat meat by printing an eating sound.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    /**
     * Makes the pig perform a random trick: either rolling in the mud or running in circles.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
        if(rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}