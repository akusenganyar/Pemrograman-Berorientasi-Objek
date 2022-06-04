package kegiatan1;

public class Main {
    public static void main(String args[]){
        double hasil;
        
        Kerucut kerucut = new Kerucut(15,100);
        
        hasil = kerucut.getVolume();
        System.out.println("volume dari kerucut kelas ini adalah : "+hasil);
        hasil = kerucut.getLuasPermukaan();
        System.out.println("luas permukaan dari kerucut kelas ini adalah : "+hasil);
        
        Bola bola = new Bola(2);
        
        hasil = bola.getVolume();
        System.out.println("volume dari bola kelas ini adalah : "+hasil);
        hasil = bola.getLuasPermukaan();
        System.out.println("luas permukaan dari kerucut kelas ini adalah : "+hasil);
    }
}
