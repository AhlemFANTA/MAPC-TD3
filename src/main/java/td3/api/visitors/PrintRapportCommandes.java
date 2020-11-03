package td3.api.visitors;

import td3.api.commandes.Client;
import td3.api.commandes.Commande;
import td3.api.commandes.GroupeClient;
import td3.api.commandes.Ligne;

public class PrintRapportCommandes implements Visitor {

    @Override
    public void visit(GroupeClient groupeClient) {
        System.out.println(String.format("je visite un groupeClient %s", groupeClient.getName()));
    }

    @Override
    public void visit(Client client) {
        System.out.println(String.format("je visite un client %s", client.getName()));
    }

    @Override
    public void visit(Commande commande) {
        System.out.println(String.format("je visite une commande %s", commande.toString()));
    }

    @Override
    public void visit(Ligne ligne) {
        System.out.println(String.format("je visite une ligne %s", ligne.toString()));
    }
}
