 class MovablePoint implements Movable {
    public int x ;
    public int y ;
    public MovablePoint(int x, int y) {
        this.x = x ;
        this.y = y ;
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
}
