package com.invaliddomain.myfirstproject;

public class DateTimeQuestionViewSeriesIdentifierFactory {
    private static int questionCounter = -1;
    public static int getNewQuestionId()
    {
        questionCounter += 1;
        return questionCounter;
    }
}
