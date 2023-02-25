/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salmamabrouk
 */
public class MyClass2 {

    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();

        try {
            myClass1.method1();
            myClass1.method2();
            myClass1.method3();
        } catch (MyException e) {
            System.out.println("Exception caught: ");
        }
    }
}
