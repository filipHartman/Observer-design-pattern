package com.filip;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class NewsChannel implements PropertyChangeListener {

    public String news;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.news = ((String) evt.getNewValue());
    }
}
