import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    //  T.C 1.1: TEST CASE TO ENSURE MAX NUMBER IS IN THE FIRST POSITION
    @Test
    public void givenMaximumIntegerNumber_whenAtFirstPosition_ShouldReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        Integer findMaxInteger = maximum.findMaximumInteger(new Integer[]{33, 3, 4});
        Assert.assertEquals(33, (int) findMaxInteger);
    }
    // T.C 1.2: TEST CASE TO ENSURE MAX NUMBER IS IN THE SECOND POSITION
    @Test
    public void givenMaximumIntegerNumber_whenAtSecondPosition_ShouldReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        Integer findMaxInteger = maximum.findMaximumInteger(new Integer[]{3, 33, 4});
        Assert.assertEquals(33, (int) findMaxInteger);
    }
    // T.C 1.3: TEST CASE TO ENSURE MAX NUMBER IS IN THE THIRD POSITION
    @Test
    public void givenMaximumIntegerNumber_whenAtThirdPosition_shouldReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        Integer findMaxInteger = maximum.findMaximumInteger(new Integer[]{3, 4, 33});
        Assert.assertEquals(33, (int) findMaxInteger);
    }
}