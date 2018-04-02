package com.example.mac.takehomeassignment07_yup;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question() {
    }

    public Question(int mTextResId, boolean mAnswerTrue) {
        this.mTextResId = mTextResId;
        this.mAnswerTrue = mAnswerTrue;
    }


    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }


}
