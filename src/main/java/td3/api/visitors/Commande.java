package td3.api.visitors;

public class Commande implements Visitable, PrePostVisitable{
    private  String name;

    public Commande(String name) {
        this.name = name;
    }
    void addLigne(Ligne ligne){
    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }
}
