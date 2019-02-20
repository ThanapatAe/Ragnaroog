import java.io.*;

public class Bag {

    public int apple ;
    public int poison ;

    public Bag(){
        this.apple = 0 ;
        this.poison = 0 ;
    }

    
   
    public int appleInBag(){
        this.apple = apple+1;
        return apple;
    }


    public int poisonInBag(){
        this.poison = poison+1;
        return poison;
    }
}