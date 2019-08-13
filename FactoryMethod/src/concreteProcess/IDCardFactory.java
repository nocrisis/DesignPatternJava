package concreteProcess;

import framework.Factory;
import framework.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*ConcreteCreator，属于具体加工*/
public class IDCardFactory extends Factory {
    private Map<Integer, String> idToOwners = new LinkedHashMap<>();
    private int id = 100;
    @Override

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner,id++);
    }

    @Override
    protected void registerProduct(Product product) {
        idToOwners.put(((IDCard) product).getId(),((IDCard) product).getOwner());
    }

    public Map<Integer, String> getIdToOwners() { return idToOwners; }
}
