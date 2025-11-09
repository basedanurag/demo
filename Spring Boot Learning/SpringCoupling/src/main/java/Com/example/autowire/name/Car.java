package Com.example.autowire.name;

public class Car {
    private Specifications specifications;
    // as we dont need a constructor for this one

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }

    public void getDispay() {
        System.out.println("Car details "+ specifications.toString());

    }
}
