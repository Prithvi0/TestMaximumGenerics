public class FindMaximum {
    // METHOD TO FIND THE MAXIMUM INTEGER
    public Integer findMaximumInteger(Integer[] integers) {
        Integer maximumInteger = integers[0];
        if (maximumInteger.compareTo(integers[1]) < 0){
            maximumInteger = integers[1];
        }
        if (maximumInteger.compareTo(integers[2]) < 0){
            maximumInteger = integers[2];
        }
        return maximumInteger;
    }
}