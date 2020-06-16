abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (Math.abs(s - a)) * (Math.abs(s - b) * (Math.abs(s - c))));
    }
}

class Rectangle extends Shape {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return a * 2 + b * 2;
    }

    @Override
    double getArea() {
        return a * b;
    }
}

class Circle extends Shape {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return PI * (radius * 2);
    }

    @Override
    double getArea() {
        return PI * Math.pow(radius, 2.0);
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("Triangle");
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        System.out.println("Circle");
        Circle circle = new Circle(10);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}