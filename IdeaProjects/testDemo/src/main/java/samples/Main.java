package samples;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {

    @Test
    public void first(){
        System.out.println("run");
        Assert.assertEquals("test","run");
    }
    @Test
    public void second(){
        System.out.println("2");
    }
    @Test
    public void third(){
        System.out.println("3");
    }

}
