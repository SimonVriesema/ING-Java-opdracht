package com.ing.zoo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        // Define an array of commands
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // Create instances of animal classes
        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        // Read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        // Check the input and perform actions accordingly
        if (input.equals(commands[0])) {
            // Execute 'hello' command for all animals
            henk.sayHello();
            elsa.sayHello();
            dora.sayHello();
            wally.sayHello();
            marty.sayHello();
        } else if (input.equals(commands[1])) {
            // Execute 'hello' command for all animals
            elsa.eatLeaves();
            dora.eatLeaves();
            marty.eatLeaves();
        } else if (input.equals(commands[2])) {
            // Execute 'hello' command for all animals
            henk.eatMeat();
            dora.eatMeat();
            wally.eatMeat();
        } else if (input.equals(commands[3])) {
            // Execute 'hello' command for all animals
            dora.performTrick();
            wally.performTrick();
        } else if (input.equals(commands[0] + " henk")) {
            // Execute 'hello' command for Lion named 'henk'
            henk.sayHello();
        } else if (input.equals(commands[0] + " elsa")) {
            // Execute 'hello' command for Lion named 'henk'
            elsa.sayHello();
        } else if (input.equals(commands[0] + " dora")) {
            // Execute 'hello' command for Lion named 'henk'
            dora.sayHello();
        } else if (input.equals(commands[0] + " wally")) {
            // Execute 'hello' command for Lion named 'henk'
            wally.sayHello();
        } else if (input.equals(commands[0] + " marty")) {
            // Execute 'hello' command for Lion named 'henk'
            marty.sayHello();
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
