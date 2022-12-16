import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class myclass {
    public static void main(String[] args) {
        first();
//        second();
    }
   
    public static void first() {
        ArrayList<User> users = new ArrayList<>(Arrays.asList(
                new User(1, "firstName1", "lastName1", 7, "USA"),
                new User(2, "firstName2", "lastName2", 8, "Russia"),
                new User(3, "firstName0", "lastName0", 9, "Germany"),
                new User(4, "firstName3", "lastName3", 4, "Russia")
        ));

        Stream<User> stream1 = users.stream();
        Stream<User> stream2 = users.stream();
        Stream<User> stream3 = users.stream();
        Stream<User> stream4 = users.stream();
        Stream<User> stream5 = users.stream();

        stream1.sorted(Comparator.comparing(user -> user.lastName)).forEach(System.out::println);
        System.out.println();
        stream2.sorted(Comparator.comparing(user -> user.age)).forEach(System.out::println);
        System.out.println(stream3.allMatch((user) -> user.age > 7));
        System.out.println(stream4.mapToInt((user) -> user.age).average().getAsDouble());
        System.out.println(stream5.map((user) -> user.country).collect(Collectors.toSet()).size());
    }

    public static int forSort(Map.Entry<String, Long> entry1, Map.Entry<String, Long> entry2) {
        if (entry1.getValue().compareTo(entry2.getValue()) == 0)
            return entry1.getKey().compareTo(entry2.getKey());
        return entry2.getValue().compareTo(entry1.getValue());
    }

    public static void second() {
        Scanner scan = new Scanner(System.in);
        String[] strings = scan.nextLine().toLowerCase().split("[^0-9a-zа-я]");
        Stream<String> stream = Arrays.stream(strings).filter((str) -> str.length() > 0);
        System.out.println(Arrays.toString(stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().
                sorted(myclass::forSort).map(Map.Entry::getKey).limit(10).toArray()));
    }
}
