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
public final class OperasiBilanganAbsCetak {
    private final void cetak(OperasiBilanganAbs[] ob, double a, double b) {
        for(int i = 0; i < ob.length; i++){
            ob[i].get_A();
            ob[i].get_B();
            ob[i].get_C();
            ob[i].tampil();
            System.out.println("########################################");
       }
        ob = null;
    }
        public static void main(String[] args){
            OperasiBilanganAbsCetak opBil = new OperasiBilanganAbsCetak();
            OperasiPenjumlahan opPenjumlahan = new OperasiPenjumlahan();
            OperasiPengurangan opPengurangan = new OperasiPengurangan();
            OperasiPerkalian opPerkalian = new OperasiPerkalian();
            OperasiPembagian opPembagian = new OperasiPembagian();
            
            opPenjumlahan.set_A(10.5);
            opPenjumlahan.set_B(4.5);
            opPengurangan.set_A(10.5);
            opPengurangan.set_B(4.5);
            opPerkalian.set_A(10.5);
            opPerkalian.set_B(4.5);
            opPembagian.set_A(10.5);
            opPembagian.set_B(4.5);
            
            //operasi penjumlahan
            System.out.println("========== OPERASI PENJUMLAHAN ==========");
            System.out.println("A : " + opPenjumlahan.get_A());
            System.out.println("B : " + opPenjumlahan.get_B());
            opPenjumlahan.tampil();
            System.out.println(" ");
            
            //operasi pengurangan
            System.out.println("========== OPERASI PENGURANGAN ==========");
            System.out.println("A : " + opPengurangan.get_A());
            System.out.println("B : " + opPengurangan.get_B());
            opPengurangan.tampil();
            System.out.println(" ");
            
            System.out.println("========== OPERASI PERKALIAN ==========");
            System.out.println("A : " + opPerkalian.get_A());
            System.out.println("B : " + opPerkalian.get_B());
            opPerkalian.tampil();
            System.out.println(" ");
            
            System.out.println("========== OPERASI PEMBAGIAN ==========");
            System.out.println("A : " + opPembagian.get_A());
            System.out.println("B : " + opPembagian.get_B());
            opPembagian.tampil();
            System.out.println(" ");
}
        
}
