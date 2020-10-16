import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 100600;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 100600;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNotRegisteredAndULimit() {
        BonusService service = new BonusService();

        long amount = 999999;
        boolean registered = true;
        long expected = 299;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndULimit() {
        BonusService service = new BonusService();

        long amount = 999999;
        boolean registered = false;
        long expected = 99;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
}