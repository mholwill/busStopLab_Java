import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    
    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Waverley");
        person = new Person();
    }

    @Test
    public void busStopStartsEmpty() {
        assertEquals(0, busStop.getNumberInQueue());
    }

    @Test
    public void canAddPassengerToQueue() {
        busStop.addPerson(person);
        assertEquals(1, busStop.getNumberInQueue());
    }

    @Test
    public void canRemovePassenger(){
        busStop.addPerson(person);
        Person passenger = busStop.removePerson();
        assertEquals(person, passenger);
        }

}
