package kegiatan3_hard;
public class Main {
    public static void main(String args[]){
        Assassin player1 = new Assassin(8);
        Mage player2 = new Mage(5);
        
        boolean stop = false;
        int round = 1;
        
        System.out.println("[[|SPEK PETARUNG 1|]]");
        player1.checkStatus();
        
        System.out.println();
        
        System.out.println("[[|SPEK PETARUNG 2|]]");
        player2.checkStatus();
        
        System.out.println();
        
        System.out.println("--Adu Mekanik--");
        do{
            System.out.println("--Ronde "+ round +" --");
            
            System.out.println("> > > Player 1 menyerang Player 2 < < <");
            
            player1.spawnIntro();
            player1.attack(player2);
            
            System.out.println("> > > Health Point Player 2 tersisa : " + player2.healthPoint + " < < <");
            
            if(!player2.lifeStatus){
                System.out.println();
                System.out.println("> > > > > > > > > >");
                System.out.println("Player 2 Meninggal");
                System.out.println("Player 1 Health Point tersisa : " + player1.healthPoint);
                System.out.println("Player 1 Menang");
                stop = true;
                break;
            }
            
            System.out.println("> > > Player 2 menyerang Player 1 < < <");
            
            player2.spawnIntro();
            player2.attack(player1);
            
            System.out.println("> > > Health Point Player 1 tersisa : " + player1.healthPoint + " < < <\n");
            
            if(!player1.lifeStatus){
                System.out.println();
                System.out.println("< < < < < < < < < <");
                System.out.println("Player 1 Meninggal");
                System.out.println("Player 2 Health Point tersisa : " + player2.healthPoint);
                System.out.println("Player 2 Menang");
                stop = true;
                break;
            }
            
            round++;
        }while(!stop);
    }
}
