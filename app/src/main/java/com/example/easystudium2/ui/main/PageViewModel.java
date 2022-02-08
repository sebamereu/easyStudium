package com.example.easystudium2.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            switch (input) {
                case 1:
                    return "Qui sarà visualizzato il profilo con i grafici";

                case 2:
                    return "Qui sarà presente il calendario delle cosa da fare oggi";

                case 3:
                    return "Qui sarà presente il calendario per organizzare le prossime giornate";


            }
            return null;
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}