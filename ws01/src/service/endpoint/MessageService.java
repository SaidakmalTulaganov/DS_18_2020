package service.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class MessageService {
    @WebMethod()
    public String getMessage() {
        return "Сообщение от веб-сервиса";
    }
}
