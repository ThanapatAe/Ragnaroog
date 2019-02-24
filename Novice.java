import java.io.*;
import java.util.Scanner;

public class Novice {
    public int exp;
    public int maxExp;
    public int currHp;
    public int maxHp;
    public int level;
    public int chooseItem;
   

    public Novice(){
        this.exp = 0;
        this.maxExp = 150;
        this.level = 1;
        this.maxHp = 50;
        this.currHp = 50;
        
    }

    public int currentLevel(){
        level = level;
        return level;
    }

    public int levelUp(){     
            level = level+1;
            this.currentLevel();
            return level ;
        }
        
    

    public int hpUp(){        
        if(currHp < maxHp){
            currHp = currHp + 10;
        }
        return currHp;
    }

    public int hpDown(){      
        if(currHp <= 0){
            currHp = 0;
            System.out.println("YOU DIE!!!");
        }
        
        else if(currHp > 0){
            currHp = currHp - 30;
        }
        
        return currHp;
    }

    public int killMonter(){
        Item getItem = new Item();   
        Bag bagItem = new Bag(); 
        exp  = exp +150;
        if(exp >= maxExp){
            this.levelUp();   
        }
        exp = exp % maxExp;
        chooseItem = getItem.newItem();
        if(chooseItem == 1){
            System.out.println("Apple "+bagItem.appleInBag());
            System.out.println("Poison "+bagItem.poisonInBag());

        }
        return level;
    }

    public int eatApple(){      
        if(currHp < maxHp){
            this.hpUp();
        }
        else if(currHp >= maxHp){
            System.out.println("Hp Full!!!");
        }

        return currHp;

    }

    public int eatPoison(){         
        if(currHp > 31){
            this.hpDown();
        }
        else if(currHp <= 30){
            System.out.println("YOU DIE!!!");
            this.hpDown();
        }

        return currHp;
    }









    

}


    




    class Swordsman extends Novice{
        public int normalAttact;
        public int bash;

        public Swordsman(){
            this.normalAttact = level*3;
            this.bash = level*4;
        }

        
    }
