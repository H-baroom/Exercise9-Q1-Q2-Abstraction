//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(100 , 15 , 40 , 3);
        System.out.println(movablePoint1.getX());
        System.out.println(movablePoint1.getY());
        System.out.println(movablePoint1.getxSpeed());
        System.out.println(movablePoint1.getySpeed());
        System.out.println("**********************************Up*******************************");
        movablePoint1.moveUp();
        System.out.println(movablePoint1.getX());
        System.out.println(movablePoint1.getY());
        System.out.println(movablePoint1.getxSpeed());
        System.out.println(movablePoint1.getySpeed());
        System.out.println("*********************************Right******************************");
        movablePoint1.moveRight();
        System.out.println(movablePoint1.getX());
        System.out.println(movablePoint1.getY());
        System.out.println(movablePoint1.getxSpeed());
        System.out.println(movablePoint1.getySpeed());
        System.out.println("*********************************Left*****************************");
        movablePoint1.moveLeft();
        System.out.println(movablePoint1.getX());
        System.out.println(movablePoint1.getY());
        System.out.println(movablePoint1.getxSpeed());
        System.out.println(movablePoint1.getySpeed());
        System.out.println("*********************************Down*****************************");
        movablePoint1.moveDown();
        System.out.println(movablePoint1.getX());
        System.out.println(movablePoint1.getY());
        System.out.println(movablePoint1.getxSpeed());
        System.out.println(movablePoint1.getySpeed());
        System.out.println("*********************************Set*****************************");
        MovablePoint movablePoint2 = new MovablePoint();
        movablePoint2.setX(500);
        movablePoint2.setxSpeed(20);
        movablePoint2.setY(500);
        movablePoint2.setySpeed(50);
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
        System.out.println(movablePoint2.getxSpeed());
        System.out.println(movablePoint2.getySpeed());
        System.out.println("**********************************Up*******************************");
        movablePoint2.moveUp();
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
        System.out.println(movablePoint2.getxSpeed());
        System.out.println(movablePoint2.getySpeed());
        System.out.println("*********************************Right******************************");
        movablePoint2.moveRight();
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
        System.out.println(movablePoint2.getxSpeed());
        System.out.println(movablePoint2.getySpeed());
        System.out.println("*********************************Left*****************************");
        movablePoint2.moveLeft();
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
        System.out.println(movablePoint2.getxSpeed());
        System.out.println(movablePoint2.getySpeed());
        System.out.println("*********************************Down*****************************");
        movablePoint2.moveDown();
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
        System.out.println(movablePoint2.getxSpeed());
        System.out.println(movablePoint2.getySpeed());
    }
}