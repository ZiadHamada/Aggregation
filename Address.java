public class Address {
    private int streetNO;
    private String city;
    private String country;

    public Address(){

    }
    public Address(int streetNO, String city, String country){
        this.streetNO = streetNO;
        this.city = city;
        this.country = country;
    }
    public void setStreetNO(int streetNO){
        this.streetNO = streetNO;
    }
    public int getStreetNO(){
        return streetNO;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
}
