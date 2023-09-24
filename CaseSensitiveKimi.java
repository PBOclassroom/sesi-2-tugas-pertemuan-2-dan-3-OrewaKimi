/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kimi9
 */
public class CaseSensitiveKimi {
    public static void main(String[] args) {
     // Deklarasi variabel dengan nama 'angka' dan 'Angka' (berbeda hanya dalam huruf besar).
     int angka = 6;
      int Angka = 12;
       // Menampilkan nilai dari variabel 'angka' dan 'Angka'.
        System.out.println("Nilai variabel 'angka': " + angka);
        System.out.println("Nilai variabel 'Angka': " + Angka);
        // Ini akan menghasilkan kesalahan karena Java bersifat case sensitive.
        // 'angka' dan 'Angka' dianggap berbeda, jadi 'nilai' tidak ditemukan.
        // System.out.println("Nilai variabel 'nilai': " + nilai);
    }
}
