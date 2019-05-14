package com.test.stepic.robot;

public class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
      RobotConnection connection= new RobotConnection() {
          @Override
          public void moveRobotTo(int x, int y) {
          }

          @Override
          public void close() {
          }
      };
    }
}
