package lab3.example13s9;


import java.util.*;


public class Main {

    public static void main(String[] args) {
        int collectionSize = 150000; // Количество элементов в коллекции
        long indexAccessSize = 15000000L; // Количество элементов для вычисления скорости получения по индексу

        // Измеряем время выполнения операции добавления элемента в начало коллекции
        System.out.println("1. Время выполнения операции добавления элемента в начало коллекции:");
        System.out.println("ArrayDeque: " + getAddFirstTime(new ArrayDeque<>(), collectionSize));
        System.out.println("TreeSet: " + getAddFirstTime(new TreeSet<>(), collectionSize));
        System.out.println("ArrayList: " + getAddFirstTime(new ArrayList<>(), collectionSize));
        System.out.println();

        // Измеряем время выполнения операции добавления элемента в конец коллекции
        System.out.println("2. Время выполнения операции добавления элемента в конец коллекции:");
        System.out.println("ArrayDeque: " + getAddLastTime(new ArrayDeque<>(), collectionSize));
        System.out.println("TreeSet: " + getAddLastTime(new TreeSet<>(), collectionSize));
        System.out.println("ArrayList: " + getAddLastTime(new ArrayList<>(), collectionSize));
        System.out.println();

        // Измеряем время выполнения операции добавления элемента в середину коллекции
        System.out.println("3. Время выполнения операции добавления элемента в середину коллекции:");
        System.out.println("ArrayDeque: " + getAddMiddleTimeDeque(new ArrayDeque<>(), collectionSize));
        // TreeSet не поддерживает операцию добавления в середину
        System.out.println("TreeSet: Not Supported");
        System.out.println("ArrayList: " + getAddMiddleTimeList(new ArrayList<>(), collectionSize));
        System.out.println();

        // Измеряем время выполнения операции удаления элемента в начале коллекции
        System.out.println("4. Время выполнения операции удаления элемента в начале коллекции:");
        System.out.println("ArrayDeque: " + getRemoveFirstTime(new ArrayDeque<>(), collectionSize));
        // TreeSet не поддерживает операцию удаления в начале
        System.out.println("TreeSet: Not Supported");
        System.out.println("ArrayList: " + getRemoveFirstTime(new ArrayList<>(), collectionSize));
        System.out.println();

        // Измеряем время выполнения операции удаления элемента в конце коллекции
        System.out.println("5. Время выполнения операции удаления элемента в конце коллекции:");
        System.out.println("ArrayDeque: " + getRemoveLastTime(new ArrayDeque<>(), collectionSize));
        // TreeSet не поддерживает операцию удаления в конце
        System.out.println("TreeSet: Not Supported");
        System.out.println("ArrayList: " + getRemoveLastTime(new ArrayList<>(), collectionSize));
        System.out.println();

        // Измеряем время выполнения операции удаления элемента в середине коллекции
        System.out.println("6. Время выполнения операции удаления элемента в середине коллекции:");
        System.out.println("ArrayDeque: " + getRemoveMiddleTimeDeque(new ArrayDeque<>(), collectionSize));
        // TreeSet не поддерживает операцию удаления в середине
        System.out.println("TreeSet: Not Supported");
        System.out.println("ArrayList: " + getRemoveMiddleTimeList(new ArrayList<>(), collectionSize));
        System.out.println();

        // Измеряем время выполнения операции получения элемента по индексу
        System.out.println("7. Время выполнения операции получения элемента по индексу:");
        System.out.println("ArrayDeque: " + getIndexAccessTimeDeque(new ArrayDeque<>(), indexAccessSize));
        // TreeSet не поддерживает операцию доступа по индексу
        System.out.println("TreeSet: Not Supported");
        System.out.println("ArrayList: " + getIndexAccessTimeList(new ArrayList<>(), indexAccessSize));
    }

    private static long getAddFirstTime(Collection<Integer> collection, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getAddLastTime(Collection<Integer> collection, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getAddMiddleTimeList(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(list.size() / 2, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getAddMiddleTimeDeque(ArrayDeque<Integer> deque, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            deque.offer(i);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRemoveFirstTime(Collection<Integer> collection, int size) {
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            collection.remove(0);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRemoveLastTime(Collection<Integer> collection, int size) {
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            collection.remove(collection.size() - 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRemoveMiddleTimeList(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.remove(list.size() / 2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRemoveMiddleTimeDeque(ArrayDeque<Integer> deque, int size) {
        // Добавим элементы в deque
        for (int i = 0; i < size; i++) {
            deque.offer(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            deque.pollLast(); // Удаление элемента из конца deque
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getIndexAccessTimeList(List<Integer> list, long size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getIndexAccessTimeDeque(ArrayDeque<Integer> deque, long size) {
        // Заполняем ArrayDeque заданным количеством элементов
        for (int i = 0; i < size; i++) {
            deque.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Integer element = deque.pollFirst();
            deque.offerLast(element);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }
}

