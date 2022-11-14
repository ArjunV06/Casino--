import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Casino
{
    public static void main(String[] args) throws IOException
    {
        //Die test = new Die();
        //GamblerTester tester = new GamblerTester();
        //tester.test();
        /*for(int i = 0; i<100; i++)
        {

        
        test.roll();
        test.seeDisplay();
        System.out.println("Num: " + test.see());
        System.out.println("Side Amnt: " + test.getSides());
        System.out.println(test.toString());
        test.changeSides((int)(Math.random()*10000)+1);
        
        System.out.println("\n");
        }*/

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to \"Dice Roll the Game\"!");
        System.out.print("For how many players shall the table be set?: ");
        String temp = in.nextLine();
        while(!temp.matches("[0-9]+"))
        {
            System.out.print("Please enter only an integer value greater than 0: ");
            temp=in.nextLine();
        }
        int numPlay = Integer.parseInt(temp);
        System.out.print("How much shall be put in each players starting balance?: ");
        temp = in.nextLine();
        while(!temp.matches(("[0-9]+")))
        {
            System.out.print("Please enter only an integer value greater than 0: ");
            temp=in.nextLine();
        }
        int startMon = Integer.parseInt(temp);
        Game game = new Game(numPlay,startMon);
        game.play();
        




    }
}