import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BowlingGameTest {

    @Test
    public void testGutterGame() {
        Game g = new Game();
        for(int i = 0; i < 20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }
}
