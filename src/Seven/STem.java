package Seven;

public class STem extends Root{
    STem(){
        System.out.println("STem");
    }
    void dispose(){
        super.dispose();
        System.out.println("STem.dispose");
    }

    public static void main(String[] args) {
        STem t=new STem();
        t.dispose();
    }
}
