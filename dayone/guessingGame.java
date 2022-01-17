package com.dayone;

public class guessingGame {
    Player p1;
    Player p2;
    Player p3;
    public void launch(){
        p1=new Player();
        p2=new Player();
        p3=new Player();

        boolean p1isRight=false;
        boolean p2isRight=false;
        boolean p3isRight=false;

        int p1guess=0;
        int p2guess=0;
        int p3guess=0;

        while(true){
            int guessingNumber=(int)(Math.random()*10);
            System.out.println("The number to be guessed is "+guessingNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            p1guess=p1.number;
            System.out.println("Player one guessed "+p1guess);
            p2guess=p2.number;
            System.out.println("Player Two guessed "+p2guess);
            p3guess=p2.number;
            System.out.println("Player Three guessed "+p3guess);

            if(p1guess==guessingNumber)
                p1isRight=true;
            if(p2guess==guessingNumber)
                p2isRight=true;
            if(p3guess==guessingNumber)
                p3isRight=true;

            if(p1isRight||p2isRight||p3isRight){
                System.out.println("We have a winner");
                System.out.println("player 1 ["+p1isRight+"]");
                System.out.println("player 2 ["+p2isRight+"]");
                System.out.println("player 3 ["+p3isRight+"]");
                break;
            }
            else
                System.out.println("No player guessed it right!");

            System.out.println("");

        }
    }
}

class Player{
    int number=0;
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("I'm guessing "+number);
    }

}
class GameLauncher{
    public static void main(String[] args) {
        guessingGame game=new guessingGame();
        game.launch();
    }
}
