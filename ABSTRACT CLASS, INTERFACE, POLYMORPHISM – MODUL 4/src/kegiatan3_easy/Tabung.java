package kegiatan3_easy;
public class Tabung extends Lingkaran{
    int tinggi;
    
    Tabung(int tinggi, int jari2){
        super(jari2);
        this.tinggi = tinggi;
    }
    
    public double getVolume(){
        int t = this.tinggi;
        int r = super.jari2;
        return Math.PI*(r*r)*t;
    }
}
