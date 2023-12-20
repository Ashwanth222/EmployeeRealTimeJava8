public class Address {
    public String city;
    public long pincode;
    public String state;

    public Address(String city, long pincode, String state) {
        this.city = city;
        this.pincode = pincode;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                ", state='" + state + '\'' +
                '}';
    }
}
