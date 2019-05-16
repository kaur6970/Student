/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24197.week1.geometry;

/**
 *
 * @author amrin
 */
public class performOperation {
    public static void main(String[] args) {
        circle obj1 = new circle();
        circle obj2 = new circle(12.0);
        System.out.println(obj1.getArea());
        System.out.println(obj2.getArea());
    }
}
