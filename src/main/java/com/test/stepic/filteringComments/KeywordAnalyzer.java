package com.test.stepic.filteringComments;

public abstract class KeywordAnalyzer implements TextAnalyzer  {
    private String[] Array;

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String text){
        String[] keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
