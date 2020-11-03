package td3.api.commandes;

import td3.api.visitors.PrePostVisitable;
import td3.api.visitors.PrePostVisitor;
import td3.api.visitors.Visitable;
import td3.api.visitors.Visitor;

import java.util.Collection;
import java.util.HashMap;

public class Commande implements PrePostVisitable, Visitable {
    private  String name;
    private final HashMap<String, Ligne> lignes; // map nomLigne --> ligne

    public Commande(String name) {
        this.name = name;
        this.lignes = new HashMap<>();
    }
    void addLigne(Ligne ligne){
        lignes.put(ligne.getName(),ligne);
    }

    public Collection<Ligne> getLignes() {
        return lignes.values();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        for(Ligne l: lignes.values()){
            l.accept(prePostVisitor);
            prePostVisitor.postVisit(this);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Commande{" +
                "name='" + name + '\'' +
                '}';
    }
}
