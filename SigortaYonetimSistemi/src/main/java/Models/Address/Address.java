package Models.Address;

public interface Address {

    String getCity();
    void setCity(String city);
    String getTown();
    void setTown(String town);
    String getStreet();
    void setStreet(String street);
    String getApartment();
    void setApartment(String apartment);

    String getAddress();

}
