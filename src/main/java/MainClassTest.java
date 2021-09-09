import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("Метод getLocalNumber не возвращает число 14", 14, getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Метод getClassNumber вернул число не больше 45: " + getClassNumber(), getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("Метод getClassString возвращает строку, в которой нет подстроки hello ли Hello", getClassString().toLowerCase().contains("hello"));
    }
}
