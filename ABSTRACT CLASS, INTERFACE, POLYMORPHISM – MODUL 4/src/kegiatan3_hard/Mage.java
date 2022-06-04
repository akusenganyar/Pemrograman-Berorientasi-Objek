package kegiatan3_hard;
public class Mage extends Hero implements MagicalDamage{
    Mage(int level){
        super.lifeStatus = true;
        super.healthPoint = 2500;
        super.defense = 200;
        super.attackDamage = 700;
        
        super.level = level;
        
        if(this.level > 0){
            for(int i = 0; i < this.level; i++){
                super.healthPoint += 85;
                super.defense += 10;
                super.attackDamage += 35;
            }
        }
        
        this.attackDamage += this.attackDamage * magicBonusDamage;
    }
    
    @Override
    public void spawnIntro(){
        System.out.println("Mage spam skill aja");
    }
}
