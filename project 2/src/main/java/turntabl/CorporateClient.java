package turntabl;

public class CorporateClient extends Client{

    Accountmanager AccountManagerName;
    public String CorporateClientName;

    public CorporateClient( int clientID, ServiceLevel serviceLevel,String clientName,Accountmanager accountmanagerName) {
        super( clientID, serviceLevel);
         AccountManagerName = accountmanagerName ;
         CorporateClientName =clientName;
    }


    public String getClientName() {
        return AccountManagerName.clientName;
    }


    @Override
    public String toString() {
        return "CorporateClient{" +
                ", ClientID=" + ClientID +
                ", ServiceLevel=" + ServiceLevel +
                ", AccountManagerName=" + AccountManagerName +
                ", CorporateClientName='" + CorporateClientName + '\'' +
                '}';
    }
}
