package td3.api.visitors;

import td3.api.commandes.Client;
import td3.api.commandes.Commande;
import td3.api.commandes.GroupeClient;
import td3.api.commandes.Ligne;

public interface PrePostVisitor extends AbstractVisitor {

    void preVisit(GroupeClient groupeClient);
    void preVisit(Client client);
    void preVisit(Commande commande);
    void preVisit(Ligne ligne);
    void postVisit(GroupeClient groupeClient);
    void postVisit(Client client);
    void postVisit(Commande commande);
    void postVisit(Ligne ligne);
}
