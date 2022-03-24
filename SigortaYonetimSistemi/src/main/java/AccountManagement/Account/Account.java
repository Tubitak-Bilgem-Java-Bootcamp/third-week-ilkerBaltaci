package AccountManagement.Account;

import Models.Address.Address;
import Models.AuthenticationStatus;
import Models.Insurance.Insurance;
import Models.User.User;
import Util.AddressManager;

import java.util.Objects;

public abstract class Account {
    private User user;
    private AuthenticationStatus authenticationStatus;

    public Account(User user) {
        this.user = user;
        this.authenticationStatus = AuthenticationStatus.FAIL;
    }

    public void login(String email, String password)
    {

    }

    public void addAddress(Address address)
    {
        AddressManager.addAdress(this.user, address);
    }

    public void removeAddress(Address address)
    {
        AddressManager.removeAddress(this.user, address);
    }

    public boolean isLogin()
    {
        if(this.authenticationStatus == AuthenticationStatus.SUCCESS){
            return true;
        } else {
            return false;
        }
    }

    public abstract void addInsurance(Insurance insurance);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return user.equals(account.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }
}
