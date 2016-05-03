package job;

import java.util.*;

public class WorkWithCollection {

    public List getSorted() {
        List<Integer> sorted = new LinkedList<Integer>();
        sorted.add(3);
        sorted.add(1);
        sorted.add(2);
        return sorted;
    }

    public List getSortedArrayList() {
        List<Integer> sorted = new ArrayList<>();
        sorted.add(3);
        sorted.add(1);
        sorted.add(2);
        return sorted;
    }

    public Set<Integer> getSortedSet() {
        Set<Integer> sorted = new HashSet<>();
        sorted.add(3);
        sorted.add(1);
        sorted.add(2);
        return sorted;
    }

    public Set<Integer> getSortedLinkedHashSet() {
        Set<Integer> sorted = new LinkedHashSet<>();
        sorted.add(3);
        sorted.add(1);
        sorted.add(2);
        return sorted;
    }

    public Map<Integer, Integer> getSortedMap() {
        Map<Integer, Integer> sorted = new HashMap<Integer, Integer>();
        sorted.put(1, 3);
        sorted.put(1, 1);
        sorted.put(1, 2);

        sorted.put(2, 1);
        sorted.put(2, 2);
        sorted.put(2, 3);

        return sorted;
    }

    public Map<Integer, Integer> getSortedLinkedHashMap() {
        Map<Integer, Integer> sorted = new LinkedHashMap<>();
        sorted.put(1, 3);
        sorted.put(1, 1);
        sorted.put(1, 2);

        sorted.put(2, 1);
        sorted.put(2, 2);
        sorted.put(2, 3);

        return sorted;
    }

}
