package org.sla;

class MyPets {

     public static void main(String[] args) {
        // I have 3 pets.

        // The 1st pet is a dog named Rufus.
        Dog bowser = new Dog();
        bowser.age = 3;
        bowser.name = "Bowser";
        bowser.petType = "dog";
        bowser.eatsDryFood = false;

        // The 2nd pet is an older dog named Tully.
        Dog tully = new Dog();
        tully.age = 14;
        tully.name = "Tully";
        tully.petType = "dog";
        tully.eatsDryFood = true;

        // The 3rd pet is an older cat named Ralph.
        Cat ralph = new Cat();
        ralph.age = 15;
        ralph.name = "Ralph";
        ralph.petType = "cat";
        ralph.eatsDryFood = false;

        // The other dog is a dog named George.
         // Andrew Wrote this:
        Dog George = new Dog();
        George.age = 1;
        George.name = "George";
        George.petType = "dog";
        George.eatsDryFood = false;

        // An Iguana named Iggy
         // Andrew wrote this:
        Iguana Iggy = new Iguana();
        Iggy.age = 5;
        Iggy.name = "Iggy";
        Iggy.petType = "Iguana";
        Iggy.eatsDryFood = false;

        // Tell the pets to say hi.
        System.out.println("SAY HI PETS!");
        bowser.sayHi();
        tully.sayHi();
        ralph.sayHi();
        George.sayHi();
        Iggy.sayHi();
        System.out.println();

        // Tell the pets to describe themselves.
        System.out.println("NOW DESCRIBE YOURSELVES:");
        bowser.describe();
        System.out.println();
        tully.describe();
        System.out.println();
        ralph.describe();
        System.out.println();
        George.describe();
        System.out.println();
        Iggy.describe();

        // Report cumulative data about pets.
        int totalPetsAge = bowser.getAge() + tully.getAge() + ralph.getAge() + George.getAge() + Iggy.getAge();
        System.out.println("My pets have lived a total of " + totalPetsAge + " human years.");
    }
}