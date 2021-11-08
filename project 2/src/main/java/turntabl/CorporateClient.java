package turntabl;

public class CorporateClient extends Client{

    public String AccountManagerName;
    public String CorporateName;

    public CorporateClient( int clientID, ServiceLevel serviceLevel,String clientName,String accountmanagerName) {
        super( clientID, serviceLevel);
         AccountManagerName = accountmanagerName ;
    }

    @Override
    public String getClientName() {
        return AccountManagerName;
    }


    @Override
    public String toString() {
        return "CorporateClient{" +
                "AccountManager='" + AccountManagerName + '\'' +
                '}';
    }
}
