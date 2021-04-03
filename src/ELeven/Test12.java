package ELeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test12 {
    public static void main(String[] args) {
        List<Integer> tem=new ArrayList<>();
        tem= Arrays.asList(1,2,3,4,5);
        List<Integer> tem2=Arrays.asList(0,0,0,0,0);
        ListIterator<Integer> read=tem.listIterator();
        int i=1;
        while (read.hasNext()){
            int a=read.next();
            tem2.add(tem.size()-i,a );
            i++;
        }
        System.out.println(tem);
    }
}
