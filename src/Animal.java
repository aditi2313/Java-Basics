public abstract class Animal implements Playable {
    String name;
    int age;
    Person owner;

    public Animal(String name, int age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Person getOwner() {
        return this.owner;
    }

    public boolean isOwner(Person person) {
        return Person.equals(owner, person);
    }

    public abstract String makeNoise();

    public abstract String toString();

}