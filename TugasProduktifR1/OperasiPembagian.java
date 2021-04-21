/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProduktifR1;

/**
 *
 * @author MOKLET-2
 */
public class OperasiPembagian extends OperasiBilanganAbs {
    @Override     
    public void set_A(double a) {
        super.a = a;
    }

    @Override
    public double get_A() {
        return a;
    }
    
    @Override
    public void set_B(double b) {
        super.b = b;
    }

    @Override
    public double get_B() {
        return b;
    } 

    @Override
    protected void set_C() {
        super.c = super.a /super.b;
    }

    @Override
    public double get_C() {
        return c;
    }
    
    @Override
    protected void tampil(){
        System.out.println(a + " / " + b + " = " +(a / b));
    }

}
