package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleSecond {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        //첫번째 리스트
        arrayList.add(1);
        arrayList.add(2);

        //두번째 리스트
        arrayList2.add(10);
        arrayList2.add(20);
        
        //첫번째 리스트에 두번째 리스트의 모든 데이터를 추가 하기.
        arrayList.addAll(arrayList2);
        
        for(int i : arrayList)
        {
            System.out.println("리스트 값 : "+i);
        }
    }

}