package lab2.Shape;

public class Square extends Shape {
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public double squareFigure(){
        double square = side * side;
        return square;
    }
    @Override
    public double perimeterFigure(){
        double perimeter = side + side + side + side;
        return perimeter;
    }
}
