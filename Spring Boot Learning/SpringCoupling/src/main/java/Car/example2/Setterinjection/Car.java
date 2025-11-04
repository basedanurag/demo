package Car.example2.Setterinjection;

public class Car {
    private Specifications specifications;


    public void getDispay() {
        System.out.println("Car details "+ specifications.toString());

    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }
}
