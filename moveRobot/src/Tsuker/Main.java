package Tsuker;

Control system:

public static void moveRobot(Robot robot, int toX, int toY) {
    int i, x, y, dir, x0, y0, dx, dy;

    x0 = robot.getX();
    y0 = robot.getY();
    dir = robot.getDirection().ordinal();
                                // Поворот носом вверх из любого исходного направления
    if (dir == 0) {;}           // UP

    if (dir == 1)               // Down
        {for (i = 0; i < 2; i++) {robot.turnRight();}}

    if (dir == 2) {robot.turnRight();}      // LEFT

    if (dir == 3) {robot.turnLeft();}       // RIGHT

    dx = toX - x0;
    dy = toY - y0;

    if (dx == 0) {x = toX;}

    if (dx > 0) {               // Идем вправо
        robot.turnRight();
        for (i = 0; i < dx; i++) {x = x0 + i; robot.stepForward();}
        robot.turnLeft();       // Поворот против часовой стрелки
        //x = toX;
        }    // End for dx > 0

   if (dx < 0) {                // Идем влево
        robot.turnLeft();
        for (i = 0; i < Math.abs(dx); i++) {x = x0 - i; robot.stepForward();}
        robot.turnRight();      // Поворот по часовой стрелке
        //x = toX;
        }    // End for dx < 0

   if (dy == 0) {y = toY;}

   if (dy > 0) {                // Идем вверх
       for (i = 0; i < dy; i++) {y = y0 + i; robot.stepForward();}
       //y = toY;
       }    // End for dy > 0

   if (dy < 0) {                // Идем вниз
        for (i = 0; i < 2; i++) {robot.turnRight();}    // Поворот по часовой стрелке
        for (i = 0; i < Math.abs(dy); i++) {y = y0 - i; robot.stepForward();}
        //y = toY;
        }    // End for dy < 0

   return;
}    // End for moveRobot