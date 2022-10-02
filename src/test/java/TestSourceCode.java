import org.junit.Assert;
import org.junit.Test;

public class TestSourceCode {

    @Test
    public void getSeasonOfTheYearTest1() { Assert.assertEquals("Summer", Season.getSeasonOfTheYear(16, 6)); }

    @Test
    public void getSeasonOfTheYearTest2() {
        Assert.assertEquals("Winter", Season.getSeasonOfTheYear(16, 12));
    }

    @Test
    public void getSeasonOfTheYearTest3() {
        Assert.assertEquals("Spring", Season.getSeasonOfTheYear(16, 1));
    }

    @Test
    public void getSeasonOfTheYearTest4() {Assert.assertEquals("Winter", Season.getSeasonOfTheYear(16, 11)); }

    @Test
    public void getSeasonOfTheYearTest5() {Assert.assertEquals("Spring", Season.getSeasonOfTheYear(16, 2)); }

    @Test
    public void getSeasonOfTheYearTest6() {
        Assert.assertEquals("Invalid", Season.getSeasonOfTheYear(31, 6));
    }

    @Test
    public void getSeasonOfTheYearTest7() {
        Assert.assertEquals("Summer", Season.getSeasonOfTheYear(1, 6));
    }

    @Test
    public void getSeasonOfTheYearTest8() {
        Assert.assertEquals("Summer", Season.getSeasonOfTheYear(30, 6));
    }

    @Test
    public void getSeasonOfTheYearTest9() {Assert.assertEquals("Summer", Season.getSeasonOfTheYear(2, 6)); }
}

