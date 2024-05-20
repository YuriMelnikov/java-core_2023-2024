package lab6;

public class Example6 {
    static class SumTask extends Thread {
        private int[] array;
        private int start;
        private int end;
        private int sum;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }
        @Override
        public void run() {
            sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
        }
        public int getSum() {
            return sum;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {3, 5, 2, 9, 6, 8, 15, 1, 7, 4, 0, 12, 11, 14, 13, 10};
        int numThreads = Runtime.getRuntime().availableProcessors();
        SumTask[] tasks = new SumTask[numThreads];

        int length = array.length;
        int chunkSize = (int) Math.ceil((double) length / numThreads);

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, length);
            tasks[i] = new SumTask(array, start, end);
            tasks[i].start();
        }

        int totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            tasks[i].join();
            totalSum += tasks[i].getSum();
        }

        System.out.println("Сумма элементов в массиве: " + totalSum);
    }
}
