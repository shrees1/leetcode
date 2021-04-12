import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingRanges {

  public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> missList= new ArrayList<>();
    if(nums.length==0){
      return missList;
    }
    if(nums[0]!=lower){
      missList.add(String.valueOf(nums[0]-lower-1));
    }
    for(int i=1;i<nums.length-1;i++){
      String a=String.valueOf(nums[i]+1);
      String b=String.valueOf(nums[i+1]-1);
      if(a.equals(b)){
        missList.add(a);
      }
      else{
        missList.add(a+"->"+b);
      }
    }
    if(nums[nums.length-1]!=upper){
      missList.add(nums[nums.length-1]+1+"->"+upper);
    }
    return missList;
  }


  public static void main(String[] args) {
    List<String> result = findMissingRanges(new int[]{0}, 0, 99);
    System.out.println(result);
  }
}