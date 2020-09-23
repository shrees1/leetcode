public class NewSolution {

    static long Solve(long a, long b, long c){
        // Write your code here
        if(a<b)
            return -1;
        long d = c%a;
        long result= -1;
        if(d>b)
            result = c-d+b;
        else
            result = c -a -d+b;
        if(result>0)
            return result;
        else return -1;

    }
}
