package com.test.stepic.filteringComments;

public class TooLongTextAnalyzer  implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int length){
        this.maxLength=length;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength)
            return Label.TOO_LONG;
        else
            return Label.OK;
    }

}
