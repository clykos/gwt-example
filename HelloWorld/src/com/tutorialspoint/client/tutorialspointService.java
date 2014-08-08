package com.tutorialspoint.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("tutorialspointService")
public interface tutorialspointService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use tutorialspointService.App.getInstance() to access static instance of tutorialspointServiceAsync
     */
    public static class App {
        private static tutorialspointServiceAsync ourInstance = GWT.create(tutorialspointService.class);

        public static synchronized tutorialspointServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
