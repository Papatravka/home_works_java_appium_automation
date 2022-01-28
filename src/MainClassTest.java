import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    //test_1
    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("LocalNumber != 14", 14, getLocalNumber());
        }
    //test_2
    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("ClassNumber <= 45", getClassNumber() > 45);
    }

    @Test
    //test_3
    public void testGetClassString() {
        Assert.assertTrue("String does not contain: \"Hello\" or \"hello\"",
                getClassString().toLowerCase().contains("hello"));
    }
}


