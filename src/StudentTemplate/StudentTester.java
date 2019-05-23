/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentTemplate;

/**
 *
 * @author amrin
 */
public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("ammy");
        System.out.println(s1.getName());
         Student s2 = new Student();
        s2.setName("joban");
        System.out.println(s2.getName());
        Student s3 = new Student();
        s3.setName("jas");
        System.out.println(s3.getName());
        
        Student[] list = new Student[3];
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        for(int i = 0; i<list.length;i++) {
            System.out.println(list[i].getName());
            
        }
        
    }
}
