package lab2.Shapes;

public class Triangle implements Figure{
    private double sideTriangle1;
    private double sideTriangle2;
    private double sideTriangle3;

    public Triangle(double sideTriangle1, double sideTriangle2, double sideTriangle3){
        this.sideTriangle1 = sideTriangle1;
        this.sideTriangle2 = sideTriangle2;
        this.sideTriangle3 = sideTriangle3;
    }
     public double getSideTriangle1(){
        return sideTriangle1;
     }
     public void setSideTriangle1(double sideTriangle1){
        this.sideTriangle1 = sideTriangle1;
     }
    public double getSideTriangle2(){
        return sideTriangle2;
    }
    public void setSideTriangle2(double sideTriangle2){
        this.sideTriangle2 = sideTriangle2;
    }
    public double getSideTriangle3(){
        return sideTriangle3;
    }
    public void setSideTriangle3(double sideTriangle3){
        this.sideTriangle3 = sideTriangle3;
    }
    @Override
    public double squareFigure(){
        double p = (sideTriangle1 + sideTriangle2 + sideTriangle3) / 2;
        double square = Math.sqrt(p * (p - sideTriangle1) * (p - sideTriangle2) * (p - sideTriangle3));
        return square;
    }
    @Override
    public double perimeterFigure(){
        double perimeter = sideTriangle1 + sideTriangle2 + sideTriangle3;
        return perimeter;
    }
}
