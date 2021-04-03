package ELeven;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Test7> a=new ArrayList<>();
        for(int i=0;i<7;i++){
            a.add(new Test7());
        }
        List<Test7> T=new ArrayList<>();
        T=a.subList(1,4);
        a.remove(T);
    }
}
