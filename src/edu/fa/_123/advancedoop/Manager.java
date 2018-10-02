/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fa._123.advancedoop;

/**
 *
 * @author nhantt4
 */
public class Manager {
    public static int numberOfProjects = 10;
    
    public static void addProjects() {
        ++numberOfProjects;
        System.out.println("New number of Project : " + numberOfProjects);
    }
    
    public static void main(String[] args) {
        System.out.println(Manager.numberOfProjects);
        Manager.addProjects();
        
        Manager projectManager = new Manager();
        Manager accountManager = new Manager();
        
       
        
    }
}
