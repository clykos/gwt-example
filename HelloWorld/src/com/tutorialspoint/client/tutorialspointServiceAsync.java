package com.tutorialspoint.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface tutorialspointServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
