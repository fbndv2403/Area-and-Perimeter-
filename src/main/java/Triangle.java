public class Triangle extends Figuras{

    @Override
    public void perimeter() {
        perimeter = tall + width + Math.sqrt(Math.pow(tall, 2)) + Math.sqrt(Math.pow(width, 2));
    }
    @Override
    public void area(){
        area = (tall * width)/2;
    }
}
