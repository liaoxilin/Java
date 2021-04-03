package Sixteen;

import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.nio.cs.Surrogate;

import java.util.Arrays;
import java.util.Random;

public class CompType implements Comparable<CompType>{
    int i;
    int j;
    private static int count=1;
    public CompType(int n1,int n2){
        i=n1;
        j=n2;
    }
    public String toString(){
        String result="[i= "+i+", j = "+j+"]";
        if(count++%3==0){
            result+="/n";
        }
        return result;
    }

    @Override
    public int compareTo(CompType compType) {
        return (i<compType.i?-1:(i==compType.i?0:1));
    }

    public static void main(String[] args) {
        CompType[] a={new CompType(58,55), new CompType(93,61),new CompType(61,29)
    };;
    System.out.println(Arrays.toString(a));
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));

    }
}
