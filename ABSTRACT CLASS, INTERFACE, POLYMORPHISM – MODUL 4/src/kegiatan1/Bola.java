package kegiatan1;
public class Bola extends BangunRuang{
    double r;
    
    Bola(double jari2){
       this.r = jari2;
    }
    
    @Override
    public double getVolume(){
        double r = this.r;
        return 4*Math.PI*(r*r*r);
    }
       
    @Override
    public double getLuasPermukaan(){
        double r = this.r;
        return 4*Math.PI*Math.pow(r, 2);
    }
}
