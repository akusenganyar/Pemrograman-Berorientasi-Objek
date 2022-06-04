package kegiatan1;

public class Kerucut extends BangunRuang{
    double r,t;
    Kerucut(double jari2, double tinggi){
        this.r = jari2;
        this.t = tinggi;
    }
    
    @Override
    public double getVolume(){
        double r = this.r;
        double t = this.t;
        
        return Math.PI*(r*r)*t/3;
    }


    @Override
    public double getLuasPermukaan(){
        double r = this.r;
        double t = this.t;
        
        double pelukis = Math.sqrt((Math.pow(r, 2)+Math.pow(t,2)));
        double selimut = Math.PI*r*pelukis;
        double alas = Math.PI*Math.pow(r, 2);
        
        return selimut+alas;
    }
}
