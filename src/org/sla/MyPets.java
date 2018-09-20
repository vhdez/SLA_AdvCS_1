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

        //Donald's cat
        Cat buddy = new Cat();
        buddy.age = 17;
        buddy.name = "Buddy";
        buddy.petType = "cat";
        buddy.eatsDryFood = true;


        //Donald's pet wolf
        Wolf rexsivl = new Wolf();
        rexsivl.age = 10;
        rexsivl.name = "Rexsivl";
        rexsivl.petType = "wolf";
        rexsivl.eatsDryFood = false;

        //Paxton's cat
        Cat magnum = new Cat();
        magnum.age = 5;
        magnum.name = "Magnum";
        magnum.petType = "cat";
        magnum.eatsDryFood = true;

        //Paxton's rock
        Rock rocky = new Rock();
        rocky.age = 7;
        rocky.name = "Rocky";
        rocky.petType = "rock";
        rocky.eatsDryFood = false;

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

        // A dog named Callie
         // Eric wrote this:
        Dog Callie = new Dog();
        Callie.age = 2;
        Callie.name = "Callie";
        Callie.petType = "dog";
        Callie.eatsDryFood = true;

        // Val's cat named Salem
        Cat Salem = new Cat();
        Salem.age = 5;
        Salem.name = "Salem";
        Salem.petType = "cat";
        Salem.eatsDryFood = false;
        //Val's Sloth named Sleepy
        Slothy Slothy = new Slothy();
        Slothy.name = "Sleepy";
        Slothy.age = 10;
        Slothy.petType = "sloth";
        Slothy.eatsDryFood = true;




        // Tell the pets to say hi.
        System.out.println("SAY HI PETS!");
        bowser.sayHi();
        tully.sayHi();
        ralph.sayHi();
        George.sayHi();
        magnum.sayHi();
        rocky.sayHi();
        Iggy.sayHi();
        Callie.sayHi();
        buddy.sayHi();
        rexsivl.sayHi();
        Salem.sayHi();
        Slothy.sayHi();
        System.out.println();

        // Tell the pets to describe themselves.
        System.out.println("NOW DESCRIBE YOURSELVES:");
        bowser.describe();
        System.out.println();
        tully.describe();
        System.out.println();
        ralph.describe();
        System.out.println();
        buddy.describe();
        System.out.println();
        magnum.describe();
        System.out.println();
        rocky.describe();
        System.out.println();
        rexsivl.describe();
        System.out.println();
        Iggy.describe();
        Callie.describe();
        System.out.println();
        Salem.describe();
        System.out.println();
        Slothy.describe();
        System.out.println();



        // Report cumulative data about pets.
        int totalPetsAge = bowser.getAge() + tully.getAge() + ralph.getAge() + George.getAge() + Iggy.getAge() + magnum.getAge() +rocky.getAge() + buddy.getAge() + rexsivl.getAge()+Salem.getAge()+Slothy.getAge();
        System.out.println("My pets have lived a total of " + totalPetsAge + " human years.");
    }
}