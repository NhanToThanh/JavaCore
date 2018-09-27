/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vng.zte.dsa.arraylist;

import java.util.*;

/**
 *
 * @author nhantt4
 */
public class ListStudent {

    public static void main(String[] args) {

        //ArrayList<Integer> listNumber = new ArrayList<Integer>();
        //ArrayList<String> list = new ArrayList<String>();
        Student studentOne = new Student(1, "Nhan");
        Student studentTwo = new Student(2, "Minh");
        Student studentThree = new Student(3, "Thanh");

        ArrayList<Student> listStudent = new ArrayList<Student>();

        listStudent.add(studentOne);
        listStudent.add(studentTwo);
        listStudent.add(studentThree);

        System.out.println("Do dai listStudent : " + listStudent.size());

        System.out.println("=============================================");

        //for(int i=0; i < listStudent.size(); i++)
        //     System.out.println("Student " + i + ": " + listStudent.get(i).getName());
        for (Student student : listStudent) {
            System.out.println(student.getId() + " : " + student.getName());
        }

        System.out.println("=============================================");

        //remove vi tri
        listStudent.remove(2);

        System.out.println("----------------------------------------");
        for (Student student : listStudent) {
            System.out.println(student.getId() + " : " + student.getName());
        }
        System.out.println("---------------------------------------");

        //Xoa het toan bo phan tu
        listStudent.clear();

    }
}
