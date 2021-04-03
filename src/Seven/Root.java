package Seven;

public class Root {
    Component1 T1=new Component1();
    Component2 t2=new Component2();
    Component3 t3=new Component3();
    Root(){
        System.out.println("Root");
    }
    void dispose(){
        T1.dispose();
        t2.dispose();
        t3.dispose();
        System.out.println("r.dispose");
    }
}
