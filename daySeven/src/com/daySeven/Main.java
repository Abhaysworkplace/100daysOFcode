package com.daySeven;

public class Main {

    public static void main(String[] args) {
	// write your code here
    linkList list=new linkList();
        list.insertNodeBegg(5);
        list.insertNodeBegg(11);
        list.insertNodeBegg(34);
        list.insertNodeBegg(3);
        list.insertNodeLast(7);
        list.insertNodeBegg(4343);
        list.insert(100,4);
        list.display();
        list.deleteBegg();
        list.display();
        list.deleteLast();
        list.display();
    }
}
