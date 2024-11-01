import com.lbg.Board;
import com.lbg.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHeroClass {
    @Test
    public void moveUpPass(){
        Hero h = new Hero();
        Board b = new Board(new int[]{2, 2});
        h.setPosition(new int[]{0, 0});
        h.moveUp();
        assertEquals(0, h.getPosition()[0]);
        assertEquals(1, h.getPosition()[1]);

    }

    @Test
    public void moveUpOOB(){
        Hero h = new Hero();
        h.setPosition(new int[]{0, 2});
        Board b = new Board(new int[]{2, 2});
        h.moveUp();
        assertEquals(0, h.getPosition()[0]);
        assertEquals(2, h.getPosition()[1]);
    }

    @Test
    public void moveLeftPass(){
        Hero h = new Hero();
        Board b = new Board(new int[]{2, 2});
        h.setPosition(new int[]{2, 0});
        h.moveLeft();
        assertEquals(1, h.getPosition()[0]);
        assertEquals(0, h.getPosition()[1]);
    }

    @Test
    public void moveLeftOOB(){
        Hero h = new Hero();
        Board b = new Board(new int[]{2, 2});
        h.setPosition(new int[]{0, 0});
        h.moveLeft();
        assertEquals(0, h.getPosition()[0]);
        assertEquals(0, h.getPosition()[1]);

    }

    @Test
    public void moveRightPass(){
        Hero h = new Hero();
        Board b = new Board(new int[]{2, 2});
        h.setPosition(new int[]{0, 0});
        h.moveRight();
        assertEquals(1, h.getPosition()[0]);
        assertEquals(0, h.getPosition()[1]);

    }

    @Test
    public void moveRightOOB(){
        Hero h = new Hero();
        Board b = new Board(new int[]{2, 2});
        h.setPosition(new int[]{2, 0});
        h.moveRight();
        assertEquals(2, h.getPosition()[0]);
        assertEquals(0, h.getPosition()[1]);
    }

    @Test
    public void moveDownPass(){
        Hero h = new Hero();
        Board b = new Board(new int[]{2, 2});
        h.setPosition(new int[]{0, 2});
        h.moveDown();
        assertEquals(0, h.getPosition()[0]);
        assertEquals(1, h.getPosition()[1]);

    }

    @Test
    public void moveDownOOB(){
        Hero h = new Hero();
        Board b = new Board(new int[]{2, 2});
        h.setPosition(new int[]{0, 0});
        h.moveDown();
        assertEquals(0, h.getPosition()[0]);
        assertEquals(0, h.getPosition()[1]);

    }

    @Test
    public void FindsMonster(){

    }

    @Test
    public void CheckRandomPosition(){
        Board b = new Board(new int[]{10, 10});
        Hero h = new Hero();
        int[][] positions = new int[10][2];
        for(int i=0;i<10;i++){
            int[] pos = h.genRandomPosition(b.getBoardSize());
            positions[i][0]=pos[0];
            assertTrue(pos[0]<b.getBoardSize()[0] && pos[0]>=0);

            positions[i][1]=pos[1];
            assertTrue(pos[1]<b.getBoardSize()[1] && pos[1]>=0);
        }
        

    }
}
