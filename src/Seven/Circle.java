package Seven;

public class Circle extends Shape{
    Circle(int i){
        super(i);
        System.out.println("Drawing ciecle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}