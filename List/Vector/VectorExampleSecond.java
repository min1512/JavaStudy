package List.Vector;

import java.util.Vector;

public class VectorExampleSecond {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();    
        vector.add("Data0");
        vector.add("Data1");
        vector.add("Data2");
        vector.add("Data3");
        vector.remove(2);//2번 위치 데이터 삭제

        for(String str: vector)
        {
            System.out.println(str);
        }
    }
    
}