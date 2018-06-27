import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх.
 */
public class MoveRobot {
    public static void main(String[] args) {
    }

    private static void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        int stepX = currentX - toX; // сколько нужно шагов по Х то точки
        int stepY = currentY - toY; // сколько нужно шагов по Y то точки

        // ищем правильное направление по X и ходим
        if (stepX >= 0) { // нужно направление RIGHT
            do {
                robot.turnLeft();
            } while(robot.getDirection() != Direction.LEFT);
        } else {
            do {
                robot.turnLeft();
            } while(robot.getDirection() != Direction.RIGHT);
        }

        for (int i = 1; i <= Math.abs(stepX); i++) {
            robot.stepForward();
        }
        // ищем правельное направление по X и ходим
        if (stepY >= 0) { // нужно направление UP
            do {
                robot.turnLeft();
            } while(robot.getDirection() != Direction.DOWN);
        } else {
            do {
                robot.turnLeft();
            } while(robot.getDirection() != Direction.UP);
        }

        for (int i = 1; i <= Math.abs(stepY); i++) {
            robot.stepForward();
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public class Robot {
        public Direction getDirection() {
            // текущее направление взгляда
            return Direction.DOWN;
        }

        public int getX() {
            // текущая координата X
            return 0;
        }

        public int getY() {
            // текущая координата Y
            return 0;
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }
}