package Map.TreeMap;

import java.util.TreeMap;

public class TreeMapExampleFirst {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1,"사과");
        map.put(2,"복숭아");
        map.put(3,"포도");

        for(Integer i : map.keySet())
        {
            System.out.println("키 값 :"+i+" value 값:"+map.get(i));
        }
    }
}
