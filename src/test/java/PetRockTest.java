import com.miraem.PetRock;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class PetRockTest {
    private PetRock rocky;
    @Before
    public void setUp() throws Exception {
        rocky = new PetRock("Rocky");
    }
    @Rule
    public Timeout time = Timeout.seconds(1);

    @Test
    public void getName() throws Exception{
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testUnhappyToStart() throws Exception {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Ignore ("Exception is not yet defined")
    @Test (expected = IllegalStateException.class)
    public void nameFail() throws Exception {
        rocky.getHappyMessage();
    }

    @Test
    public void name() throws Exception {
        rocky.playWithRock();
        rocky.getHappyMessage();
        String msg = rocky.getHappyMessage();
        assertEquals("I'm happy!", msg);
    }

    @Test
    public void testFavNumb() throws Exception {
        assertEquals(42,rocky.getFavNumber());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEmptyNameFail() throws Exception {
        new PetRock("");
    }


}