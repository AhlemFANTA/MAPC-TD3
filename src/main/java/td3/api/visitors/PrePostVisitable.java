package td3.api.visitors;

public interface PrePostVisitable extends AbstractVisitor {
    void accept(PrePostVisitor prePostVisitor);


}
