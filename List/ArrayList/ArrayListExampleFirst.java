package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleFirst {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        
        arrayList.add(2,1000); //인덱스 2에 1000추가
        
        for(int i : arrayList)
        {
            System.out.println("리스트 값 : "+i);
        }
    }

}