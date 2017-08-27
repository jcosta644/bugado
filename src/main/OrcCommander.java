package main;

/**
 * Created by HP on 27/08/2017.
 */
public class OrcCommander extends RequestHandler {

    public OrcCommander() {
        super.setAble(RequestType.DEFEND_CASTLE);
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
