package com.entertainment.client;

import com.entertainment.Television;
import com.entertainment.Tuner;

import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("LG", 52);

//        System.out.println(tvA);
//        System.out.println(tvB);
//        System.out.println(); // blank line
//        tv2.changeChannel(9);
//        System.out.println(tvB);

//        Television tvA = new Television("Sony", 20);
//        Television tvB = new Television("Sony", 20);
//        Television tvC = new Television("TONY",20);
//        System.out.println("tvA == tvB" + (tvA == tvB));
//        System.out.println("tvA.equals(tvB) " + (tvA.equals(tvB)));
//        System.out.println("tvB.equals(tvC): " + tvB.equals(tvC));
        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);   // should be reject as a duplicate
        System.out.println("The size of the set is:  + tvs.size()");

    }
}
