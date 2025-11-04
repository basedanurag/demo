package Car.example.bean;

public class MyBean {
    private String message;
    public void setMessage(String message) {
        this.message = message;

    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }


}
