package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleTenth {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();        
        ArrayList<Integer> arrayListDump = new ArrayList<Integer>();        
        
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayListDump.add(6);
        arrayListDump.add(7);

        arrayListDump.addAll(arrayList);//arrayListDump에 arrayList 값 넣기.
        //arrayList.retainAll(arrayListDump);//arrayList에서, arrayListDump와 공통 요소 들만 남기고 나머지는 제거 합니다.
        arrayListDump.retainAll(arrayList);//arrayListDump에서, arrayList와 공통 요소 들만 남기고 나머지는 제거 합니다.

        for (int i : arrayListDump)
        {
            System.out.println("리스트 값 : "+i);
        }
    }

}