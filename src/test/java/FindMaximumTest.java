import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    //  T.C 1.1: TEST CASE TO ENSURE MAX NUMBER IS IN THE FIRST POSITION
    @Test
    public void givenMaximumIntegerNumber_whenAtFirstPosition_shouldReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        Integer findMaxInteger = maximum.findMaximumInteger(new Integer[]{33, 3, 4});
        Assert.assertEquals(33, (int) findMaxInteger);
    }
}