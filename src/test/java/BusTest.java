import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void setup(){
        bus = new Bus("Wuhan", 2);
    }

    @Test
    public void canCountPassengers(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(1, bus.countPassengers());
    }



}
