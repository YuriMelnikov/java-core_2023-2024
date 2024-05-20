package lab6;

import java.time.LocalTime;
import java.util.Random;

public class Example5 {
    static class MaxTask extends Thread {
        private int[] array;
        private int start;
        private int end;
        private int max;

        public MaxTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }
        @Override
        public void run() {
            max = Integer.MIN_VALUE;
            for (int i = start; i < end; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        public int getMax() {
            return max;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {3, 5, 2, 9, 6, 8, 15, 1, 7, 4, 0, 12, 11, 14, 13, 10};
        int numThreads = 4; // Количество потоков
        MaxTask[] tasks = new MaxTask[numThreads];

        int length = array.length;
        int chunkSize = (int) Math.ceil((double) length / numThreads);

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, length);
            tasks[i] = new MaxTask(array, start, end);
            tasks[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            tasks[i].join();
        }

        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < numThreads; i++) {
            if (tasks[i].getMax() > globalMax) {
                globalMax = tasks[i].getMax();
            }
        }

        System.out.println("Максимальный элемент в массиве: " + globalMax);
    }
}
