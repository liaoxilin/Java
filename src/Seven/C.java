package Seven;

public class C extends A{
    B b=new B(4);

    C(int i){
        super(3);
        System.out.println("c");
    }

    public static void main(String[] args) {
        C test=new C(3);
    }
}
