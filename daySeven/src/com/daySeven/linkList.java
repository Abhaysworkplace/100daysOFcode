package com.daySeven;

import org.w3c.dom.Node;

public class linkList {
    private Node head;
    private Node tail;
    private int size;

    public linkList() {
        this.size =0;
    }
    public void insertNodeBegg(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null)
            tail=head;
        size+=1;
    }
    public void insertNodeLast(int val){
        if(tail==null) {
            insertNodeBegg(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
    }
        System.out.println("END");
    }
    public void insert(int val, int index){
        if(index==0){
            insertNodeBegg(val);
            return;
        }
        if(index==size){
            insertNodeLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next= new Node(val,temp.next);
        size++;
    }

    public int delete(int index){
        if(index==0)
            return deleteLast();
        if(index==size-1)
            return deleteLast();
        Node pre=get(index-1);
        int val= pre.next.value;
        pre.next=pre.next.next;
        return val;
    }
    public int deleteBegg(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1)
            return deleteBegg();
        Node secLast=get(size-2);
        int val= tail.value;
        tail=secLast;
        tail.next=null;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
