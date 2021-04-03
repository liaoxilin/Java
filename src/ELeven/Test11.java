package ELeven;

import java.util.*;

public class Test11 {
    public static void travel(Collection tem){
        Iterator<Collection> A=tem.iterator();
        while(A.hasNext()){
            Collection a=A.next();
            System.out.println(a);
        }
    }
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    public static void main(String[] args) {
        travel(fill(new ArrayList<String>()));
        travel(fill(new LinkedList<String >()));
        travel(fill(new HashSet<String>()));
        travel(fill(new TreeSet<String>()));

    }
}
