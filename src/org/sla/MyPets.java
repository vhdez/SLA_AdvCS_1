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

        //Paxton's Cat
        Cat magnum = new Cat();
        magnum.age = 5;
        magnum.name = "Magnum";
        magnum.petType = "cat";
        magnum.eatsDryFood = true;

        //Paxton's Rock
        Rock rocky = new Cat();
        rocky.age = 7;
        rocky.name = "Rocky";
        rocky.petType = "rock";
        rocky.eatsDryFood = false;

        // Tell the pets to say hi.
        System.out.println("SAY HI PETS!");
        bowser.sayHi();
        tully.sayHi();
        ralph.sayHi();
        System.out.println();

        // Tell the pets to describe themselves.
        System.out.println("NOW DESCRIBE YOURSELVES:");
        bowser.describe();
        System.out.println();
        tully.describe();
        System.out.println();
        ralph.describe();
        System.out.println();

        // Report cumulative data about pets.
        int totalPetsAge = bowser.getAge() + tully.getAge() + ralph.getAge() + magnum.getAge() + rocky.getAge()*1000;
        System.out.println("MY pets have lived a total of " + totalPetsAge + " human years.");
    }
}