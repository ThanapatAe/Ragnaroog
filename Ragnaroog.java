import java.io.*;
import java.util.Scanner;

public class Ragnaroog {
    


    public static void main(String[] args) {
        Novice novice = new Novice();
        Acolyte acolyte = new Acolyte();
        Scanner Sc = new Scanner(System.in);
        int number ;
        int currentLevel;


        currentLevel = novice.currentLevel();
    
        if(currentLevel < 10){
         System.out.println("Plese Enter Number For Novice Do");
            System.out.println("1 For Kill Monter");
            System.out.println("2 For Eat Apple");
            System.out.println("3 For Eat poison");
            System.out.println("0 For End");

        do {
            System.out.print("Enter number : ");
            number = Sc.nextInt();

            if(number == 1){
                System.out.println("Your level is "+novice.killMonter());
                
            }
            else if (number == 2){
                System.out.println("Your Hp is "+novice.eatApple());
            }
            else if (number == 3){
                System.out.println("Your Hp is "+novice.eatPoison());
            }
        
            
            currentLevel = novice.currentLevel();
        

        }while (number != 0 || currentLevel <= 10);   }



        
        else if(currentLevel >= 10){

                System.out.println("Plese Select Your New Job ");
                System.out.println("1 Acolyte");
                System.out.println("2 Swordsman");

                System.out.print("Enter number : ");
                number = Sc.nextInt();

                if(number == 1){
                    System.out.println("You Are Acolyte ");
                    System.out.println("Plese Enter Number For Acolyte Do");
                    System.out.println("1 For Kill Monter");
                    System.out.println("2 For Eat Apple");
                    System.out.println("3 For Eat poison");
                    System.out.println("0 For End");
    
                    do {
                        System.out.print("Enter number : ");
                        number = Sc.nextInt();
            
                        if(number == 1){
                            System.out.println("Your level is "+acolyte.killMonter());
                            
                        }
                        else if (number == 2){
                            System.out.println("Your Hp is "+novice.eatApple());
                        }
                        else if (number == 3){
                            System.out.println("Your Hp is "+novice.eatPoison());
                        }
                    
                    
            
                    }while (number != 0);
                }

            }
            
    }

    
}

