/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan20_targetsaldotabungan;

/**
 *
 * @author  
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk menghitung pada bulan
 *                     ke berapa saldo target terpenuhi dari saldo awal
 */
public class PBO3_10117098_Latihan20_TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int saldoAwal;
        int bunga; // persen bunga
        int jumlahBunga; 
        int saldoTarget;

        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;

        i=1; 
        while (saldoAwal <= saldoTarget) {
            jumlahBunga = saldoAwal*bunga/100;
            saldoAwal += jumlahBunga;
            
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(","
                    + "", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    }
    
}
