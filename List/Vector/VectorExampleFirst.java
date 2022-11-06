package List.Vector;

import java.util.Vector;

public class VectorExampleFirst {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();    
        vector.add("Data0");
        vector.add("Data1");
        vector.add("Data2");
        vector.add("Data3");
        vector.add(3,"AddData3");//3번 위치에 데이터 추가        

        for(String str: vector)
        {
            System.out.println(str);
        }
    }
    
}