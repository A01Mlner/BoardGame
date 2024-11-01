import com.lbg.Skeleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSkeletonClass {
    @Test
    public void TestGreeting(){
        Skeleton skeleton = new Skeleton();
        String greeting = skeleton.greeting();
        assertEquals("Should not work", greeting);
    }

    @Test
    public void livesLost(){
        Skeleton skeleton = new Skeleton();
        int livesLost = skeleton.livesLost();
        assertEquals(1, livesLost);
    }
}
