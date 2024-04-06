package map;

import java.util.HashMap;

public class HashMapTest1 {
   public static void main(String[] args) {

      HashMap<String, Integer> map = new HashMap<>();
      System.out.println(map.toString());

      // 추가 put(key, value)
      map.put("A", 1);
      map.put("B", 2);
      map.put("C", 3);
      map.put("D", 4);
      System.out.println(map);

      System.out.println(map.put("A", 5));
      System.out.println(map.put("A", 5));
      System.out.println(map.put("E", 10));
      // 맵에 E키에 연관된 값이 없다면 null, 있다면 해당 value로 반환
      System.out.println(map);

      System.out.println(map.get("B"));
      System.out.println(map.size());
      System.out.println(map.keySet());
      System.out.println(map.values());

   }
}
