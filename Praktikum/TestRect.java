/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author MOKLET-2
 */
public class TestRect  {

    public static void main(String[] args) {
       Rect rect1 = new Rect (1,1,4,4);
       Rect rect2 = new Rect (2,3,5,6);
       
        System.out.println("2,3 is inside the union");
        System.out.println(rect1 + " union " + rect2 + " = " + rect1.union(rect2));
        System.out.println(rect1 + " intersection " + rect2 + " = " + rect1.intersection(rect2));
        
    }
    
}