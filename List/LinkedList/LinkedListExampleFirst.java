package List.LinkedList;

import java.util.LinkedList;

public class LinkedListExampleFirst {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.offer(10);//add 와 동일한 기능이다.
        list.addFirst(100);
        list.add(2);
        list.addLast(200);
        list.add(3);

        for(int i: list)
        {
            System.out.println("데이터 출력 : "+i);
        }
    }
}
