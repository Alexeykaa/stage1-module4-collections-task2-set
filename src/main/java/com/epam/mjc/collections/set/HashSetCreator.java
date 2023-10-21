package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer x : sourceList) {
            set.add(x);
            if (x % 2 == 0) {
                int next = x;
                do {
                    next /= 2;
                    set.add(next);
                } while (next % 2 == 0);
            } else {
                set.add(2 * x);
            }
        }
        return set;
    }
}
