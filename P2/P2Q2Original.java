package P2;

class Staff {
    private String name;
    private int id;
    private String title;
    private String address1;
    private String address2;
    private String address3;

    public String GetAddress() {
        String fulladdress;
        fulladdress = address1 + “,” + address2 + “,” + address3;
        return fulladdress;
    }
} // end of class

//Staff may consist of more than one address.
