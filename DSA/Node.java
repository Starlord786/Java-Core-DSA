package DSA;

public class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }

    Node(int val, Node node){
        this.val = val;
        this.next = null;
    }

}
