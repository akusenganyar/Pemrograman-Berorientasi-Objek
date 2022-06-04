package kegiatan3_hard;

public class Assassin extends Hero implements CriticalDamage{
    Assassin(int level){
        super.lifeStatus = true;
        super.healthPoint = 3000;
        super.defense = 300;
        super.attackDamage = 800;
        
        super.level = level;
        
        if(this.level > 0){
            for(int i = 0; i < this.level; i++){
                super.healthPoint += 90;
                super.defense += 15;
                super.attackDamage += 30;
            }
        }
        
        this.attackDamage += this.attackDamage * bonusDamage;
    }
    
    @Override
    public void spawnIntro(){
        System.out.println("assassin sing sing sing");
    }
    
    
}
