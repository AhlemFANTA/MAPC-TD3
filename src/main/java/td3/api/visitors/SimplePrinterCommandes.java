package td3.api.visitors;

import td3.api.commandes.Client;
import td3.api.commandes.Commande;
import td3.api.commandes.GroupeClient;
import td3.api.commandes.Ligne;

import java.util.HashMap;
import java.util.Map;

public class SimplePrinterCommandes implements Visitor {

    private Map<String, Integer> info;
    private int sommeCourante;

    public SimplePrinterCommandes() {
        this.info = new HashMap<>();
        this.sommeCourante = 0;
    }

    @Override
    public void visit(GroupeClient groupeClient) {
        for(String k: info.keySet()){
            System.out.println(String.format("Le client %s doit %d", k, info.get(k)));
        }
    }

    @Override
    public void visit(Client client) {
        info.put(client.getName(), sommeCourante);
        sommeCourante = 0;
    }

    @Override
    public void visit(Commande commande) {
        System.out.println(String.format("je visite une commande %s", commande.getName()));
    }

    @Override
    public void visit(Ligne ligne) {
        sommeCourante+= ligne.getSum();
    }
}
