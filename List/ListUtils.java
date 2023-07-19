import java.util.*;

public class ListUtils {
    
    public static int countEvenNumbers(List<Integer> numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    public static Map<Integer, String> mapNames(List<String> names) {
        Map<Integer, String> resultMap = new HashMap<>();
        int serialNumber = 1;
        for (String name : names) {
            resultMap.put(serialNumber, name);
            serialNumber++;
        }
        return resultMap;
    }
    
    public static boolean isAscending(List<Integer> numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < numbers.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static List<String> sortNames(List<String> names) {
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        return sortedNames;
    }
    
    public static List<Integer> getUniqueNumbers(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        return new ArrayList<>(uniqueNumbers);
    }
    
   

}
