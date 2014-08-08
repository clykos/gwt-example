package com.tutorialspoint.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tutorialspoint.client.tutorialspointService;

public class tutorialspointServiceImpl extends RemoteServiceServlet implements tutorialspointService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}