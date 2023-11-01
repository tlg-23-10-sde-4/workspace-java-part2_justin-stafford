package org.veggie;

import java.util.Comparator;

// sort key is by GuysOnTop (int)
class RadishGuysOnTopComparator implements Comparator<Radish> {
    @Override
    public int compare(Radish radish1, Radish radish2) {
        return Integer.compare(radish1.getGuysOnTop(), radish2.getGuysOnTop());
    }

}
