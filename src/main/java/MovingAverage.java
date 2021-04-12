import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {
    private Queue<Integer> queue;
    private int sum;
    private int size;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size=size;
        this.sum=0;
        this.queue=new LinkedList();
    }
    
    public double next(int val) {
        if(queue.size()==size){
            sum=sum-queue.poll();
        }
        queue.add(val);
        sum+=val;
        return sum*1.0/queue.size();
    }
}
