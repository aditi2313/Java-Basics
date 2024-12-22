enum Demographic {
    YOUNG,
    OLD
}

public class Person implements Playable {
    String name;
    int age;
    Demographic demo;
    Dog pet;
    static int peopleCount = 0;

    public Person(String name, int age, Demographic demo, Dog pet) {
        this.name = name;
        this.age = age;
        this.demo = demo;
        this.pet = pet;
        Person.peopleCount = Person.peopleCount + 1;
    }

    public Person(String name, int age, Demographic demo) {
        this.name = name;
        this.age = age;
        this.demo = demo;
        Person.peopleCount = Person.peopleCount + 1;
    }

    public static int getPeopleCount() {
        return Person.peopleCount;
    }

    public Dog getPet() {
        return this.pet;
    }

    // Not overriding because method signature must be equals(Object).
    public static boolean equals(Person p1, Person p2) {
        return (p1.name == p2.name) && (p1.age == p2.age) && (p1.demo == p2.demo);
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " years " + this.demo + ".";
    }

    @Override
    public String play() {
        return this.name + " is playing chess.";
    }
}
