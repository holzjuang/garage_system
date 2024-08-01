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
    public void removeClient(int indice) {
        if(clients.size() > 0) {
            clients.remove(indice - 1);

            System.out.println("\nCliente removido com sucesso!");
        } else {
            System.out.println("\nNão ha clientes para remover.");
        }
    }
    public void listClients() {
        if(clients.size() > 0) {
            int i = 1;
            for(var client : clients) {
                System.out.println("\nCliente N° " + i);
                System.out.println(client);

                i++;
            }
        } else {
            System.out.println("\nNenhum cliente cadastrado.");
        }
    }
}
