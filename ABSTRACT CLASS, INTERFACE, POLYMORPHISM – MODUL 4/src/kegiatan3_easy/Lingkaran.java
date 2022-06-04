package kegiatan3_easy;
public class Lingkaran implements BangunDatar{
    int jari2;
    
    Lingkaran(int jari2){
        this.jari2 = jari2;
    }
    
    @Override
    public double luas(){
        double r = this.jari2;
        return Math.PI*(r*r);
    }
    
    @Override
    public double keliling(){
        double r = this.jari2;
        return 2*(Math.PI*r);
    }
}
