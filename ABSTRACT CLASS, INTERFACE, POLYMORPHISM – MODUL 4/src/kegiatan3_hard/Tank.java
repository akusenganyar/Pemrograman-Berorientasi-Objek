package kegiatan3_hard;
public class Tank extends Hero{
    Tank(int level){
        super.lifeStatus = true;
        super.healthPoint = 7000;
        super.defense = 500;
        super.attackDamage = 500;
        
        super.level = level;
        
        if(this.level > 0){
            for(int i = 0; i < this.level; i++){
                super.healthPoint += 200;
                super.defense += 15;
                super.attackDamage += 20;
            }
        }
    }
    @Override
    public void spawnIntro(){
        System.out.println("tank teng teng teng");
    }
}
