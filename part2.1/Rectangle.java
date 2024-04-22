public class Rectangle extends Shape {
    public double length ;
    public double Width ;
    public Rectangle(double length, double Width) {
        this.length = length;
        this.Width = Width;
    } ;
    @Override
    public double getArea()  {
        return length * Width;
    }

    @Override
    public String toString() {
        return "This is a rectangle!";
    }
}
