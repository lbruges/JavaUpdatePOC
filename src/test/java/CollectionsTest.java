import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsTest {

    @Test
    public void initCollectionTest_list() {
        List<String> names = List.of("Sarah", "Daniel", "Laura", "Marcello");
        assertEquals(4, names.size());
    }
    @Test
    public void initCollectionTest_set() {
        Set<String> names = Set.of("Sarah", "Daniel", "Laura", "Marcello");
        assertEquals(4, names.size());
    }

    @Test
    public void initCollectionTest_set_duplicatedElements() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                () -> Set.of("Sarah", "Daniel", "Laura", "Marcello", "Laura"), "Should have thrown an exception, but it didn't.");

        assertTrue(iae instanceof IllegalArgumentException);
    }

    @Test
    public void initCollectionTest_map() {
        Map<String, String> names = Map.of("Sarah", "Daniel", "Laura", "Marcello");
        // {Sarah=Daniel, Laura=Marcello}
        assertEquals(2, names.size());
    }

    @Test
    public void initCollectionTest_mapOfEntries() {
        Map<String, String> names = Map.ofEntries(Map.entry("Sarah", "18"), Map.entry("Daniel", "22"), Map.entry("Laura", "28"), Map.entry("Marcello", "2"));
        assertEquals(4, names.size());
    }
}
