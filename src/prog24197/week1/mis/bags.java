/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24197.week1.mis;
public class bags {
    private String brand = "gucci";
private String material = "leather";
private int length = 10 ;
private int width = 12;
private int height = 16;
 

public String getBrand(){
    return brand;
   
}
public double getVolume(){
    double volume = length*width*height*Math.PI;
    return volume;
}

    
}
