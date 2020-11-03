package td3.api.visitors;

import td3.api.commandes.Client;
import td3.api.commandes.Commande;
import td3.api.commandes.GroupeClient;
import td3.api.commandes.Ligne;

public class XMLRapportCommandes implements PrePostVisitor {

    @Override
    public void preVisit(GroupeClient groupeClient) {
        System.out.println("<groupe>");
        for (Client c : groupeClient.getClients()) c.accept(this);
    }

    @Override
    public void preVisit(Client client) {
        System.out.println("<client name=\"" + client.getName() + "\">");
        for (Commande c : client.getCommandes()) c.accept(this);
    }

    @Override
    public void preVisit(Commande commande) {
        System.out.println("<commande name=\"" + commande.getName() + "\">");
        for (Ligne l : commande.getLignes()) l.accept(this);
    }

    @Override
    public void preVisit(Ligne ligne) {
        System.out.println("<ligne name=\"" + ligne.getName() + "\" sum=\"" + ligne.getSum() + "\"/>");
    }

    @Override
    public void postVisit(Client client) {
        System.out.println("</client>");
    }

    @Override
    public void postVisit(Commande commande) {
        System.out.println("</commande>");
    }

    @Override
    public void postVisit(Ligne ligne) {
    }

    @Override
    public void postVisit(GroupeClient groupeClient) {
        System.out.println("</groupe>");
    }
}
