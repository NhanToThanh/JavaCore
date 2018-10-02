/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fa._123.advancedoop;

/**
 *
 * @author thanhnhan
 */
public class Student extends Person{

    public Student() {
        System.out.println("Creating a new Student");
    }
    
    public Student(String name) {
        System.out.println("Creating a new Student with name " + name);
    }
    
    public void study() {
        System.out.println("I am studying");
    }
    
    public void study(String subject) {
        System.out.println("I am studying " + subject);
    }

    //@Override
    public void move() {
        System.out.println("Move method from Person");
    }
    
    public void move(String location) {
        System.out.println("I am moving to " + location);
    }
    
}
