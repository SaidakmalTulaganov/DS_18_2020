package registration;

import javax.xml.ws.Endpoint;
import service.endpoint.MessageService;

public class PublicWS {
    public static void main(String[] argv) {
        Endpoint.publish("http://localhost:8080/ws01/MessageService", new MessageService());
    }
}
