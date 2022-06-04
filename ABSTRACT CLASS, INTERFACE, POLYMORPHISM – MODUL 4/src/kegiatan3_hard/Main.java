package kegiatan3_hard;
public class Main {
    public static void main(String args[]){
        Assassin a = new Assassin(8);
        a.checkStatus();
        
        Tank t = new Tank(2);
        t.checkStatus();
        
        Mage m = new Mage(5);
        m.checkStatus();
    }
}
