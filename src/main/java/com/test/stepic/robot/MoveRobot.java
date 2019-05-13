package com.test.stepic.robot;

public class MoveRobot {

    public static void main(String[] args) {
      //  moveRobot(new Robot(), 3, 0);
        moveRobot(new Robot(), -2, 0);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        int deltaX=toX-robot.getX();
        int deltaY=toY- robot.getY();

        switch (robot.getDirection()){
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
        }
        if (deltaX > 0) {
            robot.turnRight();
            for (int i = 0; i < deltaX; i++) {
                robot.stepForward();
            }
            if (deltaY > 0) {
                robot.turnLeft();
                for (int i = 0; i < deltaY; i++) {
                    robot.stepForward();
                }
            } else if (deltaY < 0) {
                robot.turnRight();
                for (int i = 0; i < -deltaY; i++) {
                    robot.stepForward();
                }
            }
        } else if (deltaX < 0) {
            robot.turnLeft();
            for (int i = 0; i < -deltaX; i++) {
                robot.stepForward();
            }
            if (deltaY > 0) {
                robot.turnRight();
                for (int i = 0; i < deltaY; i++) {
                    robot.stepForward();
                }
            } else if (deltaY < 0) {
                robot.turnLeft();
                for (int i = 0; i < -deltaY; i++) {
                    robot.stepForward();
                }
            }
        } else {
            if (deltaY > 0) {
                for (int i = 0; i < deltaY; i++) {
                    robot.stepForward();
                }
            } else if (deltaY < 0) {
                robot.turnRight();
                robot.turnRight();
                for (int i = 0; i < -deltaY; i++) {
                    robot.stepForward();
                }
            }
        }
    }
}