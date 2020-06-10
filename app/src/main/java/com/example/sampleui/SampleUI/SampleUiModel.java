package com.example.sampleui.SampleUI;

import android.content.Context;

public class SampleUiModel {
    Context context;
    int userImage;
    String textView;

    public SampleUiModel(Context context,int userImage, String textView) {
        this.context = context;
        this.userImage = userImage;
        this.textView = textView;
    }
    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }
}
