
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class main {

    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Printer pri = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama Anda : ");
        pri.setNama(scn1.nextLine());
        System.out.print("Mau cetak nama berapa kali ?  : ");
        pri.setJumlahCetak(scn2.nextInt());
        pri.cetak("Nama Anda : " + pri.getNama());
        pri.cetak(pri.getJumlahCetak(), pri.getNama());

    }

}
