import java.util.*;

public class appPerimetros {
    public static void main(String args[]) {
        String finalTest = "y";
        Scanner sc = typingIn();
        do {
            menu();
            System.out.println("Dou you want continue with another figura?\ny = yes\nn = no");
            finalTest = sc.next();
        } while (finalTest == "n");
    }

    public static void menu() {
        Scanner sc = typingIn();
        System.out.println("Please select the figure you want to know the area and it is perimeter");
        System.out.println("1: Circle\n2: Square\n3: Triangle\n4: Rectangle\n5: Polygons");
        System.out.print("\nYour select -> ");
        try {
            int option = Integer.parseInt(sc.next());
            figuras(option, sc);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("----------------");
            System.out.println("Your typed an error option.\nPlease enter again.\nRemember you must type a number");
            menu();
        }
    }

    public static void figuras(int option, Scanner sc) {
        Figuras figura;
        double radius, side, tall, width;
        int sides;
        switch (option) {
            case 1:
                figura = new Circle();
                System.out.println("Please type the radius of the circle");
                radius = Double.parseDouble(sc.next());
                figura.setTall(radius);
                figura.perimeter();
                figura.area();
                showDetails(figura.getPerimeter(), figura.getArea());
                break;

            case 2:
                figura = new Square();
                System.out.println("Please type the value of the side");
                side = Double.parseDouble(sc.next());
                figura.setTall(side);
                figura.area();
                figura.perimeter();
                showDetails(figura.getPerimeter(), figura.getArea());
                break;

            case 3:
                figura = new Triangle();
                System.out.println("Please type the value of the tall");
                tall = Double.parseDouble(sc.next());
                System.out.println("Please type the value of the width");
                width = Double.parseDouble(sc.next());
                figura.setTall(tall);
                figura.setWidth(width);
                figura.area();
                figura.perimeter();
                showDetails(figura.getPerimeter(), figura.getArea());
                break;

            case 4:
                figura = new Rectangle();
                System.out.println("Please type the value of the tall");
                tall = Double.parseDouble(sc.next());
                System.out.println("Please type the value of the width");
                width = Double.parseDouble(sc.next());
                figura.setTall(tall);
                figura.setWidth(width);
                figura.area();
                figura.perimeter();
                showDetails(figura.getPerimeter(), figura.getArea());
                break;

            case 5:
                figura = new Polygon();
                System.out.println("Please type of the numbers total of the sides");
                sides = Integer.parseInt(sc.next());
                System.out.println("Please type the value of the tall");
                tall = Double.parseDouble(sc.next());
                System.out.println("Please type the value of the width");
                width = Double.parseDouble(sc.next());
                figura.setTall(tall);
                figura.setWidth(width);
                figura.setTotalSides(sides);
                figura.area();
                figura.perimeter();
                showDetails(figura.getPerimeter(), figura.getArea());

        }
    }

    public static void showDetails(Double perimeter, Double area) {
        System.out.println("The Perimeter is " + perimeter);
        System.out.println("The Area is " + area);
    }

    public static Scanner typingIn () {
        Scanner scaneer = new Scanner(System.in);
        return scaneer;
    }
}

