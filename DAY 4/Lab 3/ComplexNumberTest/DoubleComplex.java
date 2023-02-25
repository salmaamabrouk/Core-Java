/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumbertest;

import java.util.concurrent.atomic.DoubleAdder;

/**
 *
 * @author salmamabrouk
 */
public class DoubleComplex implements Complex<Double> {

    public Double real;
    public Double imaginary;

    public DoubleComplex(Double r, Double i) {
        real = r;
        imaginary = i;
    }

    DoubleComplex(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setComplex(Double r, Double i) {
        real = r;
        imaginary = i;
    }

    @Override
    public Double getReal() {
        return real;
    }

    @Override
    public Double getImaginary() {
        return imaginary;
    }

    @Override
    public Complex<Double> add(Complex<Double> c) {
        Double real = this.real + c.getReal();
        Double imaginary = this.imaginary + c.getImaginary();
        Complex<Double> temp = new DoubleComplex(real, imaginary);
        return temp;
    }

    @Override
    public Complex<Double> sub(Complex<Double> c) {
        Double real = this.real - c.getReal();
        Double imaginary = this.imaginary - c.getImaginary();
        Complex<Double> temp = new DoubleComplex(real, imaginary);
        return temp;
    }

    @Override
    public Complex<Double> mul(Complex<Double> c) {
        Double real = this.real * c.getReal();
        Double imaginary = this.imaginary * c.getImaginary();
        Complex<Double> temp = new DoubleComplex(real, imaginary);
        return temp;
    }

    @Override
    public Complex<Double> div(Complex<Double> c) {
        Double real = this.real / c.getReal();
        Double imaginary = this.imaginary / c.getImaginary();

        Complex<Double> temp = new DoubleComplex(real, imaginary);
        return temp;
    }

    public void prinComplex() {

        if (this.getImaginary() > 0) {
            System.out.println(this.getReal() + "+" + this.getImaginary() + "i");
        } else if (this.getImaginary() < 0) {
            System.out.println(this.getReal() + "-" + this.getImaginary() + "i");
        }
    }
}
