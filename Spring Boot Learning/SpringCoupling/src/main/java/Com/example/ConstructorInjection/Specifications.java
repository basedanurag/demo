package Com.example.ConstructorInjection;

public class Specifications {
    private String model;
    private String make;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Specifications{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
