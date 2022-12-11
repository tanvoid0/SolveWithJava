package com.tanvoid0.java.data_structures;

import java.util.HashMap;
import java.util.List;

public class HashMapPlayground {
  public static void main(String[] args) {
    final HashMap<List<String>, Long> map = new HashMap<>();
    MyHashMap myMap = new MyHashMap();
    myMap.setValue(List.of("a", "b", "c"), 5L, map);
    map.put(List.of("a", "", "c"), 2L);
    map.put(List.of("a", "c", ""), 3L);

    System.out.println(map.containsKey(List.of("a", "b", "c")));
    System.out.println(map.get(List.of("a", "", "c")));
    System.out.println(myMap.getValue(List.of("a", "b", "c"), map));
  }

}

class MyHashMap {
  public Long getValue(List<String> keys, HashMap<List<String>, Long> map) {
    return map.get(keys);
  }

  public void setValue(List<String> keys, Long value, HashMap<List<String>, Long> map) {
    map.put(keys, value);
  }
}
