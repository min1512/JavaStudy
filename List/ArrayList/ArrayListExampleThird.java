package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleThird {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();        
        
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.add(2,1000);//인덱스 2에 1000추가 하기.
        
        for(int i : arrayList)
        {
            System.out.println("리스트 값 : "+i);
        }

        System.out.println("\n리스트 값 제거후\n");
        arrayList.remove(1);

        for(int i : arrayList)
        {
            System.out.println("리스트 값 : "+i);
        }
    }

}