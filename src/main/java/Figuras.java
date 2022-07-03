public abstract class Figuras {
    protected double tall, width, perimeter, area;
    protected int totalSides;
    public Figuras() {}
    public Figuras(double tall, double width) {
        this.tall = tall;
        this.width = width;
    }

    public abstract void area();
    public abstract void perimeter();

    public double getTall() { return tall; }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setTotalSides(int totalSides) {
        this.totalSides = totalSides;
    }
}
