import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movable movable = null;
        System.out.println("Enter X: ");
        int x = (int) sc.nextDouble();
        System.out.println("Enter Y: ");
        int y = (int) sc.nextDouble();
        movable = new MovablePoint(x , y);
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

    }
}