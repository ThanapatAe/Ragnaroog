import java.io.*;
import java.util.Scanner;

public class Acolyte extends Novice {

        public int normalAttact;
        public int holyLight;
        public int heal;
        public int hpMonter;
        public int hp;
        public int currentHp;
        
    
        public Acolyte(){

            this.normalAttact = level*2;
            this.holyLight = level*3;
            this.heal = level*2;
            this.hpMonter = 200;
            this.hp = 300;
            this.currentHp = 300;
        }

        
            public int killMonter(){
                
                Item getItem = new Item();   
                Bag bagItem = new Bag(); 
                Scanner Sc = new Scanner(System.in);
                int number;
                    System.out.println("Plese Enter Number For Skill");
                    System.out.println("1 For Normal Attact");
                    System.out.println("2 For Holy Light");
                    System.out.println("3 For Heal");

                    do{
                        System.out.print("Enter number : ");
                        number = Sc.nextInt();

                        if(number == 1){
                            hpMonter = hpMonter - normalAttact;
                        }
                        else if(number == 2){
                            hpMonter = hpMonter - holyLight;
                        }
                        else if(number == 3){
                            currentHp = currentHp + heal;
                            System.out.println("You HP Is : "+currentHp);
                        }

                    }while(hpMonter <= 0);

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
        




}


    
