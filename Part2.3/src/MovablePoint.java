 class MovablePoint implements Movable {
    public int x ;
    public int y ;
    public int xSpeed ;
    public int ySpeed ;
    public String description ;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed , String description) {
        this.x = this.x;
        this.y = this.y;
        this.xSpeed = this.xSpeed;
        this.ySpeed = this.ySpeed;
        this.description = this.description;
    }

     public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
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
