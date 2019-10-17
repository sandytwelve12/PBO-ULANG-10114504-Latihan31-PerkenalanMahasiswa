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
 * DESKRIPSI:Program Ini berisi class Perkenalan Mahasiswa
 */
public class Mahasiswa {
    public String Nim, Nama;

    public void setNIM(String Nim) {
        this.Nim = Nim;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }


    public void perkenalkanDiri() {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is "+Nim);
        System.out.println("My Name is "+Nama);
        System.out.println("");
    
}
