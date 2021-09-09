import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("Метод getLocalNumber не возвращает число 14", 14, getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Метод getClassNumber вернул значение не больше 45", getClassNumber() <= 45);
    }
}
