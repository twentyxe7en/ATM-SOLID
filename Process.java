package atm;
public class Process {

    public Process() {
    }
    
    public double deposit(double in, double sav) {
        
        return in + sav;
    }
    
    public double withdraw(double out, double sav) {
        if (sav > out)
            return sav - out;
        else
            System.out.println("You have insufficient funds.");
        return sav;
    }
}
