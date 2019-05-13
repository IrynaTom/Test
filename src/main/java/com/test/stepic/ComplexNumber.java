package com.test.stepic;

public final class ComplexNumber {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println( a.hashCode()==b.hashCode());





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

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ComplexNumber other = (ComplexNumber) obj;
        if (re != other.im)
            return false;
        if (im != other.re)
            return false;
        return true;
    }

    public int  hashCode(){
         int res;
         res = Double.hashCode(re);
         res = Double.hashCode(im);
         return res;
    }
}
