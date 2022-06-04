package kegiatan3_easy;
public class Main {
    public static void main(String args[]){
        double hasil;
        
//      lingkaran
        Lingkaran l = new Lingkaran(2);
        
//      luas lingkaran
        hasil = l.luas();
        System.out.println("Hasil luas Lingkaran " + hasil);
        
//      keliling lingkaran
        hasil = l.keliling();
        System.out.println("Hasil keliling Lingkaran " + hasil);
        
//      persegi
        Persegi p = new Persegi(3);
        
//      luas persegi
        hasil = p.luas();
        System.out.println("Hasil luas Persegi " + hasil);
        
//      keliling persegi
        hasil = p.keliling();
        System.out.println("Hasil keliling Persegi " + hasil);
        
//      tabung
        Tabung t = new Tabung(4,2);
        
//      volume tabung
        hasil = t.getVolume();
        System.out.println("Hasil volume Tabung " + hasil);
        
//      limas
        Limas lm = new Limas(5,3);
        
//      volume limas
        hasil = lm.getVolume();
        System.out.println("Hasil volume Tabung " + hasil);
    }
}