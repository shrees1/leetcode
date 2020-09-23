public class SortColors {
    public static void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                red++;
            }
            if (nums[i] == 1) {
                white++;
            }
            if (nums[i] == 2) {
                blue++;
            }
        }
        while(red>0){
            nums[j++]=0;
            red--;
        }
        while(white>0){
            nums[j++]=1;
            white--;
        }
        while(blue>0){
            nums[j++]=2;
            blue--;
        }
    }

    public static void main(String[] args) {
        int []pk=new int[]{2,0,2,1,1,0};
        sortColors(pk);
        for(int i=0;i<pk.length;i++)
        System.out.print(pk[i]);
    }
}

