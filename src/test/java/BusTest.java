import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh",3);
        person = new Person();
        busStop = new BusStop("Princes Street");
        busStop.addToQueue(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void checkNumberOfPassengers(){
        bus.addPassenger(person);
        assertEquals(1,bus.passengerCount());
    }

    @Test
    public void cantAddPassengerFullCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(false,bus.checkFullCapacity());
    }
    @Test
    public void canAddPassengerBusNotFullCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(true,bus.checkFullCapacity());
    }
    @Test
    public void removePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
//        assertFalse(bus.getPassengers().contains(person));
        assertEquals(1, bus.passengerCount());
    }
    @Test
    public void canPickUpPassenger(){
        bus.pickUp(busStop);
        assertEquals(1, bus.passengerCount());
    }

}
