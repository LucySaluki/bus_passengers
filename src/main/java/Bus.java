import java.util.ArrayList;

public class Bus {

    private String destination;
    private ArrayList<Person> passengers;
    private int capacity;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity=capacity;
        this.passengers= new ArrayList<>();
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (checkFullCapacity()) {
            this.passengers.add(person);
        }
    }

    public boolean checkFullCapacity(){
        if (this.passengerCount()<this.capacity) {
            return true;
        } else {
            return false;
        }
    }

    public void removePassenger(Person person){
        this.passengers.remove(person);
    }

    public void pickUp(BusStop busStop){
            Person personRemoved = busStop.removeFromQueue();
            this.addPassenger(personRemoved);
    }

}
