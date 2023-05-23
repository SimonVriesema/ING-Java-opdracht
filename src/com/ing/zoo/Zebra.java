package com.ing.zoo;

/**
 * The Zebra class represents a zebra animal in the zoo.
 * It extends the Animal class.
 */
public class Zebra extends Animal {

    /**
     * Constructs a Zebra object with the given name.
     *
     * @param name The name of the zebra.
     */
    public Zebra(String name) {
        super(name);
    }

    /**
     * Makes the zebra say hello by printing a specific sound.
     */
    @Override
    public void sayHello() {
        String helloText = "zebra zebra";
        System.out.println(helloText);
    }

    /**
     * Makes the zebra eat leaves by printing a specific sound.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    /**
     * Makes the zebra eat meat.
     * Zebras are herbivorous and do not eat meat.
     */
    @Override
    public void eatMeat() {
        // Zebras do not eat meat
    }

    /**
     * Makes the zebra perform a trick.
     * Zebras do not perform tricks.
     */
    @Override
    public void performTrick() {
        // Zebras do not perform tricks
    }
}