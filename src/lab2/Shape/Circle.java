package lab2.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(int radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double squareFigure(){
        double square = Math.PI * radius * radius;
        return square;
    }
    @Override
    public double perimeterFigure(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
