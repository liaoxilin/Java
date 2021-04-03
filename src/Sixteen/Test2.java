package Sixteen;

public class Test2 {
    static BerylliumSphere[] test(int n){
        BerylliumSphere[] result=new BerylliumSphere[n];
        for(int i=0;i<n;i++){
            result[i]=new BerylliumSphere();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(test(10).length);
    }
}
