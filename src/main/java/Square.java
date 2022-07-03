public class Square extends Figuras{

    public Square() {
        this.tall = width;
    }
    @Override
    public void area() {
        area = 2.0 * tall + 2.0 * tall;
    }

    @Override
    public void perimeter() {
        perimeter = Math.pow(tall, 2);
    }
}
