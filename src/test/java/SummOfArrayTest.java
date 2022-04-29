import org.testng.Assert;
import org.testng.annotations.Test;

public class SummOfArrayTest {
    @Test
    public void testSummOfArrayHappyPath() {
        int [] arr = {2, 5, 7, 10};
        int expectedResult = 24;
        SummOfArray soa = new SummOfArray();
        int actualResult = soa.SummOfArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSummOfArrayZero() {
        int [] arr = {-22, 5, 7, 10};
        int expectedResult = 0;
        SummOfArray soa = new SummOfArray();
        int actualResult = soa.SummOfArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSummOfArrayOneData() {
        int [] arr = {-22};
        int expectedResult = -22;
        SummOfArray soa = new SummOfArray();
        int actualResult = soa.SummOfArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSummOfArrayEmptyArr() {
        int [] arr = {};
        int expectedResult = 0;
        SummOfArray soa = new SummOfArray();
        int actualResult = soa.SummOfArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
