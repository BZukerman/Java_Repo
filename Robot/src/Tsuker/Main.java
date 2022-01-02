/*
   Подготовка к решению задачи Robot
*/
package Tsuker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x_Src: ");
        int x_SRC = sc.nextInt();

        System.out.print("Enter y_Src: ");
        int y_Src = sc.nextInt();

        System.out.print("Enter dir_Src (UP, DOWN, LEFT, RIGHT): ");
        String dir_Src = sc.next();
        System.out.println("dir_Src: " + dir_Src);

        //Direction dir_Src = Direction.RIGHT;
        //if (dir_Src.equals("UP"))    {dir_Src = Direction.UP;}
        //if (dir_Src.equals("DOWN"))  {dir_Src = Direction.DOWN;}
        //if (dir_Src.equals("LEFT"))  {dir_Src = Direction.LEFT;}
        //if (dir_Src.equals("RIGHT")) {dir_Src = Direction.RIGHT;}

       // Robot robot = new Robot(x, y, d);

        System.out.print("Coordinate X to move robot: ");
        int toX = sc.nextInt();

        System.out.print("Coordinate Y to move robot: ");
        int toY = sc.nextInt();

        //Robot.moveRobot(robot, toX, toY);

        //System.out.println("\nFinal coordinates are: " + robot.getX() + ", " + robot.getY());
    }       // End of main

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }       // Rbd of enum
}           // End of class Main
