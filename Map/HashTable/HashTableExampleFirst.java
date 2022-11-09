package Map.HashTable;

import java.util.Hashtable;

public class HashTableExampleFirst {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        ht.put(0,"철수");
        ht.put(1,"영희");
        ht.put(2,"영수");
        System.out.println("데이터 변경 전");
        for (int i=0; i<ht.size(); i++)
        {
            System.out.println(ht.get(i));
        }
        ht.replace(2,"수철");
        System.out.println("데이터 변경 후");
        for (int i=0; i<ht.size(); i++)
        {
            System.out.println(ht.get(i));
        }
    }
}
