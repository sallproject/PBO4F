/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan2;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nama = "Muhammad Faisal";
        mhs.npm = 2110010467;
        mhs.kelas = "4F Reguler Malam Banjarmasin";
        
        System.out.println("Nama  : " + mhs.nama);
        System.out.println("NPM   : " + mhs.npm);
        System.out.println("Kelas : " + mhs.kelas);
        
    }
    
}
