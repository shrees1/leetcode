import java.util.ArrayList;
import java.util.List;

class Candy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> candyList= new ArrayList<>();
        int maxNumber=Integer.MIN_VALUE;
        for(int i=0; i<candies.length;i++){
        if(candies[i]>maxNumber){
            maxNumber=candies[i];
        }
        }
        for(int i=0; i<candies.length;i++){
            if(candies[i]+extraCandies>=maxNumber)
                candyList.add(true);
        }
        return candyList;
    }
}