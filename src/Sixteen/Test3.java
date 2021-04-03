package Sixteen;

import java.util.Arrays;
import java.util.Random;

public class Test3 {
    static double[][] doublecount(double a,double b,int n){
        double[][] result=new double[n][n];
        for(int i=0;i<n;i++){
           // double[] t=new double[n];
            for(int j=0;j<n;j++){
                result[i][j]=a+Math.random()*(b-a);
            }
        }
        return result;
    }

    static void print(double a,double b,int n){
        System.out.println(Arrays.deepToString(doublecount(a,b,n)));
    }

    public static void main(String[] args) {
        print(1.0,7.0,5);
    }
}
