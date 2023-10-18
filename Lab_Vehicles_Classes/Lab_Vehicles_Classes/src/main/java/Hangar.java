
import java.util.ArrayList;

public class Hangar {

    private ArrayList<Vehicle> vehicles;

    public Hangar(){
        this.vehicles = new ArrayList<>();
    }

    public void addVehicles(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public int countVehicles(){
        return this.vehicles.size();
    }
}
