public class Triangle  extends Shape {
    public double Base;
    public double Height;
    public Triangle(double Base, double Height){
        this.Base = Base;
        this.Height = Height;
    }
    @Override
    public double getArea()  {
        return (Base*Height)/2;
    }

    @Override
    public String toString() {
        return "This is a triangle!";
    }
}
