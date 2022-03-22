package Models.User;

import Models.Address.Address;

import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String profession;
    private int age;
    private List<Address> addressList;
    private Date lastLoginDate;
}
