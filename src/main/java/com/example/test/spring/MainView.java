package com.example.test.spring;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route("")
@StyleSheet(MainView.FRONTEND_STYLES_STYLES_CSS)
public class MainView extends VerticalLayout {

    static final String FRONTEND_STYLES_STYLES_CSS = "frontend://styles/styles.css";

    public MainView() {
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setSizeFull();
        addClassName("main-view");

        PartnerService service = new PartnerService(
            "https://sandbox.api.sap.com/s4hanacloud/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartner", 
            "S5Z7ku2uaH2NiZRShFXCWhQA1BEaAxHJ"
            );
        Paragraph p = new Paragraph(service.getPartners());     
        add(p);
        // H1 header = new H1("Vaadin Chat");
        // header.getElement().getThemeList().add("dark");
        // add(header);

        // askUserName();
    }

    // private void askUserName() {
    //     HorizontalLayout userNameLayout = new HorizontalLayout();
    //     TextField userNameField = new TextField();
    //     Button startButton = new Button("Start Chatting");
    //     userNameLayout.add(userNameField, startButton);

    //     startButton.addClickListener(click -> {
    //         String userName = userNameField.getValue();
    //         remove(userNameLayout);
    //         showChat();
    //     });

    //     add(userNameLayout);
    // }

    // private void showChat() {
    //     MessageList messageList = new MessageList();
    //     add(messageList, createInputLayout());
    //     expand(messageList);
    // }

    // private Component createInputLayout() {
    //     HorizontalLayout inpuLayout = new HorizontalLayout();
    //     inpuLayout.setWidth("100%");
    //     TextField messageField = new TextField();
    //     Button sendButton = new Button("Send!");
    //     sendButton.getElement().getThemeList().add("primary"); 
    //     inpuLayout.add(messageField, sendButton);
    //     inpuLayout.expand(messageField);
    //     return inpuLayout;
    // }

}
