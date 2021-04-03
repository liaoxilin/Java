package Nine;

public class T_est3 extends Test3{
    private int i=3;
    public void print(){
        System.out.println("t_est3  "+i);
    }
    public T_est3(){
        print();
    }

    public static void main(String[] args) {
        T_est3 t=new T_est3();
        t.print();
    }
}
