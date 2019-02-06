package com.coderbd.chap30;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import static java.util.stream.Collectors.toList;

public class SumTask extends RecursiveTask<Long> {

    private static final int SEQUENTIAL_THRESHOLD = 10;
    private List<Long> data;

    public SumTask(List<Long> data) {
        this.data = data;
    }

    @Override
    protected Long compute() {
        if (data.size() <= SEQUENTIAL_THRESHOLD) {
            long sum = computeSumDirectly();
            System.out.format("Sum of %s: %d\n", data.toString(), sum);
            return sum;
        } else {
            int mid = data.size() / 2;
            SumTask firstSubtask = new SumTask(data.subList(0, mid));
            SumTask secondSubtask = new SumTask(data.subList(mid, data.size()));

            firstSubtask.fork();

            return secondSubtask.compute()
                    + firstSubtask.join();
        }
    }

    private long computeSumDirectly() {
        long sum = 0;
        for (Long l : data) {
            sum += l;
        }
        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();

        List<Long> data = random
                .longs(100, 45, 50)
                .boxed()
                .collect(toList());

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(data);
        System.out.println("Sum: " + pool.invoke(task));
    }
}
