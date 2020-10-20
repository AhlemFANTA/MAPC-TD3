package td3.api.visitors;

public class Ligne implements PrePostVisitable{
    private String name;
    private int  sum;

    public Ligne(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }
    public void accept(Visitor visitor){

    }
}
