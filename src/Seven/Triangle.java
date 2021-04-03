package Seven;

public class Triangle extends Shape{
    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("Erasing Triangle");
    }
}
