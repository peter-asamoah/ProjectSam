package turntabl;

public class Accountmanager {
    public String clientName;


    public Accountmanager(String clientName) {
        this.clientName = clientName;

    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }


    @Override
    public String toString() {
        return "Accountmanager{" +
                "clientName='" + clientName + '\'' +
                '}';
    }
}
