package P2;

class Address {
    String addressLine;
    String city;
    String postcode;
    String country;

    public String getAddress() {
        return this.addressLine + "," + this.city + "," + this.postcode + "," + this.country;
    }
}

class Staff {
    private String name;
    private int id;
    private String title;
    private Address workAddress;
    private Address homeAddress;

    public String GetAddress() {
        return this.homeAddress.getAddress();
    }
}
