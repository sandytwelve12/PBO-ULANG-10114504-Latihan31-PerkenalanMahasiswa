/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan31.perkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI:Program Ini berisi Perkenalan Mahasiswa
 */
public class PBOULANG10114504Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNIM("10116584");
        mahasiswa1.setNama("Sandy Akbar");
        mahasiswa1.perkenalkanDiri();
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNIM("10116581");
        mahasiswa2.setNama("Andri Febrian");
        mahasiswa2.perkenalkanDiri();
   
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.setNIM("10116732");
        mahasiswa3.setNama("Bervin Leonardy");
        mahasiswa3.perkenalkanDiri();
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa3.setNIM("10116742");
        mahasiswa3.setNama("Rahardian");
        mahasiswa3.perkenalkanDiri();
    }
    
}
