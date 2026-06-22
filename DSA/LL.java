package DSA;

public class LL {

    Node head;

    LL(){
        head = null;
    }

    public void insertLast(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = node;
    }

    public void insertFirst(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            head = node;
            head.next = temp;
        }

        temp.next = node;
    }


    public void display(){

        Node temp = head;

        while(temp!= null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.println("END");

    }


    public static void main(String[] args) {
        LL list = new LL();

        list.insertLast(5);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(9);

        list.insertFirst(11);

        list.display();
    }
}
