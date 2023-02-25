/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salmamabrouk
 */
public class Test {
public static void Test (List<? extends Shape> shapes){
for (Shape shape : shapes) {
            shape.draw();
        }
    }
    public static void main(String[] args) {
    List<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        List<Circle> circles = new ArrayList<Circle>();
        circles.add(new Circle());
        circles.add(new Circle());

        Test(rectangles);
        Test(circles);
    }
}
