

import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int countPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        if(this.passengers.size() < this.capacity)
        this.passengers.add(person);
    }

    public Person removePassenger(){
        return this.passengers.remove(0);
    }

    public void pickUpPerson(BusStop busStop){
        if(busStop.countQueue() > 0){
            Person person = busStop.removePerson();
            this.addPassenger(person);
        }
    }


}
