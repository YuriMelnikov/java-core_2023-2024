package lab3.example11s7;

import lab3.example8s4.Node;

public class ListEnd {
    public static void main(String[] args) {
        Node node0 = new Node(0,null);
        Node node1 = new Node(1,null);
        Node node2 = new Node(2,null);
        Node node3 = new Node(3,null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        //Добавление ноды с конца
        Node newNode = new Node(10, null);

        Node ref = node0;
        while (ref.next != null){
            ref = ref.next;
        }
        ref.next = newNode;
        ref = node0;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
