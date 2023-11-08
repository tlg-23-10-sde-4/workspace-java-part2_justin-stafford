package org.veggie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class RadishSortTest {

    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<Radish>();

        //color, size, tailLength, guysOnTop
        radishes.add(new Radish("red", 2.1, 1.0, 0));
        radishes.add(new Radish("black", 1.0, 0.0, 3));
        radishes.add(new Radish("red", 2.5, 4.2, 0));
        radishes.add(new Radish("pink", 0.7, 3.2, 2));

        // original Order
        System.out.println("Original Order:");
        dump(radishes);
        System.out.println(); //blank space

        // natural order
        System.out.println("natural order (size)");
        radishes.sort(null);  // passing null means natural order
        System.out.println();

        System.out.println("color, via RadishColorComparator");
        // radishes.sort(new RadishColorComparator());
        radishes.sort(new Comparator<Radish>() {
            @Override
            public int compare(Radish radish1, Radish radish2) {
                return radish1.getColor().compareTo(radish2.getColor());
            }
        });

        dump(radishes);
        System.out.println();

        System.out.println("size, via RadishGuysOnTopComparator");
        radishes.sort(new RadishGuysOnTopComparator());
        dump(radishes);
        System.out.println();

        // 11/8/2023  example about anonymous class
        System.out.println("sort by taillength, via anonymous class");
        radishes.sort(new Comparator<Radish>() {
            @Override
            public int compare(Radish radish1, Radish radish2) {
                return Double.compare(radish1.getTailLength(), radish2.getTailLength());
            }
        });
        dump(radishes);
        System.out.println();


    }

    private static void dump(List<Radish> radishes) {
        for (Radish radish : radishes) {
            System.out.println(radish);  // toString() automatically called
        }
    }
}

