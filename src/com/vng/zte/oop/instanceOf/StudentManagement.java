/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vng.zte.oop.instanceOf;

/**
 *
 * @author nhantt4
 */
public class StudentManagement {

    public static void main(String[] args) {

        Object obj = new Student(); //Lệnh gán sub class cho parent class. Vì 
                                    //mọi Class trong Java đều thừa kế từ Object.

        System.out.println(obj instanceof String);  //false
        System.out.println(obj instanceof Student); //true
        System.out.println(obj instanceof Object);  //true
        
        Student student = (Student) obj;
        student.study();
    }
}

