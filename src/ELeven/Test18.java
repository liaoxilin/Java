package ELeven;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Test18 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<5;i++){
            map.put(i,i+2);
        }
        LinkedHashMap<Integer,Integer> map2=new LinkedHashMap<>();
        System.out.println(map);
        Iterator <Integer> it=map.keySet().iterator();
        while(it.hasNext()){
            int a=it.next();
            map2.put(a,map.get(a));
        }
        System.out.println(map2);
    }
}
