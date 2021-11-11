package turntabl;

public abstract class Client {
   public String clientName;
   public int ClientID;
    ServiceLevel ServiceLevel;
    public Client(int clientID, ServiceLevel serviceLevel,String clientName) {
        this.clientName = clientName;
        ClientID = clientID;
        ServiceLevel = serviceLevel;
    }

    public Client(int clientID, ServiceLevel serviceLevel) {
        ClientID = clientID;
        ServiceLevel = serviceLevel;
    }

    public abstract String getClientName();

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientID() {
        return ClientID;
    }

    public ServiceLevel getServiceLevel() {
        return ServiceLevel;
    }



    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", ClientID=" + ClientID +
                ", ServiceLevel='" + ServiceLevel + '\'' +
                '}';
    }
}
