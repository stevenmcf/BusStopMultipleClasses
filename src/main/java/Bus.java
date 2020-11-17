

import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<People> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int countPassengers(){
        return this.passengers.size();
    }
}
