import java.io.*;
import java.util.Scanner;

public class Swordman extends Novice {

    public int normalAttact;
    public int bash;

    public Swordman(){
        this.normalAttact = level*3;
        this.bash = level*4;
    }

}