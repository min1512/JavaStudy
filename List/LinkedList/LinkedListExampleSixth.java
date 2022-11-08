package List.LinkedList;

import java.util.LinkedList;

public class LinkedListExampleSixth {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);        
        list.add(200);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("LinkedList에 데이터 추출 : "+list.poll());//첫번째 요소 값 추출
        System.out.println(list);
        System.out.println("LinkedList에 데이터 추출 : "+list.pollFirst());//첫번째 요소 값 추출
        System.out.println(list);
        System.out.println("LinkedList에 데이터 추출 : "+list.pop());//첫번째 요소 값 추출   
        System.out.println(list);
        System.out.println("LinkedList에 데이터 추출 : "+list.pollLast());//마지막 요소 값 추출   
        System.out.println(list);
    }
}
