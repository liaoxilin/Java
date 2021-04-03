package Seven;

public class Test2 extends Detergent{

    @Override
    public void scrub() {
        super.scrub();
        System.out.println("SDSA");
    }
    public void sterilize(){
        System.out.println("DFASFD");
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        t.scrub();
        t.sterilize();
    }
}
