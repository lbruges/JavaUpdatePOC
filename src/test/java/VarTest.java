import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VarTest {

    @Test
    public void varExample() {
        var name = "test";

        assertTrue(name instanceof String);
    }

}
