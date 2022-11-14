import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Game {


    private int players;
    private int counter;
    private int startMoney;
    Scanner in = new Scanner(System.in);
    ArrayList<Gambler> gamblers;

    Game(int players_, int startMoney_)
    {
        players = players_;
       
        startMoney = startMoney_;
        gamblers = new ArrayList<Gambler>();
        counter=0;
    }

    public void play()
    {
        setup();
        
        setTable(counter);
        removePlayers();
        counter++;
        
    }
    private void removePlayers()
    {
        
        for(Gambler g : gamblers)
        {
            if(g.getMoney()==0)
            {
                gamblers.remove(g);
                System.out.println(g.getName() + " " + quip() + ".");
            }
        }
        
    }
    private String quip()
    {
        String[] quips = {"checked out early", 
                        "took the L", 
                        "just couldn't make it", 
                        "should consider another hobby", 
                        "might be sleeping on the couch tonight", 
                        "will need to reconsider their life choices", 
                        "is a bad gambler"};
        int temp = (int)Math.random()*7 + 1;
        return quips[temp];
    }
    private void setup()
    {
        for(int i = 0; i<players; i++)
        {
            System.out.print("Enter player " + (i+1) + "'s name: ");
            gamblers.add(new Gambler(in.nextLine(), startMoney));
        }
    }

    private void setTable(int roundNum)
    {
        System.out.println("Round: " + roundNum + "========================================");
        for(Gambler g : gamblers)
        {
            Die temp1 = g.getDieOne();
            Die temp2 = g.getDieTwo();
            g.rollDice();

        }
    }
}
