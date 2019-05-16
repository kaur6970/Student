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
public class circle {
    private double radius = 1.0;
    private double area;
    
    public circle() {
    
}
    public circle(double newRad){
        radius = newRad;
        
    }
    public double getArea(){
        area = radius*radius*Math.PI;
        return area;
        
    }
    //public void getRadius() {
      //  this.radius();
    //}
