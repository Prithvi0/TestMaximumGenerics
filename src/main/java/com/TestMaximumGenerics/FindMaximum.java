package com.TestMaximumGenerics;

//  GENERIC CLASS CREATION
@SuppressWarnings("unchecked")  //  ANNOTATION TO IGNORE WARNING GENERATED DUE TO UNCHECKED CASTING
public class FindMaximum<T extends Comparable<T>> {
    T firstValue, secondValue, thirdValue;
    //  PARAMETER CONSTRUCTOR
    public FindMaximum(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }
    // METHOD TO CALL INTERNALLY BY PASSING 3 INSTANCE VARIABLES
    public T testMaximum() {
        return (T) FindMaximum.testMaximum(firstValue, secondValue, thirdValue);
    }
    // GENERIC METHOD TO FIND MAXIMUM VALUE
    public static <T extends Comparable<T>> T testMaximum(T firstValue, T secondValue, T thirdValue) {
        T max = firstValue; //  INITIALLY, ASSUMING IT AS THE LARGEST VALUE
        if (secondValue.compareTo(max) > 0) {
            max = secondValue;  // IF CONDITION SATISFIES, ASSUMES IT AS THE LARGEST VALUE
        }
        if (thirdValue.compareTo(max) > 0) {
            max = thirdValue;   //  IF CONDITION SATISFIES, RETURNS THIS AS THE LARGEST VALUE
        }
        return max;
    }
}