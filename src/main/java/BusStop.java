import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int getNumberInQueue() {
        return this.queue.size();
    }

    public void addPerson(Person person) {
        this.queue.add(person);
    }

    public Person removePerson(){
        if (this.queue.size() == 0) {
            return null;
        } else {
            return this.queue.remove(0);
        }
    }
}
