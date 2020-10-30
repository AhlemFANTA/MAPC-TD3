package td3.api.visitors;

import td3.api.commandes.Client;
import td3.api.commandes.Commande;
import td3.api.commandes.GroupeClient;
import td3.api.commandes.Ligne;

public class XMLRapportCommandes implements PrePostVisitor {
    @Override
    public void preVisit(GroupeClient groupeClient) {
        System.out.println("<groupe>");
    }

    @Override
    public void preVisit(Client client) {
        System.out.println("<client name=\""+client.getName()+"\">");
    }

    @Override
    public void preVisit(Commande commande) {
        System.out.println("<commande name=\""+commande.getName()+"\">");
    }

    @Override
    public void preVisit(Ligne ligne) {
        System.out.println("<ligne name=\""+ligne.getName()+"\" sum"+ligne.getSum()+ "/>");
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
        System.out.println("</ligne>");
    }

    @Override
    public void postVisit(GroupeClient groupeClient) {
        System.out.println("</groupe>");
    }
}
