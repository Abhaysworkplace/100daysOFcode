package com.dayone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class simpledotcomTestdrive {
    public static void main(String[] args) {
        int noOfGuess=0;
        GameHelper helper=new GameHelper();

        dotcom dot = new dotcom();
        int random=(int)(Math.random()*5);
        int[] locations={random, random+1, random+2};
        dot.setLocations(locations);

        boolean isAlive=true;

        while(isAlive==true) {
            String guess=helper.getUserInput("Enter a number");
            String result = dot.checkYourself(guess);
            noOfGuess++;
            if(result.equals("kill")){
                isAlive=false;
                System.out.println("You took "+noOfGuess);
            }
        }
    }
}

class dotcom{
    int[] locationCells;
    int noOfHits=0;
    public void setLocations(int[] locs){
        locationCells=locs;
    }

    public String checkYourself(String guess){
        int userGuess=Integer.parseInt(guess);
        String result="miss";
        for(int cell:locationCells){
            if(userGuess==cell){
                result="hit";
                noOfHits++;
                break;
            }
        }
        if(noOfHits==locationCells.length)
            result="kill";
        System.out.println(result);
        return result;
    }
}

class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine=null;
        System.out.print(prompt+" ");
        try{
            BufferedReader is =new BufferedReader(new InputStreamReader(System.in));
            inputLine= is.readLine();
            if(inputLine.length()==0)
                return null;
        }
        catch(IOException e){
            System.out.println("IOException: "+e);
        }
        return inputLine;


    }

}