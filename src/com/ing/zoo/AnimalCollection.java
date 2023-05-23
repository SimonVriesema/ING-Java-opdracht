package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * The AnimalCollection class represents a collection of animals in the zoo.
 *
 * @author simon_vriesema
 */
public class AnimalCollection {
    private List<Animal> animals;

    /**
     * Constructs an AnimalCollection object.
     */
    public AnimalCollection() {
        animals = new ArrayList<>();
    }

    /**
     * Adds an animal to the collection.
     *
     * @param animal The animal to be added.
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Removes an animal from the collection.
     *
     * @param animal The animal to be removed.
     */
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    /**
     * Makes all animals in the collection say hello.
     */
    public void makeAnimalsSayHello() {
        animals.forEach(Animal::sayHello);
    }

    /**
     * Makes all herbivorous animals in the collection eat leaves.
     */
    public void makeHerbivorousAnimalsEat() {
        animals.forEach(Animal::eatLeaves);
    }

    /**
     * Makes all carnivorous animals in the collection eat meat.
     */
    public void makeCarnivorousAnimalsEat() {
        animals.forEach(Animal::eatMeat);
    }

    /**
     * Makes all animals in the collection perform a trick.
     */
    public void makeAnimalsPerformTrick() {
        animals.forEach(Animal::performTrick);
    }

    /**
     * Returns a list of all animals in the collection.
     *
     * @return The list of animals.
     */
    public List<Animal> getAnimals() {
        return animals;
    }
}
