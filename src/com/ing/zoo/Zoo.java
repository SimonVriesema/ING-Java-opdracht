package com.ing.zoo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * The Zoo class represents a zoo where different animals reside.
 *
 * @author simon_vriesema
 */
public class Zoo {
    private static final String COMMAND_HELLO = "hello";
    private static final String COMMAND_GIVE_LEAVES = "give leaves";
    private static final String COMMAND_GIVE_MEAT = "give meat";
    private static final String COMMAND_PERFORM_TRICK = "perform trick";

    private static Lion henk;
    private static Hippo elsa;
    private static Pig dora;
    private static Tiger wally;
    private static Zebra marty;
    private static AnimalCollection animalCollection;

    /**
     * The main method of the Zoo program.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        initializeAnimals();

        // Read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        // Check the input and perform actions accordingly
        executeCommand(input);
    }

    /**
     * Executes the command based on the user input.
     *
     * @param input The user input command.
     */
    private static void executeCommand(String input) {
        if (input.equals(COMMAND_HELLO)) {
            executeHelloCommand();
        } else if (input.equals(COMMAND_GIVE_LEAVES)) {
            executeGiveLeavesCommand();
        } else if (input.equals(COMMAND_GIVE_MEAT)) {
            executeGiveMeatCommand();
        } else if (input.equals(COMMAND_PERFORM_TRICK)) {
            executePerformTrickCommand();
        } else if (input.startsWith(COMMAND_HELLO + " ")) {
            // iterate over all animals and check if the name matches
            for (Animal animal : animalCollection.getAnimals()) {
                String[] parts = input.split(" ");
                if (parts.length == 2 && Objects.equals(parts[1], animal.getName().toLowerCase())) {
                    animal.sayHello();
                }
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }

    /**
     * Initializes the animals in the zoo.
     */
    private static void initializeAnimals() {
        henk = new Lion("henk");
        elsa = new Hippo("elsa");
        dora = new Pig("dora");
        wally = new Tiger("wally");
        marty = new Zebra("marty");

        animalCollection = new AnimalCollection();
        animalCollection.addAnimal(henk);
        animalCollection.addAnimal(elsa);
        animalCollection.addAnimal(dora);
        animalCollection.addAnimal(wally);
        animalCollection.addAnimal(marty);
    }

    /**
     * Executes the "hello" command for all animals.
     */
    private static void executeHelloCommand() {
        animalCollection.makeAnimalsSayHello();
    }

    /**
     * Executes the "give leaves" command for herbivorous animals.
     */
    private static void executeGiveLeavesCommand() {
        animalCollection.makeHerbivorousAnimalsEat();
    }

    /**
     * Executes the "give meat" command for carnivorous animals.
     */
    private static void executeGiveMeatCommand() {
        animalCollection.makeCarnivorousAnimalsEat();
    }

    /**
     * Executes the "perform trick" command for animals that can perform tricks.
     */
    private static void executePerformTrickCommand() {
        animalCollection.makeAnimalsPerformTrick();
    }
}