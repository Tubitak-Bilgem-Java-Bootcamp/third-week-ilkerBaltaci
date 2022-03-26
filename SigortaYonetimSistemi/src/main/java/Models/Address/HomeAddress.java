package Models.Address;

public class HomeAddress implements Address{
    private String city;
    private String town;
    private String street;
    private String apartment;

    public HomeAddress(String city, String town, String street, String apartment) {
        this.city = city;
        this.town = town;
        this.street = street;
        this.apartment = apartment;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getApartment() {
        return apartment;
    }

    @Override
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String getAddress() {
        String address = getTown() + " " + getStreet() + " " + getApartment() + " " + getCity();
        return address;
    }
}
