import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;
    private Person person;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int countQueue(){
        return this.queue.size();
    }

    public void addPerson(Person person){
        this.queue.add(person);
    }

}
