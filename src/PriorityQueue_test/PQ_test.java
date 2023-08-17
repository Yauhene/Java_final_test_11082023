package PriorityQueue_test;

import java.util.PriorityQueue;

public class PQ_test {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        int i = pq.poll();
        System.out.println(pq);
        int j = pq.element();
        System.out.println(j);
        int k = pq.element();
        System.out.println(k);
        System.out.println(pq);
    }
}
