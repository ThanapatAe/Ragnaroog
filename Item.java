import java.io.*;
import java.util.Scanner;

public class Item {

    public int apple;
    public int poison;
    public int number;

    public int newItem(){
        Bag bagItem = new Bag();
        Scanner Sc = new Scanner(System.in);
        int number ;
        System.out.println("Item Drops : Apple! Poison! ");
        System.out.println("Plese Enter Number For Keep Item");
        System.out.println("1 For Keep All");
        System.out.println("2 For Don't Keep All ");
        System.out.println("0 For End");

        
        System.out.print("Enter number : ");
        number = Sc.nextInt();

        return number;
            
    
    }

   

    }
 