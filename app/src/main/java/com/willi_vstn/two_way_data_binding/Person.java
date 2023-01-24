package com.willi_vstn.two_way_data_binding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Person extends BaseObservable {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
