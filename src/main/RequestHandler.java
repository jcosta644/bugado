package main;

/**
 * Created by HP on 27/08/2017.
 */
public abstract class RequestHandler {
    private RequestType able;

    public boolean handleRequest(Request req) {
        if(req.getRequestType().equals(this.getAble())) {
            System.out.println(this.toString() + " handling request " + req.getRequestDescription());
            return true;
        } else {
            return false;
        }
    }

    public RequestType getAble() {
        return able;
    }

    public void setAble(RequestType able) {
        this.able = able;
    }

    @Override
    public abstract String toString();
}
