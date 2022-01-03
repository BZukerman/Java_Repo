/*
   Подготовка к решению задачи Robot
*/
package Tsuker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x_Src: ");
        int x_Src = sc.nextInt();

        System.out.print("Enter y_Src: ");
        int y_Src = sc.nextInt();

        System.out.print("Enter dir_Src (UP, DOWN, LEFT, RIGHT): ");
        String dir_Src = sc.next();
        System.out.println("dir_Src: " + dir_Src);

       // Robot robot = new Robot(x, y, d);

        System.out.print("Coordinate X to move robot: toX");
        int toX = sc.nextInt();

        System.out.print("Coordinate Y to move robot: toY: ");
        int toY = sc.nextInt();

        //Robot.moveRobot(robot, toX, toY);

        //System.out.println("\nFinal coordinates are: " + robot.getX() + ", " + robot.getY());

        int dx, dy;
        dx = toX - x_Src;
        dy = toY - y_Src;
        System.out.println("dx = " + dx);
        System.out.println("dy = " + dy);
    }       // End of main

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }       // Rbd of enum
}           // End of class Main
