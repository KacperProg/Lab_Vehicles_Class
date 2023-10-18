public abstract class Vehicle {
    protected String name;
    protected int noWheels;
    protected int maxOccupancy;
    protected boolean publicTravel;
    protected double cost;
    protected String travelType;
    public Vehicle(String name){
        this.name = name;
    }

    public String makeSound(){
        return "Hi, I'm Vehicle " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoWheels() {
        return noWheels;
    }

    public void setNoWheels(int noWheels) {
        this.noWheels = noWheels;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public boolean isPublicTravel() {
        return publicTravel;
    }

    public void setPublicTravel(boolean publicTravel) {
        this.publicTravel = publicTravel;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }
}
