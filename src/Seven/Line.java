package Seven;

public class Line extends Shape{
    private int start,end;
    Line(int start,int end){
        super(start);
        this.start=start;
        this.end=end;
        System.out.println("Drawing Line:"+start+","+end);

    }
    @Override
    void dispose() {
        super.dispose();
        System.out.println("Erasing Line:"+start+","+end);
    }
}
