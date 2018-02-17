import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by PDM-ko on 16.02.2018.
 */
public class SquareTest {

    @Test
    public void testArea(){
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);

    }
}
