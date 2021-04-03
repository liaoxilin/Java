package ELeven;

import javax.jws.soap.SOAPMessageHandlers;
import java.util.*;

public class Test4 {
    static String next(int i){
        if(i==1)
            return "Snow White";
        else
            return "Star Wars";
    }

    public static void main(String[] args) {
        String[] a=new String[3];
        ArrayList<String> b=new ArrayList<>();
        LinkedList<String> c=new LinkedList<>();
        HashSet<String> d=new HashSet<>();
        LinkedHashSet<String> e=new LinkedHashSet<>();
        TreeSet<String> f=new TreeSet<>();
        for(int i=0;i<3;i++){
            a[i]=next(i);
        }
        for(int i=0;i<3;i++){
            b.add(next(i));
        }
        for(int i=0;i<3;i++){
            c.add(next(i));
        }
        for(int i=0;i<3;i++){
            d.add(next(i));
        }
        for(int i=0;i<3;i++){
            e.add(next(i));
        }
        for(int i=0;i<3;i++){
            f.add(next(i));
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
