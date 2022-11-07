package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleEleventh {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();                
        
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.removeAll(arrayList);//전체 리스트 제거

        System.out.println(arrayList);
    }

}