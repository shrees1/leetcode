import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphRepresentation {

  public void createGraph(List<Character> gList) {
    Set<Character> random = new HashSet<>();
    Map<Character, Set<Character>> hmap = new HashMap<>();
    for (Character ch : gList) {
      if (ch.equals('A')) {
        random.add('B');
        random.add('C');
        hmap.put(ch, random);
      }
      if (ch.equals('B')) {
        random.add('A');
        random.add('C');
        random.add('D');
        hmap.put(ch, random);
      }
      if (ch.equals('D')) {
        random.add('B');
        random.add('E');
        hmap.put(ch, random);
      }
    }
  }

  public Collection<Set<Character>> returnList(Map<Character, Set<Character>> characterSetMap) {
    return characterSetMap.values();
  }

  public int shortestPath(Map<Character, Set<Character>> characterSetMap, char start, char dest) {
    int count = 0;

    Set<Character> set = characterSetMap.get(start);//2,5
    count++;
    while (true) {
      Set<Character> child=new HashSet<>();
      for (Character s : set) {
        Set<Character> set1 = characterSetMap.get(s);
        child.addAll(set1);///(3),(6)
        }
      if(child.contains(dest))
        break;
      else {
        set = child;
        count++;
      }
    }
    return count;
  }
}
