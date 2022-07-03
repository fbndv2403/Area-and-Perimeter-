public class Polygon extends  Figuras{

    @Override
    public void area() {
        area = totalSides * width;
    }

    @Override
    public void perimeter() {
        perimeter = (area * tall)/2;
    }
}
