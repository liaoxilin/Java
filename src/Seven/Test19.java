package Seven;

public class Test19 {
    private final int i;
    Test19(){
        i=5;
        System.out.println(i);
    }
    Test19(int j){
        i=j;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test19 t=new Test19();
        //t.i++;
        Test19 X=new Test19(3);
    }
}
