package lab3.example11s7;

import lab3.example8s4.Node;

public class ListHead {
    public static void main(String[] args) {
        Node node0 = new Node(0,null);
        Node node1 = new Node(1,null);
        Node node2 = new Node(2,null);
        Node node3 = new Node(3,null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        //Создание новой ноды с головы
        Node node00 = new Node(-1, null);

        node00.next = node0;
        node0 = node00;

        Node ref = node0;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}