import java.util.PriorityQueue;

public class KthLargestInArray {
    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        Integer g = null;
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k)
                g = heap.poll();
            System.out.println(g);
        }

        return heap.poll();
    }

    public static void main(String[] args) {
        int result=findKthLargest(new int[]{3,2,1,5,6,4},2);
        System.out.println("Result "+result);
    }
}