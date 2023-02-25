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
public interface Complex<T> {

    public T getReal();

    public T getImaginary();

    public Complex<T> add(Complex<T> c);

    public Complex<T> sub(Complex<T> c);

    public Complex<T> mul(Complex<T> c);

    public Complex<T> div(Complex<T> c);

    public void prinComplex();
}
