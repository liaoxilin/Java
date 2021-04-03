package Ten;

public class Outer {
    private String str;
     Outer(){
        str="dfa";
    }
     class Inner{
        public String toString(){
            return str;
        }

    }

    public Inner a(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer T=new Outer();
        Inner n=T.a();
        System.out.println(n.toString());
    }
}
