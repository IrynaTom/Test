package com.test.stepic;

public class getCaller {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
      //  System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
       // System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
       anotherMethod();

    }
    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length < 4) {
            return null;
        }
        else {
            StackTraceElement element = stackTraceElements[3];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            return className + "#" + methodName;
        }
    }
}
