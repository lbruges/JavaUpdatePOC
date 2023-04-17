import org.example.records.PersonRecord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestNPE {

    @Test
    public void testNPE_name() {
        PersonRecord personRecord = new PersonRecord(null, 22);
        Exception exception = assertThrows(NullPointerException.class, () -> personRecord.name().toLowerCase(),
                "Should have thrown NPE.");
        exception.printStackTrace();
    }

    @Test
    public void testNPE_person() {
        PersonRecord personRecord = null;
        Exception exception = assertThrows(NullPointerException.class, () -> personRecord.name().toLowerCase(),
                "Should have thrown NPE.");
        exception.printStackTrace();
    }

}
