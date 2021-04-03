package Five;

public class Test21 {

    static void describe( Money money){
        switch (money){
            case One: System.out.println("这个1元");
                break;
            case Five:System.out.println("这个5元");
                break;
            case Ten:System.out.println("这个10元");
                break;
            case Twenty:System.out.println("这个20元");
                break;
            case Fifty:System.out.println("这个50元");
                break;
            case Hundred:System.out.println("这个100元");
                break;
            default:
        }
    }
    public static void main(String[] args) {
        for(Money s:Money.values()){

            System.out.println(s+", the ordinal "+s.ordinal());
            describe(s);
        }
    }
}
