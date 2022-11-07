package List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExampleFifth {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("LinkedList 숫자 2 포함 여부 : "+list.contains(2));//포함여부
        System.out.println("LinkedList 숫자 6 포함 여부 : "+list.contains(6));//포함여부

        System.out.println("LinkedList 숫자 2 저장되어 있는 위치 리턴 : "+list.indexOf(2));// 2가 있으면 1
        System.out.println("LinkedList 숫자 6 저장되어 있는 위치 리턴 : "+list.indexOf(6));// 6이 없으면 -1
    }
}
