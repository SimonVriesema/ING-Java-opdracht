package com.ing.zoo;

/**
 * The Hippo class represents a hippo animal in the zoo.
 * It extends the Animal class.
 */
public class Hippo extends Animal {

    /**
     * Constructs a Hippo object with the given name.
     *
     * @param name The name of the hippo.
     */
    public Hippo(String name) {
        super(name);
    }

    /**
     * Makes the hippo say hello by printing a splash sound.
     */
    @Override
    public void sayHello() {
        String helloText = "splash";
        System.out.println(helloText);
    }

    /**
     * Makes the hippo eat leaves by printing a munching sound.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch lovely";
        System.out.println(eatText);
    }

    /**
     * The hippo does not eat meat, so this method is not implemented.
     */
    @Override
    public void eatMeat() {
        // Not implemented for hippo
    }

    /**
     * The hippo does not perform tricks, so this method is not implemented.
     */
    @Override
    public void performTrick() {
        // Not implemented for hippo
    }
}