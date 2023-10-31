package com.entertainment.client;

import com.entertainment.Television;
import com.entertainment.Tuner;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television("RCA", 10);

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(); // blank line
        tv2.changeChannel(9);
        System.out.println(tv2);

        Television tvA = new Television("Sony", 20);
        Television tvB = new Television("Sony", 20);
        Television tvC = new Television("TONY",20);
        System.out.println("tvA == tvB" + (tvA == tvB));
        System.out.println("tvA.equals(tvB) " + (tvA.equals(tvB)));
        System.out.println("tvB.equals(tvC): " + tvB.equals(tvC));

    }
}
