public class Circle extends Figuras {
    public Circle(){}

    public Circle(double tall, double width) {
        super(tall, width);
        this.tall = width;
    }

    @Override
    public void perimeter() {
        perimeter = Math.PI * tall;
    }

    @Override
    public void area() {
        area = Math.PI * Math.pow((tall/2), 2);
    }
}
