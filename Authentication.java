package atm;

import java.util.ArrayList;

public class Authentication {

    public Authentication() {
    }
    
    public boolean login(int entry_id, int entry_key, ArrayList<Integer> db_id, ArrayList<Integer> db_key) {
        for (int i = 0; i < db_id.size(); i++) {
            if (db_id.get(i) == entry_id && db_key.get(i) == entry_key) {
                return true;
            }
        }
        System.out.println("Entry did not match or account does not exist.");
        return false;
    }
}
