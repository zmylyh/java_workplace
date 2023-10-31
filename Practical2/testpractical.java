import org.junit.Assert;
import org.junit.Test;

public class testpractical {
    @Test
    public void test1() {

        Assert.assertEquals(55, p1.add(1, 10));
        Assert.assertEquals(55, p2.add(1, 10));
        Assert.assertEquals(0, p1.add(10, 1));
        Assert.assertEquals(0, p2.add(10, 1));
        Assert.assertEquals(1, p1.add(1, 1));
        Assert.assertEquals(1, p2.add(1, 1));


    }
}
