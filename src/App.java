import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        Dog d = new Dog("Spot", 1);
        System.out.println(d);
        Person p = new Person("Adam", 12, Demographic.YOUNG, d);
        System.out.println(p);
        System.out.println(Person.getPeopleCount());
        System.out.println(Dog.getDogCount());
        System.out.println(p.getPet());
        Person q = new Person("Bob", 20, Demographic.YOUNG);
        System.out.println(q);
        System.out.println(q.getPet());

        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(numbers.length);

        ArrayList<Integer> moreNumbers = new ArrayList<>();
        moreNumbers.add(10);
        moreNumbers.add(20);
        moreNumbers.add(30);
        moreNumbers.remove(1); // Removes the element at index 1 (20)
        System.out.println(moreNumbers);
        System.out.println(moreNumbers.size());

        // Streams
        // Arrays.stream() method returns IntStream when the array has primitives and
        // Stream<String> when it doesnt.
        IntStream stream = Arrays.stream(numbers).limit(5);
        // New variable so the same stream does not get operated upon twice.
        IntStream newStream = stream.map(x -> x * 2).filter(x -> x != 2);
        newStream.forEach(x -> System.out.println(x));
    }
}
