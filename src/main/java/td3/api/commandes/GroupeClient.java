package td3.api.commandes;

import td3.api.exceptions.MonException;
import td3.api.visitors.PrePostVisitable;
import td3.api.visitors.PrePostVisitor;
import td3.api.visitors.Visitable;
import td3.api.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;


public class GroupeClient implements PrePostVisitable, Visitable {
    private String name;
    private Map<String, Client> clients;
    private Map<String, Commande> commandes;

    public GroupeClient(String name) {
        this.name = name;
        clients = new HashMap<>();
        commandes = new HashMap<>();
    }

    public void addClient(Client client) {
        clients.put(client.getName(), client);
    }

    public void addCommande(String clientName, Commande commande) //throws MonException
    {
        Client c = clients.get(clientName);
        if (c.getName().equals(clientName)) commandes.put(commande.getName(),commande);
    }

    public void addLigne(String clientName, String commandeName, Ligne ligne) //throws MonException
    {
        Client c = clients.get(clientName);
        Commande co = commandes.get(commandeName);
        if (co.getName().equals(commandeName) ) {
            co.addLigne(ligne);
        }
        c.addCommande(co);
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Client client : clients.values()) client.accept(visitor);
    }

    @Override
    public String toString() {
        return "GroupeClient{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }
}
