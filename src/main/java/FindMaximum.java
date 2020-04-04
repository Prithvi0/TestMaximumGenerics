public class FindMaximum {
    // METHOD TO FIND THE MAXIMUM INTEGER
    public Integer findMaximumInteger(Integer[] integers) {
        Integer maximumInteger = integers[0];
        if (maximumInteger.compareTo(integers[1]) < 0) {
            maximumInteger = integers[1];
        }
        if (maximumInteger.compareTo(integers[2]) < 0) {
            maximumInteger = integers[2];
        }
        return maximumInteger;
    }
    // METHOD TO FIND THE MAXIMUM FLOAT NUMBER
    public Float findMaximumFloat(Float[] floats) {
        Float maximumFloat = floats[0];
        if (maximumFloat.compareTo(floats[1]) < 0.0f) {
            maximumFloat = floats[1];
        }
        if (maximumFloat.compareTo(floats[2]) < 0.0f) {
            maximumFloat = floats[2];
        }
        return maximumFloat;
    }
    //  METHOD TO FIND THE MAXIMUM STRING
    public String findMaximumString(String[] strings) {
        String maximumString = strings[0];
        if (maximumString.compareTo(strings[1]) < 0) {
            maximumString = strings[1];
        }
        if (maximumString.compareTo(strings[2]) < 0) {
            maximumString = strings[2];
        }
        return maximumString;
    }
}