package manzana.rde.com.geoquiz;

/**
 * Created by Rodolfo on 30-Mar-18.
 */

public class TrueFalse {
    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    private int mQuestion;
    private boolean mTrueQuestion;
    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }
}
