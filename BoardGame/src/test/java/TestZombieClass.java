import com.lbg.Skeleton;
import com.lbg.Zombie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestZombieClass {

    @Test
    public void TestGreeting(){
        Zombie zombie = new Zombie();
        String greeting = zombie.greeting();
        assertEquals("Should not work", greeting);
    }

    @Test
    public void livesLost(){
        Zombie zombie = new Zombie();
        int livesLost = zombie.livesLost();
        assertEquals(2, livesLost);
    }
}
