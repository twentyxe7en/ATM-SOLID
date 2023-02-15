package atm;
public class Authentication {

    public Authentication() {
    }
    
    public boolean login(int log_id, int log_key, int acc_id, int acc_key) {
        if (acc_id == log_id && acc_key == log_key) {
            return true;
        } else {
            System.out.println("Account didn't match or does not exist.");
        }
        return false;
    }
}
