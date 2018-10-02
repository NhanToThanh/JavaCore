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
public class Overload {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        student.study("Math");
        
        student.move();
        student.move("Vietnam");
    }
}
