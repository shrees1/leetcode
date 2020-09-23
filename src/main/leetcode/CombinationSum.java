import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> candList = new ArrayList<>();
        getCombination(candidates, new ArrayList<>(), candList, target, 0);
        return candList;
    }

    public static void getCombination(int[] candidates, List<Integer> trackedCandidate, List<List<Integer>> candidateList, int target, int i) {
        if (target == 0) {
            candidateList.add(new ArrayList<>(trackedCandidate));
        } else if (target < 0 || i > candidates.length - 1)
            return;
        else if (target > 0) {
            trackedCandidate.add(candidates[i]);
            getCombination(candidates, trackedCandidate, candidateList, target - candidates[i], i);
            trackedCandidate.remove(trackedCandidate.size() - 1);
            if (i < candidates.length - 1) {
                getCombination(candidates, trackedCandidate, candidateList, target, i + 1);

            }

        }
    }

    public static void main(String[] args) {
        List<List<Integer>> sumList = new ArrayList<>();
        getCombination(new int[]{2, 3, 5}, new ArrayList<>(), sumList, 8, 0);
        System.out.println(sumList);
    }
}
