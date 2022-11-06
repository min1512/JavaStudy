package List.Vector;

import java.util.Vector;

public class VectorExampleThird {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();    
        vector.add("Data0");
        vector.add("Data1");
        vector.add("Data2");
        vector.add("Data3");        

        System.out.println("특정 값 가져 오기 : "+vector.get(1));
    }
    
}