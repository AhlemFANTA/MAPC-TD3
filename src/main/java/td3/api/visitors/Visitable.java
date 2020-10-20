package td3.api.visitors;

public interface Visitable {
    void accept(Visitor visitor);
}
