package com.ing.zoo;

/**
 * The Animal class represents an abstract animal in the zoo.
 *
 * @author simon_vriesema
 */
public abstract class Animal {
    protected String name;

    /**
     * Constructs an animal with the given name.
     *
     * @param name The name of the animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Makes the animal say hello.
     */
    public abstract void sayHello();

    /**
     * Makes the animal eat leaves.
     */
    public abstract void eatLeaves();

    /**
     * Makes the animal eat meat.
     */
    public abstract void eatMeat();

    /**
     * Makes the animal perform a trick.
     */
    public abstract void performTrick();

    /**
     * Gets the name of the animal.
     *
     * @return The name of the animal.
     */
    public String getName() {
        return name;
    }
}
