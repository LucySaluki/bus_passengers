import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop=new BusStop("Princes Street");
        person = new Person();
    }

    @Test
    public void busStopStartsEmpty(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void checkQueueNumbers(){
        busStop.addToQueue(person);
        assertEquals(1,busStop.queueCount());
    }

    @Test
    public void removePersonFromQueue() {
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(0, busStop.queueCount());
    }


}
