import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;
//import jdk.incubator.vector.*;

//public class random {
//    public static void main(String[] args) {
////        long time = System.currentTimeMillis();
////        Random random = new Random();
////        double r;
////        int count = 0;
////        for(int i = 0; i < 1000000000; i++) {
////            r=random.nextDouble();
////            if(r >= 0.0 && r < 0.1) {
////                count++;
////            }
////        }
////        System.out.println(count/1000000000.0);
////        long time2 = System.currentTimeMillis();
////        System.out.println(time2-time+"ms");
//    }
//}

//public class random {
//    public static void main(String[] args) throws InterruptedException {
//        int cores = Runtime.getRuntime().availableProcessors(); // 获取 CPU 核心数
//        System.out.println("CPU 核心数: " + cores);
//
//        ExecutorService executor = Executors.newFixedThreadPool(cores); // 创建与 CPU 核心数相等的线程池
//        long start = System.currentTimeMillis();
//        double totalSamples = 10000000000D; // 10 亿次
//        double batchSize = totalSamples / cores; // 平均分配任务
//        CountDownLatch latch = new CountDownLatch(cores);
//        int[] results = new int[cores];
//
//        for (int i = 0; i < cores; i++) {
//            final int index = i;
//            executor.submit(() -> {
//                Random random = new Random();
//                int count = 0;
//                for (int j = 0; j < batchSize; j++) {
//                    if (random.nextDouble() < 0.1) {
//                        count++;
//                    }
//                }
//                results[index] = count;
//                latch.countDown();
//            });
//        }
//
//        latch.await(); // 等待所有线程完成
//        executor.shutdown();
//
//        int totalCount = 0;
//        for (int count : results) {
//            totalCount += count;
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println("概率：" + (double) totalCount / totalSamples);
//        System.out.println("运行时间：" + (end - start) + " ms");
//    }
//        public static void main(String[] args) {
//            int size = 1_000_000_000;
//            float[] data = new float[size];
//            for (int i = 0; i < size; i++) data[i] = i;
//
//            FloatVector sum = FloatVector.zero(FloatVector.SPECIES_PREFERRED);
//            long start = System.nanoTime();
//
//            for (int i = 0; i < size; i += FloatVector.SPECIES_PREFERRED.length()) {
//                FloatVector v = FloatVector.fromArray(FloatVector.SPECIES_PREFERRED, data, i);
//                sum = sum.add(v);
//            }
//
//            long end = System.nanoTime();
//            System.out.println("运行时间：" + (end - start) / 1e6 + " ms");
//        }
//}