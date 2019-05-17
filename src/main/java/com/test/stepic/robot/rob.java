package com.test.stepic.robot;

import java.io.IOException;
import java.io.InputStream;

public class rob {
    public static void main(String[] args) {
       // moveRobot(RobotConnection, 0, 3);

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int failsCount = 0;
        boolean canRetry = true;
        RobotConnection robotConnection = null;
        while (canRetry) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                canRetry = false;
            } catch (RobotConnectionException e) {
                failsCount++;
                canRetry = true;
                if (failsCount >= 3) {
                    throw new RobotConnectionException("Error occurred during connecting and moving robot", e);
                }
            } finally {
                if (robotConnection != null) {
                    robotConnection.close();
                    robotConnection = null;
                }
            }
        }
    }
}
