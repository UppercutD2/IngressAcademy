package org.example;

import java.util.PriorityQueue;

public class Polygon {


    public static void main(String[] args) {
        PriorityQueue<Integer> some = new PriorityQueue<>();

        Integer a=1;
        Integer b = 2;
        some.offer(a);
        some.offer(b);
        some.offer(7);

        System.out.println(some );
    }
}
