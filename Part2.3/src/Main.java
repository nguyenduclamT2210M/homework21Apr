import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Movable movable = null;
        System.out.println("Select the shape you want to calculate the area of: ");
        System.out.println("1. Movable Point");
        System.out.println("2. Movable Circle");
        System.out.println("Your choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter x: ");
                int x = sc.nextInt();
                System.out.println("Enter y: ");
                int y = sc.nextInt();
                System.out.println("Enter x speed: ");
                int xSpeed = sc.nextInt();
                System.out.println("Enter y speed: ");
                int ySpeed = sc.nextInt();
                movable = new MovablePoint(x , y, xSpeed,ySpeed);
                if( x < 0){
                    movable.moveDown();

                }
                if(x > 0){
                    movable.moveUp();
                }
                if(y < 0){
                    movable.moveLeft();
                }
                if(y > 0){
                    movable.moveRight();
                }
                ((MovablePoint) movable).description();
                System.out.print("xSpeed: "+xSpeed +" "+"ySpeed: "+ySpeed);
                break;
            case 2:
                System.out.println("Enter x: ");
                int x1 = sc.nextInt();
                System.out.println("Enter y: ");
                int y1= sc.nextInt();
                System.out.println("Enter x speed: ");
                int xSpeed1 = sc.nextInt();
                System.out.println("Enter y speed: ");
                int ySpeed1 = sc.nextInt();
                System.out.println("Enter radius: ");
                int radius = sc.nextInt();
                movable = new MovableCircle(x1  , y1, xSpeed1,ySpeed1,radius);
                if( x1 < 0){
                    movable.moveDown();

                }
                if(x1 > 0){
                    movable.moveUp();
                }
                if(y1 < 0){
                    movable.moveLeft();
                }
                if(y1 > 0){
                    movable.moveRight();
                }
                ((MovableCircle) movable).description() ;
                System.out.print("xSpeed: "+xSpeed1 +" "+"ySpeed: "+ySpeed1+" "+"radius: "+radius);
                break;
            case 3:
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

    }
}