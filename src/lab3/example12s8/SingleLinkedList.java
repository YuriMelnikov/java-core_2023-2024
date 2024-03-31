package lab3.example12s8;

import java.util.Scanner;

class SingleLinkedList {
    private Node head;

    public SingleLinkedList(){
        this.head = null;
    }

    //Метод для ввода с головы
    public void createHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //Метод для ввода с хвоста
    public void createTail(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            Node ref = head;
            while (ref.next != null){
                ref = ref.next;
            }
            ref.next = newNode;
        }
    }

    //Вывод строки из эл-ов списка
    public String toString(){
        StringBuilder res = new StringBuilder();
        Node ref = head;
        while (ref != null){
            res.append(ref.data).append(" ");
            ref = ref.next;
        }
        return res.toString();
    }

    //Метод для добавления эл-та в начало списка
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Метод для добавления элемента в конец списка
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node ref = head;
            while (ref.next != null){
                ref = ref.next;
            }
            ref.next = newNode;
        }
    }

    // Метод для вставки элемента в список с указанным номером
    public void insert(int index, int data){
        if(index < 0){
            throw new IllegalArgumentException("Индекс должен быть положительным числом или нулем");
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node ref = head;
        int count = 0;
        while(ref != null && count < index - 1){
            ref = ref.next;
            count++;
        }
        if(ref == null){
            throw new IndexOutOfBoundsException("Индекс вне границ списка");
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }

    // Метод для удаления элемента с головы списка
    public void removeFirst(){
        if(head == null){
            throw new IllegalStateException("Список пуст");
        }
        head = head.next;
    }

    // Метод для удаления последнего элемента списка
    public void removeLast(){
        if(head == null){
            throw new IllegalStateException("Список пуст");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node ref = head;
        while(ref.next.next != null){
            ref = ref.next;
        }
        ref.next = null;
    }

    // Метод для удаления из списка элемента с указанным номером
    public void remove(int index){
        if(index < 0){
            throw new IllegalArgumentException("Индекс должен быть положительным числом или нулем");
        }
        if(index == 0){
            removeFirst();
            return;
        }
        Node ref = head;
        int count = 0;
        while(ref != null && count < index - 1){
            ref = ref.next;
            count++;
        }
        if(ref == null || ref.next == null){
            throw new IndexOutOfBoundsException("Индекс вне границ списка");
        }
        ref.next = ref.next.next;
    }

    // Метод для ввода с головы с использованием рекурсии
    public void createHeadRec(int data){
        head = createHeadRec(head, data);
    }

    private Node createHeadRec(Node ref, int data){
        Node newNode = new Node(data);
        if(ref == null){
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }

    // Метод для ввода с хвоста с использованием рекурсии
    public void createTailRec(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            createTailRec(head, data);
        }
    }

    private Node createTailRec(Node ref, int data){
        if(ref.next == null){
            ref.next = new Node(data);
        } else {
            createTailRec(ref.next, data);
        }
        return ref;
    }

    // Метод для вывода списка в строку с использованием рекурсии
    public String toStringRec(){
        return toStringRec(head);
    }

    private String toStringRec(Node ref){
        if(ref == null){
            return "";
        }
        return ref.data + " " + toStringRec(ref.next);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SingleLinkedList list = new SingleLinkedList();
        SingleLinkedList list1 = new SingleLinkedList();

        list.createHead(3);
        list.createHead(2);
        list.createHead(1);
        list.createTail(4);
        list.createTail(5);
        list.createTail(6);
        list.insert(2, 10);
        System.out.println("Список после ввода: " + list.toString());

        list.addFirst(0);
        list.addLast(11);
        System.out.println("Список после добавления первого и последнего: " + list.toString());
        list.removeFirst();
        list.removeLast();
        list.remove(2);
        System.out.println("Список после изменений: " + list.toString());

        list1.createHeadRec(3);
        list1.createHeadRec(2);
        list1.createHeadRec(1);
        list1.createTailRec(4);
        list1.createTailRec(5);
        list1.createTailRec(6);
        System.out.println("Список 2 после ввода с использованием рекурсии: " + list1.toStringRec());

        in.close();
    }
}
