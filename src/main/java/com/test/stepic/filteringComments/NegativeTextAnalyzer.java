package com.test.stepic.filteringComments;

public class NegativeTextAnalyzer extends  KeywordAnalyzer {
    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }
}
