import org.example.records.PersonRecord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {

    @Test
    public void testRecord() {
        PersonRecord personRecord = new PersonRecord("Laura", 28);
        assertEquals(28, personRecord.age());
    }
}
