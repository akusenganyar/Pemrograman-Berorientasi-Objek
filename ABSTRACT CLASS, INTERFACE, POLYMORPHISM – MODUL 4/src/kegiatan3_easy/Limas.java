package kegiatan3_easy;
public class Limas extends Persegi{
    int tinggi;
    Limas(int tinggi, int sisi){
        super(sisi);
        this.tinggi = tinggi;
    }
    
    public double getVolume(){
        int s = super.sisi;
        int t = this.tinggi;
        return (s*s)*t/3;
    }
}
