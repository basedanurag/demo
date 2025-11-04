package Com.example.ConstructorInjection;

public class Car {
    private Specifications specifications;



    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }

    public void getDispay() {
        System.out.println("Car details "+ specifications.toString());

    }
}
