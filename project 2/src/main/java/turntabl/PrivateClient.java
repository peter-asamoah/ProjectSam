package turntabl;

public class PrivateClient extends Client {

    public PrivateClient( int clientID, ServiceLevel serviceLevel,String clientName) {
        super( clientID, serviceLevel,clientName);
    }

    @Override
    public String toString() {
        return "PrivateClient{}";
    }
}
