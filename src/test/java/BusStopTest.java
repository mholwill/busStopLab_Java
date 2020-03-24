import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    
    private BusStop busStop;
    
    @Before
    public void before(){
        busStop = new BusStop("Waverley");

    }
    
    @Test
    public void busStopStartsEmpty() {
        assertEquals(0, busStop.getNumberInQueue());
    }

}
