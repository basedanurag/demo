package Com.example.autowire.Constructor;

public class Car {
    private Specifications specifications;
    // as we dont need a constructor for this one
    public  Car(Specifications specifications) {
        this.specifications = specifications;
    }

//   public void setSpecifications(Specifications specifications) {
//        this.specifications = specifications;
//    }

    public void getDispay() {
        System.out.println("Car details "+ specifications.toString());

    }
}
