public class CountPrimes {

  public static int countPrimes(int n) {
    int count = 0;
    for(int i = 2; i<n; i++){
      if(isPrime(i)){
        count++;
      }
    }
    return count;
  }

  private static boolean isPrime(int n) {
    int d = 2;
    int root = (int) Math.sqrt(n);
    while(d<=root){
      if(n%d==0){
        return false;
      }
      d++;
    }
    return true;
  }

  public static void main(String[] args) {
    int res = countPrimes(10);
    System.out.println(res);
  }
}

