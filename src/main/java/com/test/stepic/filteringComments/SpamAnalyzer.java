package com.test.stepic.filteringComments;

public class SpamAnalyzer extends  KeywordAnalyzer{

    private String[] keywords;

    SpamAnalyzer((String[] keywords ){
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }
}
