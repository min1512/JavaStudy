package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleEight {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();        
        
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.clear();//배열 비우기.        

        for(int i : arrayList)
        {
            System.out.println("리스트 값 : "+i);
        }

        System.out.println("배열이 비었는지 :"+arrayList.isEmpty());
    }

}