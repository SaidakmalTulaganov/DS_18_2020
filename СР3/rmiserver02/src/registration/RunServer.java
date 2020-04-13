package registration;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import operation.TovarOperationImpl;

public class RunServer {
    public static void main (String[] argv) {
        try {
            TovarOperationImpl operationImpl = new TovarOperationImpl();
            Registry registry = LocateRegistry.createRegistry(1199);
            registry.bind("rmiTest02", operationImpl);
            System.out.println ("Tovar Server is ready.");
        } catch (Exception e) {
            System.out.println ("Tovar Server failed: " + e);
        }
    }
}
