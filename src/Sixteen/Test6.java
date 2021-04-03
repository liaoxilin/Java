package Sixteen;

import java.util.Arrays;

public class Test6 {
    static BerylliumSphere[][] test(int a,int b){
        BerylliumSphere[][] result=new BerylliumSphere[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                result[i][j]=new BerylliumSphere();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(test(3,6)));
    }
}
