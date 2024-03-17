package lab2.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Радиус круга: " + circle.getRadius());
        System.out.println("Площадь круга: " + circle.squareFigure());
        System.out.println("Периметр круга: " + circle.perimeterFigure());
        System.out.println();
        Square square = new Square(4);
        System.out.println("Сторона квадрата: " + square.getSide());
        System.out.println("Площадь квадрата: " + square.squareFigure());
        System.out.println("Периметр квадрата: " + square.perimeterFigure());
        System.out.println();
        Triangle triangle = new Triangle(5,3,4);
        System.out.println("Сторона 1 треугольника: " + triangle.getSideTriangle1());
        System.out.println("Сторона 2 треугольника: " + triangle.getSideTriangle2());
        System.out.println("Сторона 3 треугольника: " + triangle.getSideTriangle3());
        System.out.println("Площадь треугольника: " + triangle.squareFigure());
        System.out.println("Периметр треугольника: " + triangle.perimeterFigure());
    }
}
