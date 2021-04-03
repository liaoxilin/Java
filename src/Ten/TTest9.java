package Ten;

public class TTest9 {


    public Test9 bbb(){
        return new Test9() {
            @Override
            public void aaa() {

            }
        };

    }

    public static void main(String[] args) {
        TTest9 b=new TTest9();
        Test9 t=b.bbb();
        t.aaa();
    }


}
