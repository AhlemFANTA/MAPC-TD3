package td3.api.visitors;

public class Client implements Visitable, PrePostVisitable {
    private  String name;

    public Client(String name) {
        this.name = name;
    }
    void addCommande(Commande commande){
    }
    void addLigne(Ligne ligne, String name){
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    @Override
    public void accept(Visitor visitor) {

    }
}
