import java.util.Stack;

public class MinStack {

  Stack<Integer> chotaStack = new Stack<Integer>();
  int currMin=Integer.MAX_VALUE;

  public MinStack() {

  }

  public void push(int x) {
    chotaStack.push(x);
    if(currMin>x){
      currMin=x;
    }
  }

  public void pop() {
  int ref=chotaStack.peek();
    chotaStack.pop();

  }

  public int top() {
    return chotaStack.peek();
  }

  public int getMin() {
return currMin;
  }
}
