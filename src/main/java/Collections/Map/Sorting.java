package Collections.Map;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.sortByKeys();
        sorting.sortByValues();
    }

    private void sortByKeys() {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting:");
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println("" + entry.getKey() + entry.getValue());
        }
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
        System.out.println("After Sorting:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("" + entry.getKey() + entry.getValue());
        }
    }

    private void sortByValues() {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting:");
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println("" + entry.getKey() + entry.getValue());
        }
        Map<Integer, String> map = sortingByValues(hmap);
        System.out.println("After Sorting:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("" + entry.getKey() + entry.getValue());
        }
    }


    private static HashMap<Integer, String> sortingByValues(HashMap<Integer, String> map) {
        List<String> list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry<Integer, String>) (o1)).getValue())
                        .compareTo(((Map.Entry<Integer, String>) (o2)).getValue());
            }
        });
        HashMap<Integer, String> sortedHashMap = new LinkedHashMap<Integer, String>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

}