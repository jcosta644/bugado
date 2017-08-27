package main;

/**
 * Created by HP on 27/08/2017.
 */
public class OrcOfficer extends RequestHandler {
    public OrcOfficer() {
        super.setAble(RequestType.TORTURE_PRISONER);
    }

    @Override
    public String toString() {
        return "Orc officer";
    }
}
