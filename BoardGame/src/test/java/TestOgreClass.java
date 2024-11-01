import com.lbg.Ogre;
import com.lbg.Zombie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOgreClass {

    @Test
    public void TestGreeting(){
        Ogre ogre = new Ogre();
        String greeting = ogre.greeting();
        assertEquals("Should not work", greeting);
    }

    @Test
    public void livesLost(){
        Ogre ogre = new Ogre();
        int livesLost = ogre.livesLost();
        assertEquals(3, livesLost);
    }
}
