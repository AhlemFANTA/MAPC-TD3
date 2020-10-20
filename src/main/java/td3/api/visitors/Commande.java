package td3.api.visitors;

import java.util.HashMap;

public class Commande implements Visitable, PrePostVisitable{

    private final HashMap<String, Ligne> lignes;
    private  String name;

    public Commande(String name) {
        this.name = name;
        this.lignes = new HashMap<String, Ligne>();
    }
    void addLigne(Ligne ligne){
        this.lignes.put(ligne.getName(),ligne);
    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        for(Ligne l: lignes.values()){
            l.accept(prePostVisitor);
            prePostVisitor.postVisit(this);
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
