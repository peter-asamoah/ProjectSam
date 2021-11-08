package turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {
    public Register() {

    }

    List<Client> ClientRegister = new ArrayList<>();


    public void add (Client client){
        ClientRegister.add(client);
    }

    public List<Client> allClients(){
        return ClientRegister.stream().collect(Collectors.toList());
    }




   public List<Client> getGoldClients(){

        return ClientRegister
                .stream()
                .filter(b -> b.getServiceLevel().equals(ServiceLevel.Gold))
                .collect(Collectors.toCollection(this::getGoldClients));
   }
   public void getbyID(String id){

      Client james = ClientRegister.stream()
               .filter(customer -> id.equals(customer.getClientID()))
               .findAny()
               .orElse(null);
   }

   public void getCount(){
        Long goldcount = ClientRegister.stream()
                .filter(b -> b.getServiceLevel().equals(ServiceLevel.Gold))
                .count();
       Long premcount = ClientRegister.stream()
               .filter(b -> b.getServiceLevel().equals(ServiceLevel.Premium))
               .count();
       Long platcount = ClientRegister.stream()
               .filter(b -> b.getServiceLevel().equals(ServiceLevel.Platinum))
               .count();



   }

}
