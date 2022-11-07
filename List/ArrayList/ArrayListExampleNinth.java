package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleNinth {
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

        arrayListDump.addAll(arrayList);

        System.out.println("arrayListDump가 arrayList 값을 다 가지고 있는지 : "+arrayListDump.containsAll(arrayList));
    }

}