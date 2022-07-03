public class Rectangle extends Figuras{
    @Override
    public void area() {
        area = 2.0 * width  + 2.0 * tall;
    }

    @Override
    public void perimeter() {
        perimeter = width * tall;
    }
}
