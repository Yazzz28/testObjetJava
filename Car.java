public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais vroum vroum !";
    }
}