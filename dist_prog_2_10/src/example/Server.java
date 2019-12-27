package example;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] argv) {
        Object implementor = new Homework();
        String address = "http://localhost:9000/homework";
        Endpoint.publish(address, implementor);
    }
}
