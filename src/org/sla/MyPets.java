package org.sla;

public class MyPets {

    public static void main(String[] args) {
        // I have 3 pets.

        // The 1st pet is a dog named Rufus.
        Dog rufus = new Dog();
        rufus.age = 3;
        rufus.name = "Rufus";
        rufus.eatsDryFood = false;

        // The 2nd pet is an older dog named Tully.
        Dog tully = new Dog();
        tully.age = 5;
        tully.name = "Tully";
        tully.eatsDryFood = true;

        // The 2nd pet is an older dog named Tully.
        Cat ralph = new Cat();
        ralph.age = 15;
        ralph.name = "Ralph";
        ralph.eatsDryFood = false;

        // Tell the pets to say hi.
        System.out.println("SAY HI PETS!");
        rufus.sayHi();
        tully.sayHi();
        ralph.sayHi();
        System.out.println();

        // Tell the pets to describe themselves.
        System.out.println("NOW DESCRIBE YOURSELVES:");
        rufus.describe();
        System.out.println();
        tully.describe();
        System.out.println();
        ralph.describe();
        System.out.println();

        // Report cumulative data about pets.
        int totalPetsAge = rufus.getAge() + tully.getAge() + ralph.getAge();
        System.out.println("My pets have lived a total of " + totalPetsAge + " human years.");
    }
}