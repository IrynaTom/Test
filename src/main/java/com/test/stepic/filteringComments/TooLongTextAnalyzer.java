package com.test.stepic.filteringComments;

public class TooLongTextAnalyzer extends  KeywordAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength){
        this.maxLength=maxLength;
    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }

    public Label processText(String text) {
        if(text.length()>maxLength){
            return Label.TOO_LONG;
        }
        return  Label.OK;
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != Label.OK)
                return analyzers[i].processText(text);
        return Label.OK;
    }

}
