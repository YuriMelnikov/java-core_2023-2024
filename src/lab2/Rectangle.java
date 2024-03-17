package lab2;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return length;
    }
    public void setLength(int width){
        this.length = length;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(){
        this.width = width;
    }

    public int squareRectangle(){
        int square = length * width;
        return square;
    }
    public int perimeterRectangle(){
        int perimeter = length + width + length + width;
        return perimeter;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 4);

        System.out.println("Длина прямоугольника: " + rectangle.getLength());
        System.out.println("Ширина прямоугольника: " + rectangle.getWidth());
        System.out.println("Площадь прямоугольника: " + rectangle.squareRectangle());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeterRectangle());
    }
}
