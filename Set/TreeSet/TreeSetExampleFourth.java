package Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleFourth {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(6);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//중복 된거 한번더 넣음.
        set.add(4);
        set.add(5);

        System.out.println(set.first());//최소 값 출력
        System.out.println(set.last());//최대 값 출력
        System.out.println(set.higher(4));// 4보다 큰 값
        System.out.println(set.higher(6));// 6보다 큰 값
        System.out.println(set.lower(4));// 4보다 작은 값
        System.out.println(set.lower(1));// 1보다 작은 값

        Iterator iter = set.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }

    }
}
