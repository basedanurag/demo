package Car.example.bean;

public class MyBean {
    private String message;
    private String message2;
    public void setMessage(String message) {
        this.message = message;

    }
    public void setMessage2(String message2) {
        this.message2 = message2;

    }


    public String toString1() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}' ;
    }
    public String toString2() {
        return  "MyBean{" +
                "message='" + message2 + '\'' +
                '}';
    }



}
