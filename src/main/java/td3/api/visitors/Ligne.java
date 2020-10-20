package td3.api.visitors;

import java.util.Objects;

public class Ligne implements PrePostVisitable{
    private String name;
    private int  sum;

    public Ligne(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        System.out.println("visit me");

    }
    public void accept(Visitor visitor){
        System.out.println("visite me");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ligne ligne = (Ligne) o;
        return sum == ligne.sum &&
                name.equals(ligne.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sum);
    }
}
