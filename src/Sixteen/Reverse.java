package Sixteen;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        CompType[] a={new CompType(58,55), new CompType(93,61),new CompType(61,29)
        };
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
