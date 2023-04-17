import org.junit.jupiter.api.Test;

import static org.example.newsyntax.Switcher.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchTest {

    @Test
    public void testSwitch() {
        getPlayer("player1");
        getPlayer("player4");
        getPlayer("someone");
    }

    @Test
    public void testSwitchStr() {
        assertEquals("team123", getPlayerStr("player1"));
        assertEquals("team4", getPlayerStr("player4"));
        assertEquals("no team", getPlayerStr("player5"));
    }

    @Test
    public void testSwitchFormat() {
        assertEquals("int 5", formatterPatternMatching(5));
        assertEquals("long 10", formatterPatternMatching(10L));
        assertEquals("String hola", formatterPatternMatching("hola"));
        assertEquals("null!", formatterPatternMatching(null));
    }

}
