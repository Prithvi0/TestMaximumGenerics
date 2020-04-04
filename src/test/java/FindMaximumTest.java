import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum maximum = new FindMaximum();
    //  T.C 1.1: TEST CASE TO ENSURE MAX NUMBER IS IN THE FIRST POSITION
    @Test
    public void givenMaximumIntegerNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Integer findMaxInteger = maximum.findMaximumInteger(new Integer[]{33, 3, 4});
        Assert.assertEquals(33, (int) findMaxInteger);
    }
    // T.C 1.2: TEST CASE TO ENSURE MAX NUMBER IS IN THE SECOND POSITION
    @Test
    public void givenMaximumIntegerNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Integer findMaxInteger = maximum.findMaximumInteger(new Integer[]{3, 33, 4});
        Assert.assertEquals(33, (int) findMaxInteger);
    }
    // T.C 1.3: TEST CASE TO ENSURE MAX NUMBER IS IN THE THIRD POSITION
    @Test
    public void givenMaximumIntegerNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Integer findMaxInteger = maximum.findMaximumInteger(new Integer[]{3, 4, 33});
        Assert.assertEquals(33, (int) findMaxInteger);
    }
    // T.C 2.1 TEST CASE TO ENSURE MAX FLOAT NUMBER IS IN THE FIRST POSITION
    @Test
    public void givenMaximumFloatNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Float findMaxFloatNumber = maximum.findMaximumFloat(new Float[]{3.1f, 1.1f, 2.1f});
        Assert.assertEquals((Float) 3.1f, findMaxFloatNumber);
    }
    // T.C 2.2 TEST CASE TO ENSURE MAX FLOAT NUMBER IS IN THE SECOND POSITION
    @Test
    public void givenMaximumFloatNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Float findMaxFloatNumber = maximum.findMaximumFloat(new Float[]{1.1f, 3.1f, 2.1f});
        Assert.assertEquals((Float) 3.1f, findMaxFloatNumber);
    }
    // T.C 2.3 TEST CASE TO ENSURE MAX FLOAT NUMBER IS IN THE THIRD POSITION
    @Test
    public void givenMaximumFloatNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Float findMaxFloatNumber = maximum.findMaximumFloat(new Float[]{1.1f, 2.1f, 3.1f});
        Assert.assertEquals((Float) 3.1f, findMaxFloatNumber);
    }
}