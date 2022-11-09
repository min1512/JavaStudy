package Set.TreeSet;

import java.util.TreeSet;

public class TreeSetExampleSecond {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(6);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//중복 된거 한번더 넣음.
        set.add(4);
        set.add(5);

        set.remove(6);

        System.out.println(set);
    }
}
