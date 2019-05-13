package com.test.stepic;

public final class ComplexNumber {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        a.equals(b);

      a.hashCode();
       b.hashCode();




    }
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;

    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public boolean equals(){
return true;
    }

    public int  hashCode(){
        int result;

        return result;
    }
}
