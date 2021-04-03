package Six;

public class Test8 {
    class A{
        private int i=10;
    }
    public A re(){
      A a=new A();
      return a;
    }

    public static void main(String[] args) {
        Test8 T=new Test8();
        A a=T.re();
        System.out.println(a.i);
    }
}
