//Paxton Wrote This

package org.sla;

class Rock {
    int age;
    String name;
    String petType;
    boolean eatsDryFood;

    void sayHi() {
        System.out.println("...");
    }

    int getAge() { return age*1000; }

    void describe() {
        System.out.println("This is my pet " + petType + " named " + name + ".");
        System.out.println("It's " + age*0.001 + " rock years old.");
        if (eatsDryFood) {
            System.out.println("It doesn't eat");
        } else {
            System.out.println("It doesn't eat");
        }
    }
}