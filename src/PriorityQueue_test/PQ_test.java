package PriorityQueue_test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PQ_test {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq);
        System.out.println(pq);
        System.out.println(pq);
        String str= "";
        Scanner scanner = new Scanner(System.in);
        while (str != "end") {
            System.out.println("Введите строку: ");
            str = scanner.nextLine();
            System.out.println("str = " + str);
            switch (str) {
                case ("end"):
                    str = "end";
                    break;
                case ("one"):
                    System.out.println("This is one!");
                    break;
                case ("two"):
                    System.out.println("This is two!");
                    break;
                default:
                    System.out.println("Чушь! Еще разок.");

            }
        }
    }
}
