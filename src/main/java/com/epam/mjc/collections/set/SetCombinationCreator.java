package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> result = new HashSet<>(firstSet);
        result.retainAll(secondSet);
        result.removeAll(thirdSet);
        HashSet<String> subset = new HashSet<>(thirdSet);
        subset.removeAll(firstSet);
        subset.removeAll(secondSet);
        result.addAll(subset);
        return result;
    }
}
