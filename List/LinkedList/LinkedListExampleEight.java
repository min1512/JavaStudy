package List.LinkedList;

import java.util.LinkedList;

public class LinkedListExampleEight {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);        
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(8);
        list.add(9);

        System.out.println(list);
        list.removeFirstOccurrence(1);//첫번째 값 제거        
        System.out.println(list);
        list.removeLastOccurrence(1);//마지막 값 제거        
        System.out.println(list);
    }
}

