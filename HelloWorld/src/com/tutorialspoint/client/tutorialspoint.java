package com.tutorialspoint.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class tutorialspoint implements EntryPoint {
    public void onModuleLoad() {
        //create textboxes
        TextBox textBox1 = new TextBox();
        TextBox textBox2 = new TextBox();

        //add text to text box
        textBox2.setText("Hello World!");

        //set textbox as readonly
        textBox2.setReadOnly(true);

        // Add text boxes to the root panel.
        VerticalPanel panel = new VerticalPanel();
        panel.setSpacing(10);
        panel.add(textBox1);
        panel.add(textBox2);

        RootPanel.get("gwtContainer").add(panel);
    }
}