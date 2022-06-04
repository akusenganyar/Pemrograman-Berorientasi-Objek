package kegiatan3_easy;

public class Persegi implements BangunDatar{
    int sisi;
    
    Persegi(int sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double luas(){
        double s = this.sisi;
        return s*s;
    }
    
    @Override
    public double keliling(){
        double s = this.sisi;
        return 4*s;
    }
}
