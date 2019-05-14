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

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != Label.OK)
                return analyzers[i].processText(text);
        return Label.OK;
    }
}
