import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name=name;
        this.queue = new ArrayList<>();
    }

    public int queueCount(){
        return this.queue.size();
    }

    public void addToQueue(Person person){
        this.queue.add(person);
    }

    public Person removeFromQueue(){
        Person personRemoved = null;
        if(this.queueCount() > 0){
            personRemoved = this.queue.remove(0);
        }
        return personRemoved;
    }
}