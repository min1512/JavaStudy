package List.LinkedList;

import java.util.LinkedList;

public class LinkedListExampleSeventh {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);        
        list.add(200);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        list.removeFirst();//첫번째 값 제거
        System.out.println(list);
        list.removeLast();//마지막 값 제거
        System.out.println(list);
    }
}
