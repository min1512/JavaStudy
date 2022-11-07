package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleTwelfth {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();                        
        
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        ArrayList<Integer> arrayListDump = (ArrayList<Integer>) arrayList.clone();

        arrayListDump.add(60);
        arrayListDump.add(70);

        System.out.println(arrayListDump);
    }

}