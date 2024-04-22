public class MovableCircle extends MovablePoint {
    public int x;
    public int y;
    public int radius;
    public int xSpeed;
    public int ySpeed;
    public String description ;
    public MovableCircle(int x, int y, int radius , int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.description = description;
    }
    public void moveUp(){
        System.out.println("Moving up");
    }
    public void moveDown(){
        System.out.println("Moving down");
    }
    public void moveLeft(){
        System.out.println("Moving left");
    }
    public void moveRight(){
        System.out.println("Moving right");
    }
    public void description(){
        System.out.println("Spin Speed: ");
    }
}
