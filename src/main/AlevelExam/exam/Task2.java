package exam;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 3};
        Map<Integer, Integer> elementFrequencyMap = getNonRepeatingElements(array);

        System.out.print(elementFrequencyMap.size() + " (числа ");

        for (Map.Entry<Integer, Integer> entry : elementFrequencyMap.entrySet()) {
            System.out.print(entry.getKey() + ", ");
        }

        System.out.print("\b\b)");
    }

    public static Map<Integer, Integer> getNonRepeatingElements(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> nonRepeatingElements = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                nonRepeatingElements.put(entry.getKey(), entry.getValue());
            }
        }

        return nonRepeatingElements;
    }
}