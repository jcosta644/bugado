package main;

/**
 * Created by HP on 27/08/2017.
 */
public class Request {

    private RequestType requestType;
    private String requestDescription;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

}
