import java.util.*;

public class Main {
    public static int[] removeDuplicates(int[] values) {
        // Use a HashSet to store unique values
        Set<Integer> uniqueSet = new HashSet<>();
        // Use ArrayList to maintain order
        ArrayList<Integer> resultList = new ArrayList<>();

        // Iterate through the array
        for (int value : values) {
            // Add value to HashSet, which automatically removes duplicates
            if (uniqueSet.add(value)) {
                // If value is added to HashSet (i.e., it's unique), add it to resultList
                resultList.add(value);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] values = {2, 4, 6, 2, 8, 10, 4, 12, 14, 6};
        int[] result = removeDuplicates(values);

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
