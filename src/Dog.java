public class Dog extends Animal {
    static int dogCount = 0;

    public Dog(String name, int age) {
        super(name, age, null);
        Dog.dogCount = Dog.dogCount + 1;
    }

    public Dog(String name, int age, Person owner) {
        super(name, age, owner);
        Dog.dogCount = Dog.dogCount + 1;
    }

    public static int getDogCount() {
        return Dog.dogCount;
    }

    @Override
    public String makeNoise() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return "Dog's name is " + this.name + ". It is " + this.age + " years old.";
    }

    @Override
    public String play() {
        return this.name + " is playing fetch.";
    }
}