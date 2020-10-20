package td3.api.main;

import td3.api.visitors.*;

public class Main {
    private  final GroupeClient groupeClient;
    private AbstractVisitor visitor;

    public Main(String nomGroup) {
        this.groupeClient = new GroupeClient(nomGroup);
    }

    public Main(String nomGroup, AbstractVisitor v) {
        this(nomGroup);
        this.visitor = v;
    }

    public void setVisitor(AbstractVisitor v) {
        this.visitor = v;
    }

    public static void main(String[] args) throws MyException {
        AbstractVisitor xmlVisitor = new XMLRapportCommandes();
        AbstractVisitor printVisitor = new PrintRapportCommandes();
        AbstractVisitor simpleVisitor = new SimplePrinterCommandes();

        Main m = new Main("clients");

        Client c1 = new Client("bob");
        Client c2 = new Client("Joe");
        m.groupeClient.addClient(c1);
        m.groupeClient.addClient(c1);
        m.groupeClient.addClient(c1);

        Commande commande1 = new Commande("commande1");
        Commande commande2 = new Commande("commande2");
        Commande commande3 = new Commande("commande3");

        m.groupeClient.addCommande("bob", commande1);
        m.groupeClient.addCommande("bob", commande2);
        m.groupeClient.addCommande("joe", commande3);

        m.setVisitor(printVisitor);
        m.groupeClient.accept((PrePostVisitor) m.visitor);

    }
}
