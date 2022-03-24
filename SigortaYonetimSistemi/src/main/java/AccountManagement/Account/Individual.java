package AccountManagement.Account;

import Models.Insurance.Insurance;
import Models.User.User;

public class Individual extends Account{
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {

    }
}
