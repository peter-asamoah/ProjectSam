package turntabl;

public class PrivateClient extends Client {

    public PrivateClient( int clientID, ServiceLevel serviceLevel,String clientName) {
        super( clientID, serviceLevel,clientName);
    }
    public String getClientName() {
        return clientName;
    }
    public ServiceLevel getServiceLevel() {
        return ServiceLevel;
    }

    @Override
    public String toString() {
        return "PrivateClient{" +
                "clientName='" + clientName + '\'' +
                ", ClientID=" + ClientID +
                ", ServiceLevel=" + ServiceLevel +
                '}';
    }
}
