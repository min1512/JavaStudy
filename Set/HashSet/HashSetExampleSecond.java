package Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExampleSecond {
    public static void main(String[] args) {
        HashSet<String> set2 = new HashSet<String>();

        set2.add("a");
        set2.add("b");
        set2.add("a");
        set2.add("c");
        set2.add("d");
        set2.add("e");
        
        System.out.println(set2);
        System.out.println("c 문자열을 가지고 있는가 ?"+set2.contains("c"));
    }
}
