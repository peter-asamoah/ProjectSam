package turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getGoldClients() {

        Register turntable = new Register();
        Client PeteC = new CorporateClient(5415,ServiceLevel.Gold,"PeteC", "MAnagerPeter");
        Client kofiC = new CorporateClient(5415,ServiceLevel.Platinum,"kofiC", "MAnagerkofi");
        Client turksonC = new CorporateClient(5415,ServiceLevel.Gold,"turksonC", "MAnagerturkson");
        Client Peter = new PrivateClient(5415,ServiceLevel.Premium,"Peter" );
        Client kofi = new PrivateClient(5415,ServiceLevel.Gold,"kofi" );


        turntable.add( PeteC);
        turntable.add( kofiC);
        turntable.add( turksonC);
        turntable.add( Peter);
        turntable.add( kofi);

//        turntable.getGoldClients();
        turntable.allClients();


    }
}