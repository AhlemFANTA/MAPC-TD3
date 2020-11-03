package td3.api.commandes;

import td3.api.visitors.PrePostVisitable;
import td3.api.visitors.PrePostVisitor;
import td3.api.visitors.Visitable;
import td3.api.visitors.Visitor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class GroupeClient implements PrePostVisitable, Visitable {
    private String name;
    private Map<String, Client> clients; // map nomClient --> client

    public GroupeClient(String name) {
        this.name = name;
        clients = new HashMap<>();

    }

    // Ajout un nouveau client au groupe
    public void addClient(Client client) {
        clients.put(client.getName(), client);
    }

    public Collection<Client> getClients() {
        return clients.values();
    }

    // Affecte une commande à un client identifié par son nom
    public void addCommande(String clientName, Commande commande) //throws MonException
    {
        Client c = clients.get(clientName);
        c.addCommande(commande);
    }

    // Affecte une ligne à une commande d'un client identifie, le tout identifie par leurs noms
    public void addLigne(String clientName, String commandeName, Ligne ligne) //throws MonException
    {
        Client c = clients.get(clientName);
        c.addLigne(commandeName, ligne);
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GroupeClient{" +
            "name='" + name + '\'' +
            ", clients=" + clients +
            '}';
    }
}
