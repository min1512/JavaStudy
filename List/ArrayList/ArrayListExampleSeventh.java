package List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExampleSeventh {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();        
        
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.add(2,1000);//2번 인덱스에 1000추가.

        for(int i : arrayList)
        {
            System.out.println("리스트 값 : "+i);
        }

        System.out.println("\niterator로 값 출력\n");

        Iterator iterator = arrayList.iterator();//iterator 선언

        while(iterator.hasNext()){//다음값 체크
            System.out.println("리스트 값 : "+iterator.next());//값 출력
        }
    }

}