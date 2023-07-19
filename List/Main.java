import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 1, 3, 5, 2, 4, 6);
        System.out.println("Number of even numbers: " + ListUtils.countEvenNumbers(numbers));

        List<String> names = Arrays.asList("Karine", "Alina", "Lilit");
        Map<Integer, String> mappedNames = ListUtils.mapNames(names);
        System.out.println("Mapped names: " + mappedNames);

        System.out.println("Numbers in ascending order: " + ListUtils.isAscending(numbers));

        List<String> sortedNames = ListUtils.sortNames(names);
        System.out.println("Sorted names: " + sortedNames);

        List<Integer> uniqueNumbers = ListUtils.getUniqueNumbers(numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
