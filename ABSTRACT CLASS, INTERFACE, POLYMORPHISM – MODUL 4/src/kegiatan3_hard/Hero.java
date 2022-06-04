package kegiatan3_hard;
public abstract class Hero {
    double healthPoint;
    double attackDamage;
    double defense;
    int level;
    boolean lifeStatus;
    
    public void attack(Hero target){
        target.reviewDamage(this.attackDamage);
    }
    
    public void reviewDamage(double damage){
        double realDamage = damage - this.defense;
        this.healthPoint -= realDamage;
        if(this.healthPoint <= 0){
            this.lifeStatus = false;
        }
    }
    
    public void checkStatus(){
        System.out.println("Level : " + this.level);
        System.out.println("Health Point: " + this.healthPoint);
        System.out.println("Attack Damage : " + this.attackDamage);
        System.out.println("Defense : " + this.defense);
        System.out.println("Life Status : " + this.lifeStatus);
    }
    
    public abstract void spawnIntro();
}
