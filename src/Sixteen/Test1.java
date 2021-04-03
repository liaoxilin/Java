package Sixteen;

public class Test1 {
    static void print(BerylliumSphere[] tem){
        System.out.println(tem.length);
    }

    public static void main(String[] args) {
        print(new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()});
    }
}
