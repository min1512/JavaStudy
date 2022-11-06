package List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleSixth {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();        
        
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("indexOf(20) :" +arrayList.indexOf(20) );
        System.out.println("indexOf(4) :" +arrayList.indexOf(4) );
        System.out.println("lastIndexOf(4) :" +arrayList.lastIndexOf(4) );
        System.out.println("indexOf(1) :" +arrayList.indexOf(1) );
    }

}