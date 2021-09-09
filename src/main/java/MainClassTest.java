import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertEquals("Метод getLocalNumber не возвращает число 14", 14, mainClass.getLocalNumber());
    }
}
