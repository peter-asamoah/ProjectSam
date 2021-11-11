package turntabl;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

        Accountmanager kwame = new Accountmanager("Kwame");


        List<Client> ClientRegister = List.of(
                new CorporateClient(5415, ServiceLevel.Gold, "PeteC", kwame),
                new CorporateClient(4415, ServiceLevel.Platinum, "kofiC", kwame),
                new CorporateClient(5465, ServiceLevel.Gold, "turksonC", kwame),
                new PrivateClient(5425, ServiceLevel.Premium, "Peter"),
                new PrivateClient(5415, ServiceLevel.Gold, "kofi")
        );

        Register turntable = new Register(ClientRegister);

    @Test
    void getGoldClients() {
        System.out.println(turntable.getGoldClients());

    }

    @Test
    void levelCount(){
       turntable.getCount();

    }
    @Test
    void getbyID(){
        turntable.getbyID(4415);

    }
}