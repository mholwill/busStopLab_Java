import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Leith", 1);
        busStop = new BusStop("Waverley");
        person = new Person();
        busStop.addPerson(person);
        busStop.addPerson(person);
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassengerIfNotfull() {
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void cantAddPassengerIfFull() {
        bus.pickUpPassenger(busStop);
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void cantAddPassengerIfBusStopEmpty() {
        Bus bigBus = new Bus("City Centre", 100);
        bigBus.pickUpPassenger(busStop);
        bigBus.pickUpPassenger(busStop);
        bigBus.pickUpPassenger(busStop);
        assertEquals(2, bigBus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.pickUpPassenger(busStop);
        bus.removePassenger();
        assertEquals(0, bus.getNumberOfPassengers());
    }
}
