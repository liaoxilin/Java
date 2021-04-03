package Seven;

public class TTest8 extends Test8{
    TTest8(int i){
        super(3);
        System.out.println("2");
    }
    TTest8(){
        super(3);
        System.out.println("3");
    }

    public static void main(String[] args) {
        TTest8 t=new TTest8(5);
    }
}
