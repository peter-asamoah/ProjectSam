package turntabl;

public abstract class Client {
   public String clientName;
   public String ClientID;
    ServiceLevel ServiceLevel;

    public Client(String clientID, ServiceLevel serviceLevel,String clientName) {
        this.clientName = clientName;
        ClientID = clientID;
        ServiceLevel = serviceLevel;
    }

    public Client(String clientID, ServiceLevel serviceLevel) {
        ClientID = clientID;
        ServiceLevel = serviceLevel;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientID() {
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
