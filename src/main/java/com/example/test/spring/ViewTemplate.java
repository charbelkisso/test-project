package com.example.test.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class ViewTemplate extends VerticalLayout{

    
    private H1 header;
    private HorizontalLayout horizontalLayoutButtons;
    private Button home;
    private Button contactUs;
    private Button aboutUs;
    
    
    
    public ViewTemplate(){
        
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setSizeFull();
        addClassName("main-view");
        
        initControlls();
    }


    private void initControlls(){
         
        header = new H1();
        horizontalLayoutButtons = new HorizontalLayout();
        horizontalLayoutButtons.getElement().getThemeList().add("Left");
        home = new Button("Home");
        contactUs = new Button("Contact Us");
        aboutUs = new Button("About Us");

        horizontalLayoutButtons.add(home,contactUs, aboutUs);
        header.add(horizontalLayoutButtons);
        add(header);

    }


    
    
}