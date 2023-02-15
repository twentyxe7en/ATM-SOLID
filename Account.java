package atm;
public class Account {

    public Account(int id, int key) {
        this.id = id;
        this.key = key;
        this.savings = 10000;
    }
    
    private int id;
    private int key;
    private double savings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }
    
    
}
