package com.test.stepic.filteringComments;

public enum Label {
    SPAM,
    NEGATIVE_TEXT,
    TOO_LONG,
    OK

    private String symbols;
    private int MaxLength;


    Label(String symbols){
        this.symbols = symbols;
    }

    Label(int MaxLength){
        this.MaxLength= MaxLength;
    }


}
