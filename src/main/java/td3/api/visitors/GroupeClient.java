package td3.api.visitors;

import java.util.ArrayList;
import java.util.Collection;


public class GroupeClient implements PrePostVisitable{
    private String name;
    private static Collection<Client> clients = new ArrayList<>();

    public GroupeClient(String name) {
        this.name = name;
        clients = new  ArrayList<>();
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    public void addClient(Client c1) {
        clients.add(c1);
    }

    public void addCommande(String bob, Commande commande1) {
    }
}
