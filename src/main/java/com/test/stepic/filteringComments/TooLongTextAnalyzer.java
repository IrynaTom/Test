package com.test.stepic.filteringComments;

public class TooLongTextAnalyzer extends  KeywordAnalyzer {
    private int maxLength;
    private String[] keywords;

    public TooLongTextAnalyzer(int length){
        this.maxLength=length;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.TOO_LONG;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength)
            return Label.TOO_LONG;
        else
            return Label.OK;
    }

}
