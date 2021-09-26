



public class WaterOfLife {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setPhone(792734482);
        client1.setStreet("Чистопольская");
        System.out.println("Номер клиента: " + client1.getPhone());
        System.out.println("Адрес клиента: " + client1.getStreet());
    }
}

class Client {
    private int phone;
    private String street;
    private int house;
    private int appartment;


    public void setPhone(int phoneNumber){
        phone = phoneNumber;
    }

    public int getPhone(){
        return phone;
    }
    public void setStreet(String streetAdress){
        street = streetAdress;
    }

    public String getStreet(){
        return street;
    }

}
class Bottle {
    private String bottleType;
    private int bottleQuantity;
}