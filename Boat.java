public class Boat extends Vehicle {

    public Boat(String name) {
        super(name);
    }

    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}