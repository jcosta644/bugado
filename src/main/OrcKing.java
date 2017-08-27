package main;

/**
 * Created by HP on 27/08/2017.
 */
public class OrcKing {

    RequestHandler[] nodes = {new OrcOfficer(), new OrcSoldier(), new OrcCommander()};

    public OrcKing(){}

    public void makeRequest(Request req) {
        for(int i = 0; !nodes[i].handleRequest(req); i++){}
    }

}
