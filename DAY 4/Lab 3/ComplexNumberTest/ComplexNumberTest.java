/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumbertest;

/**
 *
 * @author salmamabrouk
 */
public class ComplexNumberTest {

    public static void main(String[] args) {
        DoubleComplex x = new DoubleComplex(100d, 150d);
        DoubleComplex y = new DoubleComplex(200d, 250d);
        Complex<Double> r = new DoubleComplex(300d, 350d);
        
        System.out.println("Addition=> " + r.getReal() + "+ i " + r.getImaginary());
        r = x.sub(y);
        System.out.println("Subtraction: " + r.getReal() + "+ i " + r.getImaginary());
        r = x.mul(y);
        System.out.println("Multiplication: " + r.getReal() + "+ i " + r.getImaginary());
        r = x.div(y);
        System.out.println("Division: " + r.getReal() + "+ i " + r.getImaginary());
    }
}
