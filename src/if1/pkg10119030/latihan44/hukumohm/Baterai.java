package if1.pkg10119030.latihan44.hukumohm;
/**
 * NAMA                 : Rendy Dermawan
 * KELAS                : IF1
 * NIM                  : 10119030
 * Deskripsi Program    : Program ini berisi class Baterai.
 */
public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println(
                "Kuat arus yang mengalir pada suatu kawan penghantar\n"
                + "akan berbanding lurus dengan beda potensial\n"
                + "pada ujung-ujung kawat penghantar tersebut\n"
                + "asalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus() {
        return kuatArus;
    }
    
    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
    
}

