import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Casino
{
    public static void main(String[] args) throws IOException
    {
        Die test = new Die();
        for(int i = 0; i<100; i++)
        {

        
        test.roll();
        test.seeDisplay();
        System.out.println("Num: " + test.see());
        System.out.println("Side Amnt: " + test.getSides());
        System.out.println(test.toString());
        test.changeSides((int)(Math.random()*10000)+1);
        
        System.out.println("\n");
        }
    }
}