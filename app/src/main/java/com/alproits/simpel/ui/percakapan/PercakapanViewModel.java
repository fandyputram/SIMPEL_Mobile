package com.alproits.simpel.ui.percakapan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PercakapanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PercakapanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}