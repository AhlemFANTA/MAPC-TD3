package td3.api.visitors;

import td3.api.commandes.Client;
import td3.api.commandes.Commande;
import td3.api.commandes.GroupeClient;
import td3.api.commandes.Ligne;

import java.util.HashMap;
import java.util.Map;

public class SimplePrinterCommandes implements Visitor {

    private Map<String, Integer> info; // associe a un client la somme dû
    private int sommeCourante;

    public SimplePrinterCommandes() {
        this.info = new HashMap<>();
        this.sommeCourante = 0;
    }

    @Override
    public void visit(GroupeClient groupeClient) {
        for (Client c : groupeClient.getClients()) {
            c.accept(this);
            System.out.println(String.format("Le client %s doit %d", c.getName(), info.get(c.getName())));
        }
    }

    @Override
    public void visit(Client client) {
        sommeCourante = 0;
        for (Commande commande : client.getCommandes()) commande.accept(this);
        info.put(client.getName(), sommeCourante);
    }

    @Override
    public void visit(Commande commande) {
        for (Ligne l : commande.getLignes()) l.accept(this);
    }

    @Override
    public void visit(Ligne ligne) {
        sommeCourante+= ligne.getSum();
    }
}
