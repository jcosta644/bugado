package main;

/**
 * Created by HP on 27/08/2017.
 */
public class OrcSoldier extends RequestHandler {


    public OrcSoldier() {
        super.setAble(RequestType.COLLECT_TAX);
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }
}
