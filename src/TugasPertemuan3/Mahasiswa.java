/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan3;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
   String nama;
   int nim;
   String jurusan;
    
   public Mahasiswa(String nama, int nim, String jurusan) {
       this.nama = nama;
       this.nim = nim;
       this.jurusan = jurusan;
   }
    
   public void setNama(String nama) {
       this.nama = nama;
   }
    
   public void setNim(int nim) {
       this.nim = nim;
   }
    
   public void setJurusan(String jurusan) {
       this.jurusan = jurusan;
   }
    
   public String getNama() {
       return this.nama;
   }
    
   public int getNim() {
       return this.nim;
   }
    
   public String getJurusan() {
       return this.jurusan;
   }
    
   public static void main(String[] args) {
       Mahasiswa mhs = new Mahasiswa("John Doe", 123456, "Informatika");
       System.out.println("Nama: " + mhs.getNama());
       System.out.println("NIM: " + mhs.getNim());
       System.out.println("Jurusan: " + mhs.getJurusan());
        
       mhs.setNama("Jane Doe");
       mhs.setNim(654321);
       mhs.setJurusan("Sistem Informasi");
       System.out.println("Nama: " + mhs.getNama());
       System.out.println("NIM: " + mhs.getNim());
       System.out.println("Jurusan: " + mhs.getJurusan());
   }
}
