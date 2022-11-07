package List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExampleFourth {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("해당 LinkedList의 사이즈 : "+list.size());//사이즈 출력
        System.out.println("해당 LinkedList의 3번째 값 출력 : "+list.get(3));//사이즈 출력

        //Iterator를 통한 순회
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
