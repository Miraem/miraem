import com.miraem.PetRock;
import org.junit.Test;


import static org.junit.Assert.*;

public class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() throws Exception{
        assertEquals("Rocky", rocky.getName());
    }



    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEmptyNameFail() throws Exception {
        new PetRock("");
    }
}