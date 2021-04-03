package Five;

public class Test8 {

    public static void main(String[] args) {
        Test8 t=new Test8();
        t.T1();
    }
    void T1(){
        T2();
        this.T2();
    }
    void T2(){
        System.out.println("123");
    }
}
