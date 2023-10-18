public class Car extends Vehicle{
    private boolean hasMOT;
    public Car(String name) {
        super(name);
    }

    @Override
    public String makeSound(){
        return "HONK HONK!";
    }

    public String makeStatement(){
        return "Hi my name is " + this.name();
    }

    private String name() {
        return this.name;
    }

    public boolean isHasMOT() {
        return hasMOT;
    }

    public void setHasMOT(boolean hasMOT) {
        this.hasMOT = hasMOT;
    }
}
