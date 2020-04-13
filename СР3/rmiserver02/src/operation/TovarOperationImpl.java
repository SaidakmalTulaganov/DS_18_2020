package operation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import types.Tovar;

public class TovarOperationImpl extends UnicastRemoteObject implements TovarOperation{
    static List<Tovar> lstTovar = new ArrayList<Tovar>();
    static{
        lstTovar.add(new Tovar("1 этаж", 10, 10, 300, "Ставь на 10 часов, 11 - й бесплатно"));
        lstTovar.add(new Tovar("2 этаж", 20, 20, 400, "Ставь на 10 часов, 11 - й бесплатно"));
        lstTovar.add(new Tovar("3 этаж", 30, 30, 500, "Ставь на 10 часов, 11 - й бесплатно"));
        lstTovar.add(new Tovar("4 этаж", 40, 40, 600, "Ставь на 10 часов, 11 - й бесплатно"));
    }
    public TovarOperationImpl() throws RemoteException{
    }
    @Override
    public List<Tovar> getListOfTovar() throws RemoteException{
        return lstTovar;
    }
    @Override
    public List<Tovar> addNewTovar(Tovar tovar) throws RemoteException{
        lstTovar.add(tovar);
        return lstTovar;
    }
    @Override
    public int getSumOfTovar() throws RemoteException{
        int sum = 0;
        for(Tovar tovar: lstTovar)
            sum += tovar.getSumma();
        return sum;
    }
}
