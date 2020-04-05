package com.TestMaximumGenerics;

import java.util.Arrays;

//  GENERIC CLASS CREATION
@SuppressWarnings("unchecked")  //  ANNOTATION TO IGNORE WARNING GENERATED DUE TO UNCHECKED CASTING
public class FindMaximum<T extends Comparable<T>> {
    public T firstValue, secondValue, thirdValue;
    public T[] inputArray;
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
    // METHOD TO TAKE MORE THAN THREE PARAMETERS
    public FindMaximum(T[] inputArray) {
        this.inputArray = inputArray;
    }
    public void testMaximum1() {
        FindMaximum.testMaximum1(this.inputArray);
    }
    // METHOD TO SORT THE ELEMENTS IN AN ARRAY
    public static <T extends Comparable<T>> T testMaximum1(T... inputArray) {
        Arrays.sort(inputArray);
        T maxVal = inputArray[inputArray.length-1];
        printMax(maxVal);   //  INTERNAL METHOD CALLING FROM BELOW GENERIC METHOD
        return maxVal;
    }
    //  GENERIC METHOD TO PRINT MAX VALUE TO STDOUT
    public static <T> void printMax(T maximumVal) {
        System.out.println(maximumVal);
    }
}