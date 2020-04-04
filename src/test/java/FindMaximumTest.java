import com.TestMaximumGenerics.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum maximum;
    //  T.C 1.1: TEST CASE TO ENSURE MAX NUMBER IS IN THE FIRST POSITION
    @Test
    public void givenMaximumIntegerNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
//        maximum = new FindMaximum();
        Integer findMaxInteger = (Integer) maximum.testMaximum(33, 3, 4);
        Assert.assertEquals(33, (int) findMaxInteger);
    }
    // T.C 1.2: TEST CASE TO ENSURE MAX NUMBER IS IN THE SECOND POSITION
    @Test
    public void givenMaximumIntegerNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Integer findMaxInteger = (Integer) maximum.testMaximum(3, 33, 4);
        Assert.assertEquals(33, (int) findMaxInteger);
    }
    // T.C 1.3: TEST CASE TO ENSURE MAX NUMBER IS IN THE THIRD POSITION
    @Test
    public void givenMaximumIntegerNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Integer findMaxInteger = (Integer) maximum.testMaximum(3, 4, 33);
        Assert.assertEquals(33, (int) findMaxInteger);
    }
    // T.C 2.1 TEST CASE TO ENSURE MAX FLOAT NUMBER IS IN THE FIRST POSITION
    @Test
    public void givenMaximumFloatNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Float findMaxFloatNumber = (Float) maximum.testMaximum(3.1f, 1.1f, 2.1f);
        Assert.assertEquals((Float) 3.1f, findMaxFloatNumber);
    }
    // T.C 2.2 TEST CASE TO ENSURE MAX FLOAT NUMBER IS IN THE SECOND POSITION
    @Test
    public void givenMaximumFloatNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Float findMaxFloatNumber = (Float) maximum.testMaximum(1.1f, 3.1f, 2.1f);
        Assert.assertEquals((Float) 3.1f, findMaxFloatNumber);
    }
    // T.C 2.3 TEST CASE TO ENSURE MAX FLOAT NUMBER IS IN THE THIRD POSITION
    @Test
    public void givenMaximumFloatNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Float findMaxFloatNumber = (Float) maximum.testMaximum(1.1f, 2.1f, 3.1f);
        Assert.assertEquals((Float) 3.1f, findMaxFloatNumber);
    }
    //  T.C 3.1 TEST CASE TO ENSURE MAX STRING IS IN THE FIRST POSITION
    @Test
    public void givenMaximumString_WhenAtFirstPosition_ShouldReturnSameString() {
        String findMaxString = (String) maximum.testMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", findMaxString);
    }
    //  T.C 3.2 TEST CASE TO ENSURE MAX STRING IS IN THE SECOND POSITION
    @Test
    public void givenMaximumString_WhenAtSecondPosition_ShouldReturnSameString() {
        String findMaxString = (String) maximum.testMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", findMaxString);
    }
    //  T.C 3.3 TEST CASE TO ENSURE MAX STRING IS IN THE THIRD POSITION
    @Test
    public void givenMaximumString_WhenAtThirdPosition_ShouldReturnSameString() {
        String findMaxString = (String) maximum.testMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", findMaxString);
    }
    // T.C 1.1-3.3: GENERIC TEST CASE TO ENSURE MAX VALUE
    @Test
    public <T> void given3GenericValues_WhenCorrect_ShouldReturnMaximumValue() {
        T genericMaximum = (T) maximum.testMaximum("Apple", "22", "3");
        Assert.assertEquals("Apple", genericMaximum);
    }
}