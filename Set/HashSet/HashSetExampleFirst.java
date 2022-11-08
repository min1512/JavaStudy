package Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExampleFirst {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);
        set.remove(5);//숫자 5 제거.

        System.out.println(set);

        HashSet<String> set2 = new HashSet<String>();

        set2.add("a");
        set2.add("b");
        set2.add("a");
        set2.add("c");
        set2.add("d");
        set2.add("e");

        System.out.println(set2);
        set2.remove("d");//문자열 d 제거.

        System.out.println(set2);

        HashSet<String> set3 = new HashSet<String>();

        set3.add("a");
        set3.add("b");
        set3.add("a");
        set3.add("c");
        set3.add("d");
        set3.add("e");

        Iterator iter = set3.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("set3의 크기 : "+set3.size());
        System.out.println(set3);
        set3.clear();//전부 제거.

        System.out.println(set3);
    }
}
