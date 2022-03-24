package Util;

import Models.Address.Address;
import Models.User.User;

public class AddressManager {

    public static void addAdress(User user, Address address)
    {
        user.setAddress(address);
    }

    public static void removeAddress(User user, Address address)
    {
        user.setAddress(address);
    }
}
