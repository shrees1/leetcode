public class MaxConsecutive1SlidingWindow {
    public static int longestOnes(int[] A, int K) {
            int i = 0, j = 0, backup = 0;
            while (i <A.length&&j<A.length-1) {
                if (K >0||A[j]==1) {
                    if (A[j] == 0) {
                        K--;
                        j++;
                    } else {
                        j++;
                    }
                } else {
                    if (A[i] == 0) {
                        K += 1;
                        i++;
                    } else {
                        i++;
                    }
                }
                backup = Math.max((j - i), backup);
            }

                return backup;
            }

        public static void main (String[]args){
            int result = longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
            System.out.println(result);
        }
    }
