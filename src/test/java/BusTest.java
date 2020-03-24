import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("Leith", 1);
        person = new Person();
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassengerIfNotfull() {
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void cantAddPassengerIfFull() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getNumberOfPassengers());
    }
}
