//public class TappingRainWater {
//    public int trap(int[] height) {
//        int left_max = 0;
//        int right_max = 0;
//        int left = 0;
//        int res = 0;
//        int right = height.length - 1;
//        while (left < right) {
//            if (height[left] < height[right]) {
//                (height[left] >= left_max) ? (left_max = height[left]) : res += (left_max - height[left]);
//                left = +1;
//            } else {
//                (height[right] >= right_max) ? (right_max = height[right]) : res += (right_max - height[right]);
//                right += 1;
//            }
//        }
//        return res;
//        [0,1,0,2,1,0,1,3,2,1,2,1]
//    }
//}
