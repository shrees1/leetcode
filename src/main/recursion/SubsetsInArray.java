import java.util.HashSet;
import java.util.Set;

public class SubsetsInArray {
    static int[] subset = new int[3];

    public static void printCombination(int[] input, int index, Set<Integer> subset) {
        if (index == input.length) {
            System.out.println(subset);
        }
        if ((index + 1) <= input.length) {
            subset.add(input[index]);
//            System.out.println(subset[count]);
            printCombination(input, index + 1, subset);
            subset.remove(input[index]);
        }
        if ((index + 1) <= input.length) {
            printCombination(input, index + 1, subset);
        }
    }

    public static void main(String[] args) {
        printCombination(new int[]{2, 3, 4}, 0, new HashSet<>());
    }
}
