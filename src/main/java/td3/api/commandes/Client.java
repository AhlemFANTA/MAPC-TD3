package td3.api.commandes;

import td3.api.visitors.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Client implements Visitable, PrePostVisitable {

    private  String name;
    private Map<String,Commande> commandes;
    private Map<String,Ligne> lignes;

    public Client(String name) {
        this.name = name;
        this.commandes = new HashMap<>();
        this.lignes = new HashMap<>();
    }
    void addCommande(Commande commande){
        commandes.put(commande.getName(), commande);
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        for(Commande co:commandes.values()){
            co.accept(prePostVisitor);
            prePostVisitor.postVisit(this);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Commande commande : commandes.values()) commande.accept(visitor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void addLigne(Ligne ligne) {
        lignes.put(ligne.getName(), ligne);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
