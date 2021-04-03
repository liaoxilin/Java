package Six;

public class TeST7 {
    private int i;
    private void test(){
        System.out.println("test");
    }

    class A{
        void tt(){
            i=10;
            test();
        }
    }

    public void re(){
        A a=new A();
        a.tt();
    }

    public static void main(String[] args) {
        TeST7 t=new TeST7();
        t.re();
        System.out.println(t.i);
    }
}
