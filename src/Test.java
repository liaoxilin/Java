import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>0&&n<50000) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int sum = Sum(n, array);
            System.out.print(sum);
        }
    }
    public static int Sum(int n,int[] array){
        if (n==0){
            return 0;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int tem=count(array[i],array[j]);
                sum+=tem;
            }
        }
        return sum;
    }

    public static int count(int a,int b){
        return a|b;
    }
}
