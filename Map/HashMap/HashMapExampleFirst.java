package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleFirst {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"바나나");
        map.put(2,"사과");
        map.put(3,"포도");

        map.remove(3);

        System.out.println(map);
        System.out.println(map.get(1));

        //entrySet 활용
        for( Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
        }

        //KeySet() 활용
        for( Integer i : map.keySet())
        {
            System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
        }
    }
}
