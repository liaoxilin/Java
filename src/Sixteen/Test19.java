package Sixteen;

import java.util.Arrays;

public class Test19 {
    int num;
    Test19(int i){
        num=i;
    }
    static boolean equals(Object[] a,Object[] b){
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i].equals(b[i])){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Test19[] num1={new Test19(1),new Test19(2),new Test19(3)};
        Test19[] num2={new Test19(1),new Test19(2),new Test19(3)};
        System.out.println(equals(num1,num2));
    }
}
