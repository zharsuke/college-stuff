package Bla2;

public class Square {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    public int calculateArea() {
        return side * side;
    }

    public int calculateCircumference() {
        return side * 4;
    }

    public void printSquare() {
        System.out.println("Side of square : " + side);
        System.out.println("Area of square : " + calculateArea());
        System.out.println("Circumference of square : " + calculateCircumference());
    }
}
