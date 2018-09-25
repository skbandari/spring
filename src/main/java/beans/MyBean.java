package beans;

public class MyBean {
    private String message;

    public MyBean(String message) {
        this.message = message;
    }

    public void hello() {
        System.out.println(message);
    }
}
