package com.TestMaximumGenerics;

public class FindMaximum {
    @SuppressWarnings("unchecked")
    // GENERIC METHOD TO FIND MAXIMUM VALUE
    public static <T extends Comparable> T maximumValue (T[] max) {
        T maximum = max[0];
        if (maximum.compareTo(max[1]) < 0) {
            maximum = max[1];
        }
        if (maximum.compareTo(max[2]) < 0) {
            maximum = max[2];
        }
        return maximum;
    }
}