package com.dayone;

public class phraseomatic {

    public static void main(String[] args) {
	// write your code here
        String[] one={"hello", "quiet", "surpass", "certain", "effect", "present"};
        String[] two={"needle", "deserted", "map", "suppose",  "chat"};
        String[] three={"fish", "offbeat", "wooden", "boat", "preside"};

        //method to calculate the length of the String arrays
        int oneLength= one.length;
        int twoLength=two.length;
        int threeLength=three.length;

        //calculating a random number from their respective lengths
        int oneRand=(int)(Math.random()*oneLength);
        int twoRand=(int)(Math.random()*twoLength);
        int threeRand=(int)(Math.random()*threeLength);

        //making it a phrase
        String phrase=one[oneRand]+" "+two[twoRand]+" "+three[threeRand];

        //printing it out
        System.out.println("The random phrase generated is "+phrase);
    }
}
