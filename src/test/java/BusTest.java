import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void setup(){
        bus = new Bus("Wuhan", 20);
        busStop = new BusStop("C-19");
        person = new Person();
    }

    @Test
    public void canCountPassengers(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canPickUpPassengerFromQueue(){
        busStop.addPerson(person);
        bus.pickUpPerson(busStop);
        assertEquals(1, bus.countPassengers());
    }
}
