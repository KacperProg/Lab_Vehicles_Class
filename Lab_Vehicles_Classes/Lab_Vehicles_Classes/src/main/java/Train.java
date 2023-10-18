public class Train extends Vehicle{

    private String travelType;
    public Train(String name) {
        super(name);
        this.travelType = "Rail";
    }

    @Override
    public String makeSound(){
        return "CHOO CHOO!";
    }



}
