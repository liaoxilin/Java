package ELeven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Gerbil {
    int gerbilNumber;
    public Gerbil(int i){
        gerbilNumber=i;
    }
    void hop(){
        System.out.println(gerbilNumber);
    }

    public static void main(String[] args) {
//        ArrayList<Gerbil> tem=new ArrayList<>();
//        for(int i=0;i<5;i++) {
//            tem.add(new Gerbil(i));
//        }
//        Iterator<Gerbil> it=tem.iterator();
//        while (it.hasNext()){
//            Gerbil a=it.next();
//            a.hop();

        Map<String,Gerbil> map=new HashMap<>();
        map.put("Fuzzy",new Gerbil(1));
        map.put("Spot",new Gerbil(2));
        Iterator<String> it=map.keySet().iterator();
        while(it.hasNext()){
            String tem=it.next();
            map.get(tem).hop();

        }

    }
}
