package com.test.stepic.filteringComments;

public class TooLongTextAnalyzer extends  KeywordAnalyzer {
    private int maxLength;


    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }
}
