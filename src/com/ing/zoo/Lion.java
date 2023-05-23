package com.ing.zoo;

/**
 * The Lion class represents a lion animal in the zoo.
 * It extends the Animal class.
 */
public class Lion extends Animal {
    /**
     * Constructs a Lion object with the given name.
     *
     * @param name The name of the lion.
     */
    public Lion(String name) {
        super(name);
    }

    /**
     * Makes the lion say hello by printing a roaring sound.
     */
    @Override
    public void sayHello() {
        String helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    /**
     * The lion does not eat leaves, so this method is not implemented.
     */
    @Override
    public void eatLeaves() {
        // Not implemented for lion
    }

    /**
     * Makes the lion eat meat by printing a eating sound.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    /**
     * The lion does not perform tricks, so this method is not implemented.
     */
    @Override
    public void performTrick() {
        // Not implemented for lion
    }
}