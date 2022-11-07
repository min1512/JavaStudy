package List.LinkedList;

import java.util.LinkedList;

public class LinkedListExampleSecond {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.removeFirst();//제일 앞에 있는 데이터 삭제.
        list.removeLast();//제일 뒤에 있는 데이터 삭제.

        for(int i: list)
        {
            System.out.println("데이터 출력 : "+i);
        }
    }
}
