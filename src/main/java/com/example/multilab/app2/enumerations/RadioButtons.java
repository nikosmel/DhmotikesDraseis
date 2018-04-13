package com.example.multilab.app2.enumerations;

import java.util.ArrayList;
import java.util.List;

public enum RadioButtons {
    ena("1","1"),
    duo("2","2"),
    tria("3","3"),
    tesera("4","4");

    RadioButtons(String label , String value){
        this.label = label;
        this.value = value;
    }

    private String label;

    private String value;

    public String getLabel() {
        return label;
    }

    public  String getValue(){ return value; }

    public static List<RadioButtons> getAllButtons(){
        List<RadioButtons> radioButtons = new ArrayList<>();
        radioButtons.add(ena);
        radioButtons.add(duo);
        radioButtons.add(tria);
        radioButtons.add(tesera);
        return radioButtons;
    }
}
