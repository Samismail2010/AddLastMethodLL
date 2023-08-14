package com.codewithsam;

public class LinkedList {
    //(2)moved Node class inside LinkedList/changed to private
    private class Node {
        private  int value;
        private Node next;

        //(3) Node value should always be stored
        //created a constructor to pass this value
        public Node (int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    public void addLast(int item){
       //(1)wrap this value (integer) inside a node object
        var node = new Node(item);
        //if statement to see if list is empty or not (no nodes in list)
        if(first == null)
            first = last = node;
        //if list has 1 node
        else {
            last.next = node;
            last = node;
        }

    }
}
