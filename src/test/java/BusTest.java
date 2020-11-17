import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusTest {

    private Bus bus;
    private People people;

    @Before
    public void setup(){
        bus = new Bus("Wuhan", 20);
    }

    @Test
    public void canCountPassengers(){
        assertEquals(0, bus.countPassengers());
    }
}
