package td3.api.visitors;

import java.util.Objects;

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
}
