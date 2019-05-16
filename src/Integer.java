/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrin
 */
public class Integer {
    public static void main(String[] args){
       int[] arr1 = new int[3];
       arr1[0] = 23;
       arr1[1] = 12;
       arr1[2] = 10;
       int[] arr2 = arr1;
       arr2[0] = 16;

      int[] arr3 = arrMutator(arr1);
      arr3[0] = 1;
      for(int val : arr1) {
          System.out.println(val);
          
      }
    }
    public static int[] arrMutator(int[] arr) {
        int[] newArray = new int[array.lrngth];
        
    }
}
