package AccountManagement.Account;

import Models.Insurance.Insurance;
import Models.User.User;

public class Enterprise extends Account {
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {

    }
}
