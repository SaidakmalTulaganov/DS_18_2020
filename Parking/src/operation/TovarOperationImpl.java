package operation;

import java.util.ArrayList;
import java.util.List;
import types.Tovar;

public class TovarOperationImpl implements TovarOperation{
    static List<Tovar> lstTovar = new ArrayList<Tovar>();
    static {
        lstTovar.add(new Tovar("1 этаж", 10, 10, 300, "Ставь на 10 часов, 11 - й бесплатно"));
        lstTovar.add(new Tovar("2 этаж", 20, 20, 400, "Ставь на 10 часов, 11 - й бесплатно"));
        lstTovar.add(new Tovar("3 этаж", 30, 30, 500, "Ставь на 10 часов, 11 - й бесплатно"));
        lstTovar.add(new Tovar("4 этаж", 40, 40, 600, "Ставь на 10 часов, 11 - й бесплатно"));
    }
    @Override
    public List<Tovar> getListOfTovar() {
        return lstTovar;
    }

    @Override
    public List<Tovar> addNewTovar(Tovar item) {
        lstTovar.add(item);
        return lstTovar;
    }

    @Override
    public int getSumOfTovar() {
        int sum = 0;
        for(Tovar tovar: lstTovar) {
            sum += tovar.getClock() * tovar.getPrice();
        }
        return sum;
    }
    
}

