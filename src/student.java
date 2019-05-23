/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrin
 */
public class student {
    private static int numOfStudents = 0;
    private final String id;
    private final String name;
    private int grade;
    private int String parents;
    public satic String getParents() {
        return parents;
    }
    
    student(String id, String name, int grade){
        this.id = id;
        this.grade = grade;
        this.name = name;
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    
}
