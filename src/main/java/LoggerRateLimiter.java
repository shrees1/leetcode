import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LoggerRateLimiter {

  Queue refQ;
  Map<String, Integer> hmap;

  public LoggerRateLimiter() {
    refQ = new LinkedList();
    hmap = new HashMap<>();
  }

  public boolean shouldPrintMessage(int timestamp, String message) {
    if(!hmap.containsKey(message)) {
      hmap.put(message, timestamp);
      refQ.add(hmap);
    }
    int time=hmap.get(message);
    //if()
    return true;
  }
}
