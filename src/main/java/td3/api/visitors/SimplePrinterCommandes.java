package td3.api.visitors;

public class SimplePrinterCommandes implements Visitor {
    @Override
    public void visit(GroupeClient groupeClient) {
        System.out.println("je visite un groupe");
    }

    @Override
    public void visit(Client client) {
        System.out.println(String.format("je visite un client %s", client.getName()));
    }

    @Override
    public void visit(Commande commande) {
        System.out.println(String.format("je visite une commande %s", commande.getName()));
    }

    @Override
    public void visit(Ligne ligne) {
        System.out.println(String.format("je visite une ligne %s", ligne.getName(), ligne.getSum()));
    }
}
