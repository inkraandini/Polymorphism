/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author MOKLET-2
 */
public class main {
     public static void main(String[] args) {
        Line lineA = new Line(3, 8, 7, 7);
        Line lineB = new Line(1, 1, 8, 3);
        
       lineA.getLength();
       lineB.getLength();
       
        System.out.println("Length Line A : " + lineA.getLength() );
        System.out.println("Length Line B : " + lineB.getLength());
        System.out.println("\nLine A > Line B ----> " + lineA.isGreater(lineA, lineB) );
        System.out.println("Line A < Line B ----> " + lineA.isLess(lineA, lineB));
        System.out.println("Line A == Line B ----> " + lineA.isEqual(lineA, lineB));
        
        System.out.println("\nLine B > Line A ----> " + lineB.isGreater(lineB, lineA) );
        System.out.println("Line B < Line A ----> " + lineB.isLess(lineB, lineA));
        System.out.println("Line A == Line B ----> " + lineB.isEqual(lineB, lineA));
        
    }
}
