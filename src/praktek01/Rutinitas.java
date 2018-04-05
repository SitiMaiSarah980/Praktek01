/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ASUS
 */
public class Rutinitas {
    public static void main(String[] args) {
        Perawat Maisarah = new Perawat();
        Perawat Syarani = new Perawat();
        Perawat Fajar = new Perawat();
        
        Maisarah.NIP="001";
        Maisarah.nama="Siti Mai Sarah";
        Maisarah.tahunkerja="2005";
        Maisarah.tanggallahir="5 Mei 1995";
        Maisarah.alamat="Astambul";
        
        Syarani.NIP="010";
        Syarani.nama="Muhammad Syarani";
        Syarani.tahunkerja="2001";
        Syarani.tanggallahir="14 November 1993";
        Syarani.alamat="Banjarbaru";
        
        Fajar.NIP="101";
        Fajar.nama="Ahmad Fajar Rizqi";
        Fajar.tahunkerja="2018";
        Fajar.tanggallahir="8 September 1999";
        Fajar.alamat="Martapura";
        
        Maisarah.cetakInfo();
        
        Syarani.cetakInfo();
        
        Fajar.cetakInfo();
    }
}
