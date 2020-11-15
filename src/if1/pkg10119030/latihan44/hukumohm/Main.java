package if1.pkg10119030.latihan44.hukumohm;
/**
 * NAMA                 : Rendy Dermawan
 * KELAS                : IF1
 * NIM                  : 10119030
 * Deskripsi Program    : Program perhitungan hukum OHM menggunakan metode 
 * pendekatan berbasis objek.
 */
public class Main {

    public static void main(String[] args) {
        Baterai batt = new Baterai();
        Baterai batt1 = new Baterai(3,12);
        System.out.println("Kuat Arus : " + batt1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + batt1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + batt1.hitungTegangan() + " volt");
    }
    
}