public class FindMaximum {
    public Integer findMaximumInteger(Integer[] maximumInteger) {
        Integer maximum = maximumInteger[0];
        for (int max = 0; max < maximumInteger.length; max++)
            if (maximum.compareTo(maximum) > 0)
                maximum = max;
            return maximum;     //  FIND THE MAXIMUM INTEGER FROM GIVEN INTEGERS
    }
}