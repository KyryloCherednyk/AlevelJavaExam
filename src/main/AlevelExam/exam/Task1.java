package exam;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<String> filterAndConvert(List<Integer> integers) {
        List<String> result = new ArrayList<>();
        for (Integer num : integers) {
            if (num > 100) {
                result.add(String.valueOf(num));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(120);
        numbers.add(80);
        numbers.add(150);
        numbers.add(200);

        List<String> filteredNumbers = filterAndConvert(numbers);
        System.out.println("Numbers greater than 100:");
        System.out.println(filteredNumbers);
    }
}