package com.test.stepic.robot;

import com.test.stepic.robot.Direction;

public class Robot {
    int x=0;
    int y=0;
    Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("robot.turnLeft()");
    }

    public void turnRight() {
        System.out.println("robot.turnRight()");
    }

    public void stepForward() {
        System.out.println("robot.stepForward()");
    }
}