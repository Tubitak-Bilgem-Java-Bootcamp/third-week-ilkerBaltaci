package AccountManagement;

import AccountManagement.Account.Account;
import AccountManagement.Account.Enterprise;
import Models.Address.Address;
import Models.Address.BusinessAddress;
import Models.Address.HomeAddress;
import Models.Exceptions.InvalidAuthenticationException;
import Models.User.User;

import java.util.Scanner;

public class Main {

    public static AccountManager accountManager;

    static {
        User user1 = new User("İlker", "Baltacı", "ilkerbaltaci@gmail.com", "1234", "Software Engineer", 23);
        User user2 = new User("Oktay", "Adalıer", "oktayadalier@gmail.com", "oktay123", "Big Boss", 53);
        User user3 = new User("İlknur", "Baltacı", "ilknurbaltaci@gmail.com", "ilknur123", "Accountant", 34);
        User user4 = new User("Feyza", "Birinci", "feyzabirinci@gmail.com", "feyzamm", "Doctor", 23);
        User user5 = new User("Enis", "Arıcı", "enisarici@gmail.com", "enis123", "Software Engineer", 23);
        accountManager = new AccountManager();

        accountManager.addAccount(new Enterprise(user1));
        accountManager.addAccount(new Enterprise(user2));
        accountManager.addAccount(new Enterprise(user3));
        accountManager.addAccount(new Enterprise(user4));
        accountManager.addAccount(new Enterprise(user5));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Email Adresiniz: ");
        String inputEmail = scanner.nextLine();
        System.out.print("Şifreniz: ");
        String password = scanner.nextLine();

        try {
            Account account = accountManager.login(inputEmail, password);
            account.user.setAddress(new HomeAddress("İstanbul", "Ihlamurkuy Mah.", "Taşkent Sk.", "Deniz Apt."));
            account.user.setAddress(new BusinessAddress("Kocaeli", "Gebze.", "1823/2. Sk..", "Tübitak"));
            if(account.isLogin())
            {
                System.out.println("Şifre ve Email doğru!!");
            }
            showUserInfos(account);


        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showUserInfos(Account account){
        System.out.println("- Kullacını Bilgileri");
        System.out.println("Ad: " + account.user.getName());
        System.out.println("Soyad: " + account.user.getLastName());
        System.out.println("Son Giriş: " + account.user.getLastLoginDate().toString());
        System.out.println("Email: " + account.user.getEmail());
        System.out.println("Meslek: " + account.user.getProfession());
        System.out.println("Adressler: ");
        if(account.user.getAddressList().size() == 0)
        {
            System.out.println("- Yok");
        }
        for(Address address : account.user.getAddressList()){
            System.out.print("- " + address.getAddress());
            System.out.println();
        }


    }
}
