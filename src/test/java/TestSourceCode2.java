import org.junit.Assert;
import org.junit.Test;

public class TestSourceCode2 {
    @Test
    public void getSeasonOfTheYearTest1() {
        Assert.assertEquals("Spring", Season.getSeasonOfTheYear(14, 2));
    }

    @Test
    public void getSeasonOfTheYearTest2() {
        Assert.assertEquals("Summer", Season.getSeasonOfTheYear(28, 5));
    }

    @Test
    public void getSeasonOfTheYearTest3() {Assert.assertEquals("Autumn", Season.getSeasonOfTheYear(29, 7));}

    @Test
    public void getSeasonOfTheYearTest4() {
        Assert.assertEquals("Summer", Season.getSeasonOfTheYear(30, 4));
    }

    @Test
    public void getSeasonOfTheYearTest5() {
        Assert.assertEquals("Invalid", Season.getSeasonOfTheYear(31, 11));
    }
}
