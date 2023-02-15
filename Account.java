package atm;

import java.util.ArrayList;

public class Account {

    public Account() {
        id.add(1234);
        key.add(5678);
        savings.add(10000.00);
    }
    
    ArrayList<Integer> id = new ArrayList<>();
    ArrayList<Integer> key = new ArrayList<>();
    ArrayList<Double> savings = new ArrayList<>();

    public ArrayList<Integer> getId() {
        return id;
    }

    public ArrayList<Integer> getKey() {
        return key;
    }

    public ArrayList<Double> getSavings() {
        return savings;
    }

    public void setSavings(ArrayList<Double> savings) {
        this.savings = savings;
    }
    
    
    
    public void addAccount(Integer id, Integer key) {
        this.id.add(id);
        this.key.add(key);
        savings.add(10000.00);
    }
    
    public void removeAccount(Integer id, Integer key) {
        for (int i = 0; i < this.id.size(); i++) {
            if (this.id.get(i) == id && this.key.get(i) == key) {
                this.id.remove(i);
                this.key.remove(i);
                savings.remove(i);
            }
        }
    }
    
}
