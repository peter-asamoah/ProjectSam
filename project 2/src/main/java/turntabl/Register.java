package turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {



    List<Client> ClientRegister = new ArrayList<>();

    public Register(List<Client> clientRegister) {
        ClientRegister = clientRegister;
    }


    public void add (Client client){
        ClientRegister.add(client);
    }

    public List<Client> allClients(){
        return new ArrayList<>(ClientRegister);
    }




   public List<Client> getGoldClients(){

        return ClientRegister
                .stream()
                .filter(b -> b.getServiceLevel().equals(ServiceLevel.Gold))
                .collect(Collectors.toList());
   }

   public void getbyID(int id){

//       Client james = ClientRegister.stream()
//               .filter(client -> id == client.getClientID())
//               .findAny()
//               .orElse(null);
       Optional<Client> matchingObject = ClientRegister.stream().
               filter(p -> p.getClientID()== id).
               findAny();
       System.out.println(matchingObject);

   }


    public void getCount() {
        Map<ServiceLevel, Long> collect =
                ClientRegister.stream().collect(Collectors.groupingBy(Client::getServiceLevel, Collectors.counting()));

            System.out.println(collect);


    }
}