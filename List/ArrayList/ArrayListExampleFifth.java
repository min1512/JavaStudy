package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleFifth {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();        
        
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("리스트 특정값 구하기 :" +arrayList.get(3));
    }

}