import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
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

    @Test
    void SuccessWithHumcrestTest(){
        assertThat(true, is(true));

    }
    @Test
    void NegativeWithHumcrestTest(){
        assertThat(true, is(false));

    }
    @Test
    @DisplayName("Some positive test")
    void SuccessWithHumcrestEndStepsTest(){
        step("Bad equal test", () ->
        assertThat(true, is(true)));

    }
    @Test
    @DisplayName("Some negative test")
    void NegativeWithHumcrestEndStepsTest(){
        step("Bad equal test", () ->
        assertThat(true, is(false)));

    }
}
