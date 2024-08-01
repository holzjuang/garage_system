package entities;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Client> clients = new ArrayList<>();

    public Parking() {
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addNewClient(Client client) {
        clients.add(client);
    }
    public void removeClient() {

    }
    public void listClients() {
        int i = 1;
        for(var client : clients) {
            System.out.println("Cliente N° " + i);
            System.out.println(client);

            i++;
        }
    }
}
