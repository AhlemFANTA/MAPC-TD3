package td3.api.visitors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class GroupeClient implements PrePostVisitable{
    private String name;
    private static Collection<Client> clients = new ArrayList<>();

    public GroupeClient(String name, Collection<Client> groupeDeClients ) {
        this.name = name;
        this.clients = groupeDeClients;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }
}
