import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    void SuccessTest(){
        assertEquals(true, true);

    }
    @Test
    void NegativeTest(){
        assertEquals(true, false);

    }
}
