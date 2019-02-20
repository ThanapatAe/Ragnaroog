import java.io.*;
import java.util.Scanner;

public class Ragnaroog {

    public static void main(String[] args) {
        Novice novice = new Novice();
        Scanner Sc = new Scanner(System.in);
        int number ;
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
        

        }while (number != 0);
    }
}
