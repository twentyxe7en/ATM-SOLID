package atm;

import java.util.ArrayList;

public class Process {

    public Process() {
    }
    
    public double deposit(double in, int eid, int ekey, ArrayList<Integer> id, ArrayList<Integer> key, ArrayList<Double> sav) {
        double dep = 0;
        for (int i = 0; i < id.size(); i++) {
            if (id.get(i) == eid && key.get(i) == ekey) {
                sav.set(i, sav.get(i) + in);
            }
            dep = sav.get(i);
        }
        return dep;
    }
    
    public double withdraw(double out, int eid, int ekey, ArrayList<Integer> id, ArrayList<Integer> key, ArrayList<Double> sav) {
        double wd = 0;
        
        for (int i = 0; i < id.size(); i++) {
            if (id.get(i) == eid && key.get(i) == ekey) {
                if (sav.get(i) > out) {
                    sav.set(i, sav.get(i) - out);
                } else {
                    System.out.println("Insufficient savings.");
                }
                wd = sav.get(i);
            }
        }
        
        return wd;
    }
}
