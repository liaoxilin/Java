package ELeven;

import java.util.*;

public class ListFearures {
    public static void main(String[] args) {
        Random rand=new Random(7);
        List<Integer> a= Arrays.asList(2,1,3,4,5,6,7);
        System.out.println("1:"+a);
        //a.add(8);
        System.out.println("2:"+a);
        System.out.println("3:"+a.contains(8));
        //a.remove(8);
        System.out.println("4:"+a);
        int x=7;
        System.out.println("5:"+a.indexOf(x));
        System.out.println("6:"+a.remove(x));
        Collections.sort(a);
        System.out.println(a);
    }
}
