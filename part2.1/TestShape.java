import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the shape you want to calculate the area of: ");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("Your choice: ");

        int choice = sc.nextInt();
        Shape shape = null;
        switch (choice) {
            case 1:
                System.out.println("Enter length: ");
                double length = sc.nextDouble();
                System.out.println("Enter width: ");
                double width = sc.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 2:
                System.out.println("Enter base: ");
                double base = sc.nextDouble();
                System.out.println("Enter height: ");
                double height = sc.nextDouble();
                shape = new Triangle(base, height);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        if(shape != null) {
            double area = shape.getArea();
            System.out.println("The area of the shape is: " + area);
            System.out.println(shape.toString());
        }
    }
}
